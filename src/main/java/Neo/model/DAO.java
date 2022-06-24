/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Neo.model;

import Neo.db.ConexionDB;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.neo4j.driver.Value;

//Map<String, Object> params = new HashMap<>();
//params.put( "year", 2000 );

/**
 *
 * @author aleja
 */
public class DAO {
    
    private ConexionDB db;
    private Driver driver;

    public DAO() {
        this.db = new ConexionDB();
        this.driver = db.getDriver();
    }
   
    public ArrayList<MovieCastDTO> getMovieCast(String title)
    {
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (movie:Movie {title:$title})"
                + " OPTIONAL MATCH (movie)<-[r]-(person:Person)" 
                + " RETURN movie.title as title, movie.released as released, movie.tagline as tagline,"
                + "collect({name:person.name, job:head(split(toLower(type(r)),'_')), role:r.roles}) as cast";
            
            var result = session.readTransaction( tx -> 
                    tx.run(cypherQuery, 
                    Map.of("title", title)).list(r -> r.asMap())
            );

            Gson gson = new Gson();
            var jsonResult = gson.toJson(result);
            
            System.out.println(result);
            
//            MovieCastDTO[] mc_obj = gson.fromJson( jsonResult, MovieCastDTO[].class);
            ArrayList<MovieCastDTO> mc_obj = gson.fromJson( jsonResult, new TypeToken<List<MovieCastDTO>>(){}.getType());

//            System.out.println(mc_obj.getTitle());
//            System.out.println(mc_obj.getCast());
//            for (MovieCastDTO m : mc_obj) {
//                System.out.println(m.getTitle());
//                System.out.println(m.getCast());
//            }
            
            return mc_obj;
        }        
    }
    
    
    public ArrayList<MovieDTO> getMovies()
    {
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (n:Movie) RETURN n.title as title, n.released as released, n.tagline as tagline";

            var result = session.readTransaction( tx -> 
                    tx.run(cypherQuery).list(r -> r.asMap())
            );
                  
            Gson gson = new Gson();
            var jsonResult = gson.toJson(result);
//            System.out.println(jsonResult);
            
            ArrayList<MovieDTO> mc_obj = gson.fromJson( jsonResult, new TypeToken<List<MovieDTO>>(){}.getType());
            return mc_obj;
        }        
    }
    
    
    public ArrayList<PersonDTO> getPersons()
    {    
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (n:Person) RETURN n.name as name, n.born as born";

            var result = session.readTransaction( tx -> 
                    tx.run(cypherQuery).list(r -> r.asMap())
            );
                  
            Gson gson = new Gson();
            var jsonResult = gson.toJson(result);
//            System.out.println(jsonResult);
            
            ArrayList<PersonDTO> mc_obj = gson.fromJson( jsonResult, new TypeToken<List<PersonDTO>>(){}.getType());
            return mc_obj;
        }        
    }
    
    
    public PersonMoviesDTO[] getPersonMovies(String name)
    {       
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (person:Person {name:$name}) "
                    + "OPTIONAL MATCH (person)-[r]->(movie:Movie) " 
                    + "RETURN person.name as name, person.born as born, collect({movie:movie.title,"
                    + "job:head(split(toLower(type(r)),'_')), role:r.roles}) as movies";

            var result = session.readTransaction( tx -> 
                    tx.run(cypherQuery, 
                            Map.of("name", name)).list(r -> r.asMap())
            );
                              
            Gson gson = new Gson();
            var jsonResult = gson.toJson(result);
//            System.out.println(jsonResult);
            
            PersonMoviesDTO[] mc_obj = gson.fromJson( jsonResult, PersonMoviesDTO[].class);
            return mc_obj;
        }        
    }
    
    
    // CREATE NODES *********************
    
    // Nodo label: Movie
    public Value createMovie(String title, int released, String tagline)
    {        
        try ( Session session = driver.session() )
        {
            String cypherQuery = "CREATE (m:Movie {title:$title, released:$released, tagline:$tagline}) return true";
            
            var result = session.writeTransaction( tx ->
                    {
                        var result2 = tx.run( cypherQuery, Map.of( "title", title, "released", released, "tagline", tagline ) );
                        return result2.single().get( 0 );
                    });
                    
            return result;
        }        
    }
    
    
    // Nodo label: Person
    public Value createPerson(String name, int born)
    {
        try ( Session session = driver.session() )
        {
            String cypherQuery = "CREATE (Keanu:Person {name: $name, born: $born }) return true";
            
            var result = session.writeTransaction( tx ->
                    {
                        var result2 = tx.run( cypherQuery, Map.of( "name", name, "born", born) );
                        return result2.single().get( 0 );
                    });
                    
            return result;
        } 
    }
    
    
    // Create RelationsShips *********************
    
    // ACTED_IN
    // REVIEWED

    // DIRECTED
    // FOLLOWS
    // PRODUCED
    // WROTE
    
    // relationship person acted_in movie
    public void createRelationACTED_IN(String person, String movie, Map<String, List<String>> roles)
    {
        String relation = "ACTED_IN";
        
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (a:Person), (b:Movie) WHERE a.name = $name AND b.title = $title "
                    + "CREATE (a)-[:" + relation + " $roles]->(b)";
            
            var result = session.writeTransaction( tx ->
                    {
                        var result2 = tx.run( 
                                cypherQuery, Map.of( 
                                        "name", person, 
                                        "title", movie,  
                                        "roles", roles
                                ) 
                        );
                        return result2;
                    });
        } 
    }
    
    
    // relationship person acted_in movie
    public void createRelationREVIEWED( String person, String movie, Map<String, String> params )
    {
        String relation = "REVIEWED";
        
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (a:Person), (b:Movie) WHERE a.name = $name AND b.title = $title "
                    + "CREATE (a)-[:" + relation + " $roles]->(b)";
            
            var result = session.writeTransaction( tx ->
                    {
                        var result2 = tx.run( 
                                cypherQuery, Map.of( 
                                        "name", person, 
                                        "title", movie,  
                                        "roles", params
                                ) 
                        );
                        return result2;
                    });
        } 
    }
    
    
     // relationship person acted_in movie
    public void createRelationFOLLOWS( String person1, String person2 )
    {
        String relation = "FOLLOWS";
        
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (a:Person), (b:Person) WHERE a.name = name1 AND b.name = $name2 "
                    + "CREATE (a)-[:" + relation + "]->(b)";
            
            var result = session.writeTransaction( tx ->
                    {
                        var result2 = tx.run( 
                                cypherQuery, Map.of( 
                                        "name1", person1, 
                                        "name2", person2
                                ) 
                        );
                        return result2;
                    });
        } 
    }
    
    
    public void createRelationDIRECTED(String person, String movie)
    {
        String relation = "DIRECTED";
        
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (a:Person), (b:Movie) WHERE a.name = $name AND b.title = $title "
                    + "CREATE (a)-[:" + relation + "]->(b)";
            
            var result = session.writeTransaction( tx ->
                    {
                        var result2 = tx.run( 
                                cypherQuery, Map.of( 
                                        "name", person, 
                                        "title", movie
                                ) 
                        );
                        return result2;
                    });
        } 
    }
    
    
     public void createRelationPRODUCED(String person, String movie)
    {
        String relation = "PRODUCED";
        
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (a:Person), (b:Movie) WHERE a.name = $name AND b.title = $title "
                    + "CREATE (a)-[:" + relation + "]->(b)";
            
            var result = session.writeTransaction( tx ->
                    {
                        var result2 = tx.run( 
                                cypherQuery, Map.of( 
                                        "name", person, 
                                        "title", movie
                                ) 
                        );
                        return result2;
                    });
        } 
    }
     
     
    public void createRelationWROTE( String person, String movie )
    {
        String relation = "WROTE";
        
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (a:Person), (b:Movie) WHERE a.name = $name AND b.title = $title "
                    + "CREATE (a)-[:" + relation + "]->(b)";
            
            var result = session.writeTransaction( tx ->
                    {
                        var result2 = tx.run( 
                                cypherQuery, Map.of( 
                                        "name", person, 
                                        "title", movie
                                ) 
                        );
                        return result2;
                    });
        } 
    }    
    
    // DELETE NODES *****************************
    public void deletePerson( String person)
    {     
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (p:Person {name: $name}) DELETE p";
            
            var result = session.writeTransaction( tx ->
                    {
                        var result2 = tx.run( 
                                cypherQuery, Map.of("name", person) 
                        );
                        return result2;
                    });
        } 
    } 
    
    
    public void deleteMovie( String title)
    {        
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (m:Movie {title: $title}) DELETE m";
            
            var result = session.writeTransaction( tx ->
                    {
                        var result2 = tx.run( 
                                cypherQuery, Map.of("title", title) 
                        );
                        return result2;
                    });
        } 
    }
    
    // DELETE RELATIONSHIPS ****************************
    
    public void deleteRelationPM( String name, String title, String relation)
    {        
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (m:Person {name: $name})-[r:"+relation+"]->(m:Movie {title: $title}) DELETE r";
            
            var result = session.writeTransaction( tx ->
                    {
                        var result2 = tx.run( 
                                cypherQuery, Map.of("name", name, "title", title) 
                        );
                        return result2;
                    });
        } 
    }
    
    
    public void deleteRelationPP( String name1, String name2, String relation)
    {        
        try ( Session session = driver.session() )
        {
            String cypherQuery = "MATCH (m:Person {name: $name1})-[r:"+relation+"]->(m:Person {name: $name2}) DELETE r";
            
            var result = session.writeTransaction( tx ->
                    {
                        var result2 = tx.run( 
                                cypherQuery, Map.of("name1", name1, "name2", name2) 
                        );
                        return result2;
                    });
        } 
    }
    
    
    
    //Map<String, Object> params = new HashMap<>();
    //params.put( "year", 2000 );
}

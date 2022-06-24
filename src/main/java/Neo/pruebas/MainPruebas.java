/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Neo.pruebas;

import Neo.db.ConexionDB;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.neo4j.driver.Session;
/**
 *
 * @author aleja
 */
public class MainPruebas {
    
    public static void main(String[] args)
    {
        
        ConexionDB db  = new ConexionDB();
        var driver = db.getDriver();
        
         try ( Session session = driver.session() )
        {
            
            // obtener nodo con relaciones ******************************************************
            String cypherQuery = "MATCH (movie:Movie {title:$title})" +
                        " OPTIONAL MATCH (movie)<-[r]-(person:Person)\n" +
                        " RETURN movie.title as title, collect({name:person.name, job:head(split(toLower(type(r)),'_')), role:r.roles}) as cast LIMIT 1";
            
            //Map<String, Object> params = new HashMap<>();
            //params.put( "year", 2000 );
        
            var result = session.readTransaction(tx -> tx.run(cypherQuery, 
                    Map.of("title", "Cloud Atlas", "released", "1999", "tagline", "Welcome to the Real World")).list(r -> r.asMap())
            );
//            System.out.println(result.getClass().getSimpleName());
            
            
            
            Gson gson = new Gson();
            var json = gson.toJson(result);
            System.out.println(json);            
            
            JsonParser parser = new JsonParser();

             // Obtain Array
            JsonArray gsonArr = parser.parse(json).getAsJsonArray();
           
//            System.out.println(jo.get("title"));
            
            for(JsonElement obj  : gsonArr) {
                
//                System.out.println( "[title]: "+ map.get("title") + " [cast]: " +  map.get("cast").getClass().getSimpleName());
                JsonObject gsonObj = obj.getAsJsonObject();
                System.out.println(gsonObj.get("title"));
//                System.out.println(gsonObj.get("cast"));
//                System.out.println(gsonObj.get("cast").getClass().getSimpleName());
                
                
                JsonArray demarcation = gsonObj.get("cast").getAsJsonArray();
//                List listDemarcation = new ArrayList();
                
                for (JsonElement demarc : demarcation) {
                    JsonObject gsonObj2 = demarc.getAsJsonObject();
                    System.out.println(gsonObj2.get("name") +" "+ gsonObj2.get("role") +" "+ gsonObj2.get("job") +" ");
//                    System.out.println(demarc.getAsJsonArray());
//                    listDemarcation.add(demarc);
                    
                }

//                for(JsonElement obj  : gsonObj.get("cast")) {
//                    JsonObject gsonObj = obj.getAsJsonObject();
//                }
//                var rows = map.get("cast").toString().toCharArray();
//                System.out.println(rows);
//                
//                for(char row :  rows){
//                    System.out.println();
//                }
                 
//                map.forEach((t, u) -> {
//                    // agregar al DTO
//                    System.out.println(t.toString() + " " + u);
//                });
            }
            
            
            // crear nodo ******************************************************
            
            String cypherQuery2 = "CREATE (PruebaM:Movie {title: $title, released: $released, tagline: $tagline})";
            
            var result2 = session.readTransaction(tx -> tx.run(cypherQuery, 
                    Map.of("title", "Prueba Movie", "released", "1999", "tagline", "Andres Duque")).list(r -> r.asMap())
            );
            
            // consultar un nodo ******************************************************
//            String cypherQuery3 = "CREATE (PruebaM:Movie {title: $title, released: $released, tagline: $tagline})";
//            
//            var result3 = session.readTransaction(tx -> tx.run(cypherQuery, 
//                    Map.of("title", "Prueba Movie", "released", "1999", "tagline", "Andres Duque")).list(r -> r.asMap())
//            );
            
            
        }




         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         //        String cypherQuery = "MATCH (nineties:Movie) WHERE nineties.released >= 1990 AND nineties.released < $year RETURN nineties as nineties";
////        String cypherQuery = "MATCH (nineties:Movie) WHERE nineties.released >= 1990 AND nineties.released < $year RETURN nineties.title as title";

//        
//        
//        var r = db.query(cypherQuery, params, driver);
//        System.out.println(r);
//        
        
//        var result = db.query("MATCH (movie:Movie {title:$title})" +
//                        " OPTIONAL MATCH (movie)<-[r]-(person:Person)\n" +
//                        " RETURN movie.title as title, collect({name:person.name, job:head(split(toLower(type(r)),'_')), role:r.roles}) as cast LIMIT 1",
//                Map.of("title", "The Birdcage"), driver);
//        System.out.println(result.getClass().getSimpleName());
        
//        var result = db.query("CREATE (PruebaM:Movie {title: $title, released: $released, tagline: $tagline})", 
//                Map.of("title", "PruebaM", "released", "1999", "tagline", "Welcome to the Real World"),
//                driver);
//        System.out.println(result);
//        System.out.println(result.get(0));
//        System.out.println(result.getClass().getSimpleName());
        
        
        
//        result.isEmpty() ? Map.of(result.get(0));
//        if(!result.isEmpty()){
//             var map = result.get(0);
//             System.out.println(map);
//        }
//        
//        var reas;
        
//        while (result.hasNext())
//            {
//                res.add(result.next().fields().get(0).value().asMap());
//            }
//            System.out.println(nodeList);
            
        
        
//        
        
        
        
        
//        var result = db.executeCypherQuery(cypherQuery, params, driver);




         
         
         
         
         
         
         
         
         
         
         
         
         













////            var result = session.run(cypherQuery, parameters("year",2000));
//            Result result = session.run(cypherQuery, params);
//            
////            traer nodos con varias propiedades, que no se conocen
////            List<Map<String,Object>> nodeList=  new ArrayList<>();
////            while (result.hasNext())
////            {
////                nodeList.add(result.next().fields().get(0).value().asMap());
////            }
////            System.out.println(nodeList);
////            
//            
//            
//            
////            for(Map<String,Object> map : nodeList) {
////                
////                System.out.println( "[tagline]: "+ map.get("tagline") + " [title]: " + map.get("title") + " [released]: " + map.get("released") );
//////                map.forEach((t, u) -> {
//////                    // agregar al DTO
//////                    System.out.println(t.toString() + " " + u);
//////                });
////            }
//
////            traer nodos con propiedades seleccionadas            
//            result.list().forEach(record -> 
//            {
////                System.out.println(record.fields().get(0).value().asMap());
//                var map = record.fields().get(0).value().asMap();
//                
////                System.out.println(map.get("tagline"));
////                System.out.println(record.get("nineties.properties").asString());
//            });
//            
            
//        }       
  }

}

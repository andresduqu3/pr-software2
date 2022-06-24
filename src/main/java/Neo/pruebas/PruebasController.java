/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Neo.pruebas;

import Neo.controller.Controller;
import Neo.model.DAO;
import Neo.model.MovieCastDTO;
import Neo.model.MovieDTO;
import Neo.model.PersonDTO;
import Neo.model.PersonMoviesDTO;
import com.google.common.base.Splitter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.neo4j.driver.Values;

/**
 *
 * @author aleja
 */
public class PruebasController {
    public static void main(String[] args)
    {
        Controller ctrl = new Controller();
        
        
//        var b = ctrl.getMovieCast("Cloud Atlas");
//         for (MovieCastDTO m : b) {
//            System.out.println(m.getTitle());
//            System.out.println(m.getReleased());
//            System.out.println(m.getTagline());
//            System.out.println(m.getCast());
//        }


        // movies
//        var c = ctrl.getMovies();
//        for (MovieDTO m : c) {
//            System.out.println(m.getTitle());
//            System.out.println(m.getTagline());
//            System.out.println(m.getReleased());
//        }
        

        //persons
//        var d = ctrl.getPersons();
//        for (PersonDTO m : d) {
//            System.out.println(m.getName());
//            System.out.println(m.getBorn());
//        }
        

        // Person with movies
//        var d = ctrl.getPersonMovies("Jessica Thompson");
//        for (PersonMoviesDTO m : d) {
//            System.out.println(m.getName());
//            System.out.println(m.getBorn());
//            System.out.println(m.getMovies());
////            m.getMovies().forEach((t) -> {
////                System.out.println(t.getRole());
////            });
//        }

        // Create Movie
//        var e = ctrl.createMovie("Duque4", 1999, "Duque Producciones");
//        System.out.println(e);


        // Create Person
//        var f = ctrl.createPerson("Juan Duque", 1999);
//        System.out.println(f);

        


//        String a = "name:Andres Duque, born:1999";
//        
//        var properties = Splitter.on(",")
//        .withKeyValueSeparator(":")
//        .split(a);
//        
//        System.out.println(properties);
//        
//        ArrayList<String> al = new ArrayList<>();
//        al.add("Geeks1");
//        al.add("Geeks2");
//        

//        
//        System.out.println(z);
//        System.out.println(z.get("name"));
//        
//        System.out.println(z);
        
       

        // create relation person - [ACTED_IN {roles:[]}] -> movie
        
        // parametros para la relacion -- Obligatorios
//        Map<String, List<String>> list = new HashMap<>();
//        list.put("roles", Arrays.asList("toyota", "bmw", "honda"));
//        System.out.println(list);
        
//        ctrl.createRelationACTED_IN("Juan Duque", "Duque", list);
        

// verificar las demas relaciones

        // create relation person - [REVIEWED {summary:'An amazing journey', rating:95}] -> movie        
//        var ff = Map.of( "summary", "An amazing journey", "rating", "95");
//        System.out.println(ff);
//        ctrl.createRelationREVIEWED("Juan Duque", "Duque", ff);


//        String moive = "atlas";
//        System.out.println(moive.getClass().getFields());

    }
}

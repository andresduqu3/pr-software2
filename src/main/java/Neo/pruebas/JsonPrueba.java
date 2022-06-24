/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Neo.pruebas;

import Neo.model.MovieCastDTO;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 *
 * @author aleja
 */
public class JsonPrueba {
    
   
    
    
    public static void main(String[] args)
    {
         String jsonAll  = "[\n" +
        "    {\n" +
        "        \"title\": \"real\",\n" +
        "        \"cast\": \n" +
        "        [\n" +
        "            {\n" +
        "                \"name\":\"Tom Hanks\",\n" +
        "                \"role\":[\n" +
        "                    \"Zachry\",\"Dr. Henry Goose\",\"Isaac Sachs\",\"Dermot Hoggins\"\n" +
        "                ],\n" +
        "                \"job\":\"acted\"\n" +
        "            }\n" +
        "           \n" +
        "        ]\n" +
        "    }\n" +
        "]";
         
         
         
        Gson gson = new Gson();
        MovieCastDTO[] movie = gson.fromJson( jsonAll, MovieCastDTO[].class);
        
        String jsonInString = gson.toJson(movie);
			
        System.out.println(jsonInString);

        for (MovieCastDTO m : movie) {
            System.out.println(m.getTitle());
            System.out.println(m.getCast());
        }
        
        
//        System.out.println(json1);
//        JsonParser parser = new JsonParser();
//
//        // Obtain Array
//        JsonArray gsonArr = parser.parse(json1).getAsJsonArray();
//
//        // for each element of array
//        for (JsonElement obj : gsonArr) {
//
//            // Object of array
//            JsonObject gsonObj = obj.getAsJsonObject();
//
//            // Primitives elements of object
//            System.out.println(gsonObj.get("equipo"));
//            System.out.println(gsonObj.get("cast"));
//            int dorsal = gsonObj.get("equpi").getAsInt();
//            String name = gsonObj.get("name").getAsString();
//            String team = gsonObj.get("team").getAsString();
//
//            // List of primitive elements
//            JsonArray demarcation = gsonObj.get("demarcation").getAsJsonArray();
//            List listDemarcation = new ArrayList();
//            for (JsonElement demarc : demarcation) {
//                listDemarcation.add(demarc.getAsString());
//            }
//
//            // Object Constructor
//            FootballPlayer iniesta = new FootballPlayer(dorsal, name,
//                    listDemarcation, team);
//            System.out.println(iniesta);
//        }
    }
    
}

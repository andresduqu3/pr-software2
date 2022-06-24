package Neo.pruebas;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.duque.pruebas;
//
//import com.duque.db.ConexionDB;
//import com.google.gson.Gson;
//import java.util.HashMap;
//import java.util.Map;
//import org.neo4j.driver.Result;
//import org.neo4j.driver.Session;
//
///**
// *
// * @author aleja
// */
//public class Pruebas2 {
//    
//        public static void main(String[] args)
//    {
//        
//        ConexionDB db  = new ConexionDB();
//        var driver = db.getDriver();
//        
//        String cypherQuery = "MATCH (nineties:Movie) WHERE nineties.released >= 1990 AND nineties.released < $year RETURN nineties as nineties";
//
//        try ( Session session = driver.session() )
//        {
//            Iterable<Map<String,Object>> result = (Iterable<Map<String,Object>>) session.readTransaction((t) -> {
//                t.run
//                return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
//            }cypherQuery, Map.of("year", 2000));
//            
//            result.forEach((t) -> {
//                System.out.println(t);
////                System.out.println(t.get("cast"));
////                Gson gson = new Gson();
////                var jsonResult = gson.toJson(t);
////                System.out.println(jsonResult);
////                
//                
//            });
//        }       
//  }
//
//}

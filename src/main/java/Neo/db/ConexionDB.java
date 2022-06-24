/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Neo.db;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;

/**
 *
 * @author aleja
 */
public class ConexionDB implements AutoCloseable{
    private Driver driver;
    private String uri = "bolt://localhost:7687";
    private String user = "neo4j";
    private String password = "password";
   
    public Driver getDriver()
    {
        driver = GraphDatabase.driver( uri, AuthTokens.basic( user, password ) );
        return driver;
    }
        
    @Override
    public void close() throws Exception
    {
        driver.close();
    }
    
    
//    public List<Map<String, Object>> query(String query, Map<String, Object> params, Driver driver_n) {
//        try (Session session = driver_n.session()) {
//            return session.readTransaction(
//                    tx -> tx.run(query, params).list(r -> r.asMap(ConexionDB::convert))
//            );
//        }
//    }
//    
//    public static Object convert(Value value) {
//        switch (value.type().name()) {
//            case "PATH":
//                return value.asList(ConexionDB::convert);
//            case "NODE":
//            case "RELATIONSHIP":
//                return value.asMap();
//        }
//        return value.asObject();
//    }
         
}
package Mongo.DAO;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author richa
 */
public class ConexionMongo {

    private static String server = "localhost";
    private static int puerto = 27017;
    private static String base = "'baseProyecto'";
    private static MongoClient mongo = null;
    private static DB db = null;

    public static MongoDatabase getConexion() {
        try {
            // Connect to MongoDB Server on localhost, port 27017 (default)
            final MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
            // Connect to Database "cartoon"
            final MongoDatabase database = mongoClient.getDatabase("'baseProyecto'");
            System.out.println("Successful database connection established. \n");
            return database;
        } catch (Exception exception) {
            System.err.println(exception.getClass().getName() + ": " + exception.getMessage());
            return null;
        }
    }
    public  static DB getConexionDB(){
         
        
        try {
            mongo=new MongoClient(server,puerto);
            //List<String> nombre=mongo.getDatabaseNames();
            //System.out.println(nombre.toString());
        } catch (MongoException e) {
        }
        db=mongo.getDB("'baseProyecto'");
        return db;
    
    }

//        try {
//            mongo=new MongoClient(server,puerto);
//            //List<String> nombre=mongo.getDatabaseNames();
//            //System.out.println(nombre.toString());
//        } catch (MongoException e) {
//        }
//        db=mongo.getDB("'baseProyecto'");
//        return db;
//    
}



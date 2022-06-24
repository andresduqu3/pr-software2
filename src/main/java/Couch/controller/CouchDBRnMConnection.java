/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couch.controller;

import java.net.MalformedURLException;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;
import org.ektorp.support.CouchDbDocument;

/**
 *
 * @author krancruz
 */
public class CouchDBRnMConnection {

    private static CouchDBRnMConnection con = null;
    private static CouchDbConnector db = null;
    private static CouchDbInstance dbInstance = null;

    public static CouchDBRnMConnection getConnection() {
        //--------------- Creating Connection--------------------------//  
        if (con == null) {
            con = new CouchDBRnMConnection();
            try {
                HttpClient httpClient = new StdHttpClient.Builder()
                        .url("http://localhost:5984")
                        .username("admin")
                        .password("couchdb")
                        .build();
                dbInstance = new StdCouchDbInstance(httpClient);
                //--------------- Creating database----------------------------//  
                db = new StdCouchDbConnector("RickAndMorty", dbInstance);
                db.createDatabaseIfNotExists();
            } catch (MalformedURLException e) {
                System.out.println("Connection error: " + e.getMessage());
            }
        }
        return con;
    }

    public static CouchDBRnMConnection getCon() {
        return con;
    }

    public static void setCon(CouchDBRnMConnection con) {
        CouchDBRnMConnection.con = con;
    }

    public static CouchDbConnector getDb() {
        return db;
    }

    public static void setDb(CouchDbConnector db) {
        CouchDBRnMConnection.db = db;
    }

    public static CouchDbInstance getDbInstance() {
        return dbInstance;
    }

    public static void setDbInstance(CouchDbInstance dbInstance) {
        CouchDBRnMConnection.dbInstance = dbInstance;
    }
}

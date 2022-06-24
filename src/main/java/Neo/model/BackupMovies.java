/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Neo.model;

import Neo.controller.Controller;
import java.io.PrintWriter;

/**
 *
 * @author osboxes
 */
public class BackupMovies {
    
    public void Backup(){
        
        Controller ctrl = new Controller();
        
        var movies = ctrl.getMovies();
        
        try {   
            
            PrintWriter writer = new PrintWriter("./Respaldos/Backup-Neo4J.txt", "UTF-8");
            writer.println("title, released, tagline");
            for (MovieDTO dto: movies ) {
                writer.println(dto.toString());
            }        
            
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }     

    }
    
}

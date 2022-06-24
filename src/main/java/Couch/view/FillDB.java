/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couch.view;

import Couch.model.TEDTalkDAO;
import Couch.DTO.TEDTalkDTO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author krancruz
 */
public class FillDB {
    public static void main(String[] args) {
        TEDTalkDAO talks = new TEDTalkDAO();
        
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/data.csv"))) {
            String line = br.readLine();
            line = br.readLine();
            
            while (line != null){
                String[] attr = line.split("¬");
                
                TEDTalkDTO talk = new TEDTalkDTO(attr);
                System.out.println(attr);
                talks.postTedTalk(talk);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Reading error: " + e.getMessage());
        }
        /*for (var tedTalk : talks.getTedTalks()) {
            System.out.println(tedTalk.getTitle());
        }*/
    }
}

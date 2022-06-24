/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couch.view;

import com.google.gson.Gson;
import Couch.model.TEDTalkDAO;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author krancruz
 */
public class getJsonDB {
    public static void main(String[] args) {
        TEDTalkDAO talk = new TEDTalkDAO();
        Gson gson = new Gson();
        String str = "{\"TEDTalks\":" + gson.toJson(talk.getTedTalks()) + "}";
        System.out.println(str);
        try (FileWriter file = new FileWriter("src/main/resources/TEDTalks.json")) {
            file.write(str);
            file.flush();
        } catch (IOException e) {
            System.out.println("TT.toJson error: " + e.getMessage());
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couch.view;

import com.google.gson.Gson;
import Couch.model.RickAndMortyDAO;
import java.io.FileWriter;
import java.io.IOException;
    
/**
 *
 * @author krancruz
 */
public class getJsonRnM {
    public static void main(String[] args) {
        RickAndMortyDAO chara = new RickAndMortyDAO();
        //System.out.println(chara.getCharacters());
        Gson gson = new Gson();
        String str = "{\"RickAndMorty\":" + gson.toJson(chara.getCharacters()) + "}";
        System.out.println(str);
        try (FileWriter file = new FileWriter("src/main/resources/RickAndMorty.json")) {
            file.write(str);
            file.flush();
        } catch (IOException e) {
            System.out.println("RnM.toJson error: " + e.getMessage());
        }
    }
}

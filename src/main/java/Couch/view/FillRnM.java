/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couch.view;

import Couch.DTO.CharacterDTO;
import com.google.gson.Gson;
import Couch.model.RickAndMortyDAO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

/**
 *
 * @author krancruz
 */
public class FillRnM {

    public static void main(String[] args) {
        for (int i = 1; i <= 826; i++) {
            RickAndMortyDAO rnm = new RickAndMortyDAO();
            String jsonText;
            try {
                InputStream is = new URL("https://rickandmortyapi.com/api/character/" + i).openStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
                StringBuilder sb = new StringBuilder();
                String line;
                int count = 0;
                
                while ((line = rd.readLine()) != null) {
                    if (count<4) {
                        count++;
                    } else if (count==4) {
                        line = line.substring(0, 3)+"_"+line.substring(3);
                    }
                    sb.append(line);
                }
                jsonText = sb.toString();
                is.close();
                Gson gson = new Gson();
                System.out.println(jsonText);
                CharacterDTO character = gson.fromJson(jsonText, CharacterDTO.class);
                System.out.println(character.toString());
                rnm.postCharacter(character);
            } catch (IOException e) {
                System.out.println("IOException: " + e.getMessage());
            }

        }
    }
}

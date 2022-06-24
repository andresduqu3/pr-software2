/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couch.model;

import Couch.DTO.CharacterDTO;
import Couch.controller.CouchDBRnMConnection;
import java.util.ArrayList;

/**
 *
 * @author krancruz
 */
public class RickAndMortyDAO {
    
    private CouchDBRnMConnection conn = CouchDBRnMConnection.getConnection();

    public ArrayList<CharacterDTO> getCharacters(){
        ArrayList<CharacterDTO> list = new ArrayList();
        var _ids = conn.getDb().getAllDocIds();
        System.out.println(_ids);

        for (String _id : _ids) {
            var chara = conn.getDb().get(CharacterDTO.class, _id);
            list.add(chara);
        }
        return list;
    }
    
    public CharacterDTO getCharacter(String _id){
        System.out.println(_id);
        CharacterDTO chara = conn.getDb().get(CharacterDTO.class, _id);
        return chara;
    }
    
    public void postCharacter(CharacterDTO chara) {
        conn.getDb().create(chara);
    }
    
    public void putCharacter(CharacterDTO chara) {
        conn.getDb().update(chara);
    }
}

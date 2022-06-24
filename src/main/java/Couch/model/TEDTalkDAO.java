/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couch.model;

import Couch.DTO.TEDTalkDTO;
import Couch.controller.CouchDBConnection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author krancruz
 */
public class TEDTalkDAO {

    private CouchDBConnection conn = CouchDBConnection.getConnection();

    public List<TEDTalkDTO> getTedTalks() {
        List<TEDTalkDTO> list = new ArrayList<>();
        var _ids = conn.getDb().getAllDocIds();

        for (String _id : _ids) {
            var talk = conn.getDb().get(TEDTalkDTO.class, _id);
            list.add(talk);
        }
        return list;
    }

    public TEDTalkDTO getTedTalk(String _id) {
        TEDTalkDTO talk;
        talk = conn.getDb().get(TEDTalkDTO.class, _id);

        return talk;
    }

    public void postTedTalk(TEDTalkDTO talk) {
        conn.getDb().create(talk);
    }
    
    public void putTedTalk(TEDTalkDTO talk) {
        conn.getDb().update(talk);
    }
    
    public void deleteTedTalk(TEDTalkDTO talk) {
        conn.getDb().delete(talk);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Controladores.Tabla;
import Couch.DTO.CharacterDTO;
import Couch.DTO.TEDTalkDTO;
import Couch.model.RickAndMortyDAO;
import Couch.model.TEDTalkDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krancruz
 */
public class CouchController {
    
    public DefaultTableModel tableTT() {
        Tabla table= new Tabla();
        DefaultTableModel modelo = new DefaultTableModel();
        String cols[] = {"Title", "Author", "Date",
            "Views", "Likes", "Link"};
        TEDTalkDAO x = new TEDTalkDAO();
        ArrayList<String[]> rows = this.listTedTalks();
        System.out.println(rows.toString());
        return table.contruir_tabla(rows, cols);
    }
    
    public ArrayList<String[]> listTedTalks() {
        TEDTalkDAO talks = new TEDTalkDAO();
        var list = talks.getTedTalks();
        ArrayList<String[]> rtrn = new ArrayList();
        for (TEDTalkDTO tedTalk : list) {
            String[] tmp = {
            tedTalk.getTitle(),
            tedTalk.getAuthor(),
            tedTalk.getDate(),
            Integer.toString(tedTalk.getViews()),
            Integer.toString(tedTalk.getLikes()),
            tedTalk.getLink()};
            rtrn.add(tmp);
        }
        return rtrn;
    }
    
    public ArrayList<String[]> listRickAndMorty() {
        RickAndMortyDAO RnM = new RickAndMortyDAO();
        var list = RnM.getCharacters();
        ArrayList<String[]> rtrn = new ArrayList();
        for (CharacterDTO chara : list) {
            var y = chara.getEpisodes();
            String x = ((y==null) ? "--" : chara.getEpisodes().toString());
            String[] tmp = {
            chara.getId(),
            chara.getName(),
            chara.getStatus(),
            chara.getSpecies(),
            chara.getType(),
            chara.getGender(),
            chara.getOrigin().getName(),
            chara.getLocation().getName(),
            chara.getImage(),
            x,
            chara.getUrl(),
            chara.getCreated()};
            rtrn.add(tmp);
        }
        return rtrn;
    }
    
    public String[] getTedTalk(String id){
        TEDTalkDAO talks = new TEDTalkDAO();
        var tedTalk = talks.getTedTalk(id);
        String[] tmp = {
            tedTalk.getTitle(),
            tedTalk.getAuthor(),
            tedTalk.getDate(),
            Integer.toString(tedTalk.getViews()),
            Integer.toString(tedTalk.getLikes()),
            tedTalk.getLink()};
        return tmp;
    }
    
    public void putTedTalk(String[] values) {
        TEDTalkDAO talks = new TEDTalkDAO();
        TEDTalkDTO talk = new TEDTalkDTO(values);
        talks.putTedTalk(talk);
    }
    
    public void postTedTalk(String[] values) {
        TEDTalkDAO talks = new TEDTalkDAO();
        TEDTalkDTO talk = new TEDTalkDTO(values);
        talks.postTedTalk(talk);
    }
    
    public void deleteTedTalk(String id) {
        TEDTalkDAO talks = new TEDTalkDAO();
        var talk = talks.getTedTalk(id);
        talks.deleteTedTalk(talk);
    }
    
}

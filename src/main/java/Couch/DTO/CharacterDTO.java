/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couch.DTO;

import com.google.gson.annotations.SerializedName;
import org.ektorp.support.CouchDbDocument;

/**
 *
 * @author krancruz
 */
public class CharacterDTO extends CouchDbDocument {
    
    private String _id;
    private String _rev;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private CityDTO origin;
    private CityDTO location;
    private String image;
    private String[] episodes;
    private String url;
    private String created;

    public CharacterDTO() {
    }

    public CharacterDTO(String _id, String name, String status, String species,
            String type, String gender, CityDTO origin, CityDTO location,
            String image, String[] episodes, String url, String Created) {
        this.setId(_id);
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
        this.origin = origin;
        this.location = location;
        this.image = image;
        this.episodes = episodes;
        this.url = url;
        this.created = Created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public CityDTO getOrigin() {
        return origin;
    }

    public void setOrigin(CityDTO origin) {
        this.origin = origin;
    }

    public CityDTO getLocation() {
        return location;
    }

    public void setLocation(CityDTO location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String[] episodes) {
        this.episodes = episodes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String Created) {
        this.created = Created;
    }

    @Override
    public String toString() {
        return "CharacterDTO{" + "_id=" + _id + ", _rev=" + _rev + ", name=" + 
                name + ", status=" + status + ", species=" + species + 
                ", type=" + type + ", gender=" + gender + ", origin=" + origin 
                + ", location=" + location + ", image=" + image + ", episodes=" 
                + episodes + ", url=" + url + ", created=" + created + '}';
    }
}

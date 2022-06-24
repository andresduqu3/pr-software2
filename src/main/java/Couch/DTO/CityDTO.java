/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couch.DTO;

/**
 *
 * @author krancruz
 */
public class CityDTO {
    private String name;
    private String url;

    public CityDTO() {
    }

    public CityDTO(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "CityDTO{" + "name=" + name + ", url=" + url + '}';
    }
}

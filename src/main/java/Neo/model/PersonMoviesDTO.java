/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Neo.model;

/**
 *
 * @author aleja
 */
public class PersonMoviesDTO {
    private String name;
    private String born;
    private Object movies;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }
    
    public Object getMovies() {
        return movies;
    }

    public void setMovies(Object movies) {
        this.movies = movies;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Neo.controller;

import Neo.model.BackupMovies;
import Neo.model.DAO;
import Neo.model.MovieCastDTO;
import Neo.model.MovieDTO;
import Neo.model.PersonDTO;
import Neo.model.PersonMoviesDTO;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.neo4j.driver.Value;

/**
 *
 * @author aleja
 */
public class Controller {
    
    private DAO dao;
    
    public Controller() {
        this.dao = new DAO();
    }

    public ArrayList<MovieCastDTO> getMovieCast(String title)
    {
        return this.dao.getMovieCast(title);
    }
    
    public ArrayList<MovieDTO> getMovies()
    {
        return this.dao.getMovies();
    }
    
    public ArrayList<PersonDTO> getPersons()
    {
        return this.dao.getPersons();
    }
    
    public PersonMoviesDTO[] getPersonMovies(String name)
    {
        return this.dao.getPersonMovies(name);
    }
    
    public Value createMovie(String title, int released, String tagline)
    {
        return this.dao.createMovie(title, released, tagline);
    }
    
    public Value createPerson(String name, int born)
    {
        return this.dao.createPerson(name, born);
    }
    
    public void createRelationACTED_IN(String person, String movie, Map<String, List<String>> roles)
    {
        this.dao.createRelationACTED_IN(person, movie, roles);
    }
    
    
    public void createRelationREVIEWED(String person, String movie, Map<String, String> params)
    {
        this.dao.createRelationREVIEWED(person, movie, params);
    }
    
    public void BackupMovies()
    {
       BackupMovies bm = new BackupMovies();
       bm.Backup();
    }
}

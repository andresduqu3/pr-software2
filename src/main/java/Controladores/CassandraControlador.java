/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Cassandra.DTO.DTO_Persona;
import Cassandra.DAO.DAO_Persona;
import java.util.ArrayList;

/**
 * @Autor Samuel
 */
public class CassandraControlador {
    
    public ArrayList<DTO_Persona> ReadPersonas(){
        DAO_Persona DP = new DAO_Persona();
        return DP.ReadPersonas();
    }
   
    public ArrayList<DTO_Persona> ReadPersonasI(){
        DAO_Persona DP = new DAO_Persona();
        return DP.ReadPersonasI();
    }
    
    public DTO_Persona ReadPersona(int aux){
        DAO_Persona DP = new DAO_Persona();
        return DP.ReadPersona(aux);
    }
    
    public void DeletePersona(int id){
        DAO_Persona DP = new DAO_Persona();
        DP.DeletePersona(id);
    }
    
    public void CreatePersona(int id, String nombre, String telefono, String carrera, double promedio, String genero_favorito, String libro_favorito){
        DAO_Persona DP = new DAO_Persona();
        DP.CreatePersona(id, nombre, telefono, carrera, promedio, genero_favorito, libro_favorito);
    }
    
    public void UpdatePersona(int id, String nombre, String telefono, String carrera, double promedio, String genero_favorito, String libro_favorito){
        DAO_Persona DP = new DAO_Persona();
        DP.UpdatePersona(id, nombre, telefono, carrera, promedio, genero_favorito, libro_favorito);
    }
    public void Respaldo(){
        DAO_Persona DP = new DAO_Persona();
        DP.Respaldo();
    }
}

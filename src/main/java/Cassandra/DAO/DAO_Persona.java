package Cassandra.DAO;

import Cassandra.DTO.DTO_Persona;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import java.util.ArrayList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.io.PrintWriter;


/**
 * @Autor Samuel
 */

public class DAO_Persona {
    private int ventana = -1;
    private String serverIP = "127.0.0.1";
    private String keyspace = "test_keyspace";
    private Cluster cluster;
    private Session session;
    
    private void conectarDB(){
        cluster = Cluster.builder()
              .addContactPoints(serverIP)
              .build();
        session = cluster.connect(keyspace);
    }
    
    private void desconectarDB(){
        cluster.close();
    }
    
    public ArrayList<DTO_Persona> ReadPersonas(){
        conectarDB();
        String consulta = "select * from persona";
        
        ArrayList<DTO_Persona> listaPersona = new ArrayList<DTO_Persona>();
        
        for (Row row : session.execute(consulta)) {
            
            DTO_Persona DP = new DTO_Persona();
            DP.setId(row.getInt(0));
            DP.setCarrera(row.getString(1));
            DP.setGenero_favorito(row.getString(2));
            DP.setLibro_favorito(row.getString(3));
            DP.setNombres(row.getString(4));
            DP.setPromedio(row.getDouble(5));
            DP.setTelefono(row.getString(6));
            //System.out.println(DP.toString());
            listaPersona.add(DP);
        }
        
        desconectarDB();
            
        return listaPersona;     

    }
    
    public DTO_Persona ReadPersona(int id){
        conectarDB();
        String consulta = "select * from persona WHERE id = ";
        consulta += String.valueOf(id) + ";";
        
        for (Row row : session.execute(consulta)) {
            DTO_Persona DP = new DTO_Persona();
            DP.setId(row.getInt(0));
            DP.setCarrera(row.getString(1));
            DP.setGenero_favorito(row.getString(2));
            DP.setLibro_favorito(row.getString(3));
            DP.setNombres(row.getString(4));
            DP.setPromedio(row.getDouble(5));
            DP.setTelefono(row.getString(6));
            
            desconectarDB();
            return DP;
        }
        return null;

    }
    public void DeletePersona(int id){
        conectarDB();
        
        String consulta = "DELETE from persona WHERE id = ";
        consulta += String.valueOf(id) + ";";
          
        session.execute(consulta);
        //System.out.println(consulta);

        desconectarDB();

       
    }
    public void CreatePersona(int id, String nombre, String telefono, String carrera, double promedio, String genero_favorito, String libro_favorito){
        conectarDB();
        String consulta = "INSERT INTO persona (id, nombre, telefono, carrera, promedio, genero_favorito, libro_favorito) VALUES ( ";
        consulta += String.valueOf(id) + ", '";
        consulta += nombre + "', '";
        consulta += telefono + "', '";
        consulta += carrera + "', ";
        consulta += promedio + ", '";
        consulta += genero_favorito + "', '";
        consulta += libro_favorito + "');";
        //System.out.println(consulta);
        session.execute(consulta);
        
        desconectarDB();
    }
    public void UpdatePersona(int iden, String nombre, String telefono, String carrera, double promedio, String genero_favorito, String libro_favorito){
        conectarDB();
        String consulta = "UPDATE persona SET nombre = '";
        consulta += nombre + "', telefono = '";
        consulta += telefono + "', carrera ='";
        consulta += carrera + "', promedio =";
        consulta += promedio + ", genero_favorito='";
        consulta += genero_favorito + "', libro_favorito='";
        consulta += libro_favorito + "' WHERE id = ";
        consulta += String.valueOf(iden) + ";";
        System.out.println(consulta);
        session.execute(consulta);
        
        desconectarDB();
    }
    public ArrayList<DTO_Persona> ReadPersonasI(){
        conectarDB();
        String consulta = "select * from persona where promedio >= 3.2 ALLOW FILTERING";
        
        ArrayList<DTO_Persona> listaPersona = new ArrayList<DTO_Persona>();
        
        for (Row row : session.execute(consulta)) {
            
            DTO_Persona DP = new DTO_Persona();
            DP.setId(row.getInt(0));
            DP.setCarrera(row.getString(1));
            DP.setGenero_favorito(row.getString(2));
            DP.setLibro_favorito(row.getString(3));
            DP.setNombres(row.getString(4));
            DP.setPromedio(row.getDouble(5));
            DP.setTelefono(row.getString(6));
            //System.out.println(DP.toString());
            listaPersona.add(DP);
        }
        
        desconectarDB();
            
        return listaPersona;     

    }
    
    public void Respaldo(){
        conectarDB();
        String consulta = "select * from persona";
        
        ArrayList<DTO_Persona> listaPersona = new ArrayList<DTO_Persona>();
        
        for (Row row : session.execute(consulta)) {
            
            DTO_Persona DP = new DTO_Persona();
            DP.setId(row.getInt(0));
            DP.setCarrera(row.getString(1));
            DP.setGenero_favorito(row.getString(2));
            DP.setLibro_favorito(row.getString(3));
            DP.setNombres(row.getString(4));
            DP.setPromedio(row.getDouble(5));
            DP.setTelefono(row.getString(6));
            listaPersona.add(DP);
        }
        
        desconectarDB();
        
        try {    
            
            PrintWriter writer = new PrintWriter("./Respaldos/Cassandra_respaldo.txt", "UTF-8");
            writer.println("id, nombres, apellidos, carrera, promedio, genero_favorito, libro_favorito");
            for (DTO_Persona dto: listaPersona ) {
                writer.println(dto.toStringR());
            }        
            
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }     

    }
}

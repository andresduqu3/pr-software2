/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cassandra;

import Cassandra.DAO.DAO_Persona;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
/**
 * @Autor Samuel
 */
public class Pruebas {
    private static String serverIP = "127.0.0.1";
    private static String keyspace = "test_keyspace";
    private static Cluster cluster;
    private static Session session;
    
   
    public static void main(String[] args) {
        DAO_Persona DP = new DAO_Persona();
        //DP.ReadPersonas();
        //DP.ReadPersona(1006873236.0);
        //DP.DeletePersona(1006873236);
        //System.out.println("_______");
        //DP.CreatePersona(1006873236, "Carlos Samuel", "Medina Pardo", "3186902754", "Sistemas", 4.4, "fantasia", "mistborn");
        //DP.UpdatePersona(1006873236, "Carlos", "Medina Pardo", "3186902754", "Sistemas", 4.4, "fantasia", "mistborn");
        //DP.ReadPersonas
        
        int i = 0;
        cluster = Cluster.builder()
              .addContactPoints(serverIP)
              .build();
        session = cluster.connect(keyspace);
        while (i < 10000){
            int iden = (int)Math.floor(Math.random()*100000000);

            String[] vec = {"Carlos", "Samuel", "Jose", "Fernando", "Richard", "Rodolfo", "Andres", "Rodrigo", "Felipe",
                "Alejandro", "Kaladin", "Adolin", "Dalinar", "Yu", "Brayan", "Johan", "Haider", "Diego", "Santiago", "Adonalsium"};
            int aux1 = (int)Math.floor(Math.random()*20);
            int aux2 = (int)Math.floor(Math.random()*20);
            

            String[] vec2 = {"Medina", "Pardo", "Carvajal", "Alvarez", "Barreto", "Hernandez", "Olarte", "Duque", "Uribe",
                "Kholin", "Davar", "Beifong", "Sato", "Polo", "Silva", "Duarte", "Suarez", "Robayo", "Diaz", "Rodriguez"};
            int aux3 = (int)Math.floor(Math.random()*20);
            int aux4 = (int)Math.floor(Math.random()*20);
            String nombre = vec[aux1] + " " + vec[aux2] + " " + vec2[aux3] + " " + vec2[aux4];

            int telefono1 = 300000 + (int)Math.floor(Math.random()*20000);
            int telefono2 = (int)Math.floor(Math.random()*10000);
            String telefono = String.valueOf(telefono1) + String.valueOf(telefono2);

            String[] vec3 = {"Sistemas", "Electronica", "Biologia", "Enfermeria", "Veterinaria", "Pedagogia", "Mercadeo", "Procesos", "Ambiental", "Economia"};
            int aux5 = (int)Math.floor(Math.random()*10);
            String carrera = vec3[aux5];

            int aux6 = (int)Math.floor(Math.random()*51);
            Double promedio = Double.valueOf(aux6)/10;

            String[] vec4 = {"Fantasia", "Drama", "Misterio", "Romance", "Distopia"};
            int aux7 = (int)Math.floor(Math.random()*5);
            String genero = vec4[aux7];

            String[] vec5 = {"Mistborn", "Cuatro", "Divergente", "Alone", "Lux", "Dark", "Leal", "Caidos", "Juramentada", "Elantris"};
            int aux8 = (int)Math.floor(Math.random()*10);
            String libro = vec5[aux8];        

            //DP.CreatePersona(iden, nombre, telefono, carrera, promedio, genero, libro);
            
            String consulta = "INSERT INTO persona (id, nombre, telefono, carrera, promedio, genero_favorito, libro_favorito) VALUES ( ";
            consulta += String.valueOf(iden) + ", '";
            consulta += nombre + "', '";
            consulta += telefono + "', '";
            consulta += carrera + "', ";
            consulta += promedio + ", '";
            consulta += genero+ "', '";
            consulta += libro + "');";
            //System.out.println(consulta);
            session.execute(consulta);
            
            i++;
            //METER 10.000 DATOS
        }
        cluster.close();
        //DP.ReadPersonas();
    }
}

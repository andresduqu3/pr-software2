/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cassandra.DTO;

/**
 * @Autor Samuel
 */
public class DTO_Persona {
    private int id;
    private String nombres;
    private String telefono;
    private String carrera;
    private double promedio;
    private String genero_favorito;
    private String libro_favorito;
    
    public DTO_Persona(){
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getGenero_favorito() {
        return genero_favorito;
    }

    public void setGenero_favorito(String genero_favorito) {
        this.genero_favorito = genero_favorito;
    }

    public String getLibro_favorito() {
        return libro_favorito;
    }

    public void setLibro_favorito(String libro_favorito) {
        this.libro_favorito = libro_favorito;
    }

    @Override
    public String toString() {
        return id + ", " + nombres + ", " + telefono + ", " + carrera + ", " + promedio + ", " + genero_favorito + ", " + libro_favorito + '\n';
    }
    
    public String toString_select() {
        return id + "- " + nombres + '\n';
    }  
    
    public String toStringI2() {
        return id + ", " + nombres + ", " + telefono +'\n';
    }
    
    public String toStringI3() {
        return id + ", " + carrera + ", " + promedio + '\n';
    }   
    
    public String toStringI4() {
        return id + ", " + genero_favorito + ", " + libro_favorito +  '\n';
    }   

    public String toStringR() {
        return id + ", " + nombres + ", " + telefono + ", " + carrera + ", " + promedio + ", " + genero_favorito + ", " + libro_favorito;
    }   
}


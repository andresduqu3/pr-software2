/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mongo.DTO;

/**
 *
 * @author Richard
 */
public class DTO_Tipo_Plato {

    String Tipo="";
    int precio_minimo=0;

    int precio_maximo=0;

    String recomendacion="";

    public DTO_Tipo_Plato() {
    }

    public DTO_Tipo_Plato(String Tipo, int precio_minimo, int precio_maximo, String recomendacion) {
        this.Tipo = Tipo;
        this.precio_minimo = precio_minimo;
        this.precio_maximo = precio_maximo;
        this.recomendacion = recomendacion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getPrecio_minimo() {
        return precio_minimo;
    }

    public void setPrecio_minimo(int precio_minimo) {
        this.precio_minimo = precio_minimo;
    }

    public int getPrecio_maximo() {
        return precio_maximo;
    }

    public void setPrecio_maximo(int precio_maximo) {
        this.precio_maximo = precio_maximo;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

}

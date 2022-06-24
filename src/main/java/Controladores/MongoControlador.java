/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Mongo.DTO.DTO_Restaurante;
import Mongo.DTO.DTO_Tipo_Plato;
import Mongo.DAO.DAO_Restaurante;
import Mongo.DAO.ReportesMongo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Richard
 */
public class MongoControlador {

    DAO_Restaurante x;
    Tabla tabla;
    ReportesMongo reportes = new ReportesMongo();

    public MongoControlador() {
        x = new DAO_Restaurante();
    }

    public DefaultTableModel generar_tabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        String columnas[] = {"Razon Social", "Municipio", "Descripcion Tipo Rnt", "Categoria", "Subcategoria",
            "Estado Rnt", "Total", "Tipo", "Precio Minimo", "Precio Maximo", "Recomendacion"};
        DAO_Restaurante x = new DAO_Restaurante();
        tabla = new Tabla();
        ArrayList<String[]> listado = x.listar();
        return tabla.contruir_tabla(listado, columnas);
    }
    public ArrayList<String[]> informes() {

        DAO_Restaurante x = new DAO_Restaurante();
        ArrayList<String[]> listado = x.listar();
        return listado;
    }

    public void Insertar(String razon_Social, String municipio, String descripcion_Rnt, String categoria, String subcategoria, String estado_Rnt, String total, DTO_Tipo_Plato tipo) {

        DTO_Restaurante aux = new DTO_Restaurante(razon_Social, municipio, descripcion_Rnt, categoria, subcategoria, estado_Rnt, total, tipo);

        this.x.insertar(aux);

    }

    public void eliminar(String razon) {
        this.x.elimiinar1(razon);
    }

    public void Generar_pdf(int tipo) {

        switch (tipo) {
            case 1:
                this.reportes.ReporteGeneral();
                JOptionPane.showMessageDialog(null, "REPORTE GENERADO");
                break;
            case 2:
                this.reportes.ReporteGeneral2();
                JOptionPane.showMessageDialog(null, "REPORTE GENERADO");
                break;
            case 3:
                this.reportes.ReporteGeneral3();
                JOptionPane.showMessageDialog(null, "REPORTE GENERADO");
            case 4:
                this.reportes.Reporte4();
                JOptionPane.showMessageDialog(null, "REPORTE GENERADO");
                break;
            case 5:
                this.reportes.Reporte5();
                JOptionPane.showMessageDialog(null, "REPORTE GENERADO");
                break;
            default:
                System.out.println("Habitación 5");
        }
    }

}

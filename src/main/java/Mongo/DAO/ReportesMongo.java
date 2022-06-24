/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mongo.DAO;

import Cassandra.DTO.DTO_Persona;
import Controladores.CassandraControlador;
import Mongo.DTO.DTO_Restaurante;
import Views.Cassandra.Informes_Cassandra;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Richard
 */
public class ReportesMongo {

    DAO_Restaurante DAO = new DAO_Restaurante();

    public void ReporteGeneral() {
        Document documento = new Document();
        String nombre = "Informe_Total.pdf";

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("./Informes/" + nombre));
            documento.open();

            PdfPTable tabla = new PdfPTable(6);

            CassandraControlador MC = new CassandraControlador();
            String columnas[] = {"Razon Social", "Municipio", "Descripcion Tipo Rnt", "Categoria", "Subcategoria",
                "Estado Rnt"};

            ArrayList<DTO_Restaurante> lista = DAO.listar2();
            for (int i = 0; i < columnas.length; i++) {
                tabla.addCell(columnas[i]);

            }
            for (int i = 0; i < lista.size(); i++) {
                tabla.addCell(lista.get(i).getRazon_Social());
                tabla.addCell(lista.get(i).getMunicipio());
                tabla.addCell(lista.get(i).getDescripcion_Rnt());
                tabla.addCell(lista.get(i).getCategoria());
                tabla.addCell(lista.get(i).getSubcategoria());
                tabla.addCell(lista.get(i).getTotal());

            }

            documento.add(tabla);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ReporteGeneral2() {
        Document documento = new Document();
        String nombre = "Establecimientos.pdf";

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("./Informes/" + nombre));
            documento.open();

            PdfPTable tabla = new PdfPTable(3);

            CassandraControlador MC = new CassandraControlador();
            String columnas[] = {"Razon Social", "Municipio", "Descripcion Tipo Rnt"};

            ArrayList<DTO_Restaurante> lista = DAO.listar2();
            for (int i = 0; i < columnas.length; i++) {
                tabla.addCell(columnas[i]);

            }
            for (int i = 0; i < lista.size(); i++) {
                tabla.addCell(lista.get(i).getRazon_Social());
                tabla.addCell(lista.get(i).getMunicipio());
                tabla.addCell(lista.get(i).getDescripcion_Rnt());

            }

            documento.add(tabla);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ReporteGeneral3() {
        Document documento = new Document();
        String nombre = "Establecimientos_tipo_establecimientos.pdf";

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("./Informes/" + nombre));
            documento.open();

            PdfPTable tabla = new PdfPTable(3);

            CassandraControlador MC = new CassandraControlador();
            String columnas[] = {"Razon Social", "Municipio", "Descripcion Tipo Rnt"};

            ArrayList<DTO_Restaurante> lista = DAO.listar2();
            for (int i = 0; i < columnas.length; i++) {
                tabla.addCell(columnas[i]);

            }
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getDescripcion_Rnt().equals("ESTABLECIMIENTO")) {
                    tabla.addCell(lista.get(i).getRazon_Social());
                }
                tabla.addCell(lista.get(i).getMunicipio());
                tabla.addCell(lista.get(i).getDescripcion_Rnt());

            }

            documento.add(tabla);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Reporte4() {
        Document documento = new Document();
        String nombre = "establecimiento_categoria__VIVIENDAS_TURÍSTICAS.pdf";

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("./Informes/" + nombre));
            documento.open();

            PdfPTable tabla = new PdfPTable(5);

            CassandraControlador MC = new CassandraControlador();
            String columnas[] = {"Razon Social", "Municipio", "Descripcion Tipo Rnt", "Categoria", "Subcategoria"};

            ArrayList<DTO_Restaurante> lista = DAO.listar2();
            for (int i = 0; i < columnas.length; i++) {
                tabla.addCell(columnas[i]);

            }
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getCategoria().equals("VIVIENDAS TURÍSTICAS")) {
                    tabla.addCell(lista.get(i).getRazon_Social());
                    tabla.addCell(lista.get(i).getMunicipio());
                    tabla.addCell(lista.get(i).getDescripcion_Rnt());
                    tabla.addCell(lista.get(i).getCategoria());
                    tabla.addCell(lista.get(i).getSubcategoria());
                    
                }
            }

            documento.add(tabla);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Reporte5() {
        Document documento = new Document();
        String nombre = "establecimiento_precios_6000.pdf";

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("./Informes/" + nombre));
            documento.open();

            PdfPTable tabla = new PdfPTable(5);

            CassandraControlador MC = new CassandraControlador();
            String columnas[] = {"Razon Social", "Municipio", "Descripcion Tipo Rnt", "Categoria", "Subcategoria"};

            ArrayList<DTO_Restaurante> lista = DAO.listar2();
            for (int i = 0; i < columnas.length; i++) {
                tabla.addCell(columnas[i]);

            }
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getTipo().getPrecio_minimo()>6000) {
                    tabla.addCell(lista.get(i).getRazon_Social());
                    tabla.addCell(lista.get(i).getMunicipio());
                    tabla.addCell(lista.get(i).getDescripcion_Rnt());
                    tabla.addCell(lista.get(i).getCategoria());
                    tabla.addCell(lista.get(i).getSubcategoria());
                    
                }
            }

            documento.add(tabla);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

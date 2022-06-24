/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Couch.model;

import Controladores.CassandraControlador;
import Controladores.CouchController;
import Oracle.DTO.DTO_Cargo;
import Oracle.Vista.GUI;
import Views.Cassandra.Informes_Cassandra;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author krancruz
 */
public class Reports {
    CouchController control = new CouchController();
    private int vent = 0;
    
    public void report1() {
        Document documento = new Document();
        String nombre = "TTTotalReport.pdf";

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("src/main/resources/reports/couchdb/" + nombre));
            documento.open();

            PdfPTable tabla = new PdfPTable(6);

            CassandraControlador MC = new CassandraControlador();
            String columnas[] = {"Title", "Author", "Date",
            "Views", "Likes", "Link"};

            var list = this.control.listTedTalks();
            for (int i = 0; i < columnas.length; i++) {
                tabla.addCell(columnas[i]);

            }
            for (String[] talks : list) {
                tabla.addCell(talks[0]);
                tabla.addCell(talks[1]);
                tabla.addCell(talks[2]);
                tabla.addCell(talks[3]);
                tabla.addCell(talks[4]);
                tabla.addCell(talks[5]);
            }

            documento.add(tabla);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void report2() {
        Document documento = new Document();
        String nombre = "TTReportLink.pdf";

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("src/main/resources/reports/couchdb/" + nombre));
            documento.open();

            PdfPTable tabla = new PdfPTable(3);

            CassandraControlador MC = new CassandraControlador();
            String columnas[] = {"Title","Date", "Link"};

            var list = this.control.listTedTalks();
            for (int i = 0; i < columnas.length; i++) {
                tabla.addCell(columnas[i]);

            }
            for (String[] talks : list) {
                tabla.addCell(talks[0]);
                tabla.addCell(talks[2]);
                tabla.addCell(talks[5]);
            }

            documento.add(tabla);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void report3() {
        Document documento = new Document();
        String nombre = "TTReportLikes.pdf";

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("src/main/resources/reports/couchdb/" + nombre));
            documento.open();

            PdfPTable tabla = new PdfPTable(6);

            CassandraControlador MC = new CassandraControlador();
            String columnas[] = {"Title", "Author", "Likes"};

            var list = this.control.listTedTalks();
            for (int i = 0; i < columnas.length; i++) {
                tabla.addCell(columnas[i]);

            }
            for (String[] talks : list) {
                tabla.addCell(talks[0]);
                tabla.addCell(talks[1]);
                tabla.addCell(talks[4]);
            }

            documento.add(tabla);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void report4() {
        Document documento = new Document();
        String nombre = "RMReportBasic.pdf";

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("src/main/resources/reports/couchdb/" + nombre));
            documento.open();

            PdfPTable tabla = new PdfPTable(6);

            CassandraControlador MC = new CassandraControlador();
            String columnas[] = {"Id", "Name", "Status",
            "Species", "Gender", "Location"};

            var list = this.control.listTedTalks();
            for (int i = 0; i < columnas.length; i++) {
                tabla.addCell(columnas[i]);

            }
            for (String[] talks : list) {
                tabla.addCell(talks[0]);
                tabla.addCell(talks[1]);
                tabla.addCell(talks[2]);
                tabla.addCell(talks[3]);
                tabla.addCell(talks[5]);
                tabla.addCell(talks[7]);
            }

            documento.add(tabla);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void report5() {
        Document documento = new Document();
        String nombre = "RMReportEpisodes.pdf";

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("src/main/resources/reports/couchdb/" + nombre));
            documento.open();

            PdfPTable tabla = new PdfPTable(6);

            CassandraControlador MC = new CassandraControlador();
            String columnas[] = {"Name", "Episodes", "Url"};

            var list = this.control.listTedTalks();
            for (int i = 0; i < columnas.length; i++) {
                tabla.addCell(columnas[i]);

            }
            for (String[] talks : list) {
                tabla.addCell(talks[1]);
                tabla.addCell(talks[9]);
                tabla.addCell(talks[10]);
            }

            documento.add(tabla);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void reportOracle() {
        Document documento = new Document();
        String nombre = "ReportRM-Cargos.pdf";

        try {
            PdfWriter.getInstance(documento, new FileOutputStream("src/main/resources/reports/couchdb/" + nombre));
            documento.open();

            PdfPTable tabla = new PdfPTable(6);

            CassandraControlador MC = new CassandraControlador();
            String columnas[] = {"Id", "Name", "Status",
            "Species", "Gender", "Location"};

            var list = this.control.listRickAndMorty();
            for (int i = 0; i < columnas.length; i++) {
                tabla.addCell(columnas[i]);

            }
            for (String[] RnM : list) {
                tabla.addCell(RnM[0]);
                tabla.addCell(RnM[1]);
                tabla.addCell(RnM[2]);
                tabla.addCell(RnM[3]);
                tabla.addCell(RnM[5]);
                tabla.addCell(RnM[7]);
            }

            documento.add(tabla);
            PdfPTable table = new PdfPTable(2);
            String cols[] = {"Código", "Cargo"};
            for (int i = 0; i < cols.length; i++) {
                table.addCell(cols[i]);
            }
            for (DTO_Cargo dto: GUI.masterCargo.listarCargos(vent)) {
                 table.addCell(Integer.toString(dto.getCod_cargo()));
                 table.addCell(dto.getCargo());
            }
            documento.add(table);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Informes_Cassandra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

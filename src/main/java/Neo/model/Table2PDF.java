/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Neo.model;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import javax.swing.JTable;

/**
 *
 * @author osboxes
 */
public class Table2PDF {
    public void print(JTable table, String file_name) {
        try {       
            
            Document doc = new Document(PageSize.A4.rotate());
            
            PdfWriter.getInstance(doc, new FileOutputStream("./Informes/"+file_name+".pdf"));
            
            doc.open();
            
            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
            //adding table headers
            for (int i = 0; i < table.getColumnCount(); i++) {
                pdfTable.addCell(table.getColumnName(i));
            }
            //extracting data from the JTable and inserting it to PdfPTable
            for (int rows = 0; rows < table.getRowCount(); rows++) {
                for (int cols = 0; cols < table.getColumnCount(); cols++) {
                    pdfTable.addCell(table.getModel().getValueAt(rows, cols).toString());

                }
            }
            doc.add(pdfTable);
            doc.close();
            System.out.println("done");
        } catch (DocumentException | FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Table2PDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

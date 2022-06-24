
package Redis.Cliente;

import Controladores.RedisControlador;
import Mongo.DAO.DAO_Restaurante;
import Views.Cassandra.Informes_Cassandra;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.log.Logger;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import Controladores.MongoControlador;

public class Terminal {


    public static void main(String[] args) throws DocumentException {
        RedisControlador controlador = new RedisControlador();
        MongoControlador mcon = new MongoControlador();    
        
        
        try {
            Document documento = new Document();
            String nombre = "Informe_Hibrido_Redis_Mongo.pdf";
            
            
            PdfWriter.getInstance(documento, new FileOutputStream("./Informes/" + nombre));
            documento.open();
            
            PdfPTable tabla = new PdfPTable(4);
            
            ArrayList<String[]> listado = mcon.informes();
            for(String[] c:listado ){
                tabla.addCell(c[0]);
                tabla.addCell(c[1]);
                tabla.addCell(c[2]);
                tabla.addCell(c[3]);
            }
            
            
            documento.add(tabla);
            
            PdfPTable tabla2 = new PdfPTable(3);
            
            
            RedisControlador RC = new RedisControlador();
            RC.conectarREDIS();
            
            String[][] datosredis = RC.listarEmpleadosREDIS();
            
            for(int i=0;i<datosredis.length; i++){
                for(int j=0;j<datosredis[0].length; j++){
                    tabla2.addCell(datosredis[i][j]);
                }
            }
            
            documento.add(tabla2);
            RC.desconectarREDIS();
            
            documento.close();
            
            /*
            
            String [][] reporte=null;
            
            controlador.conectarREDIS();
            
            ArrayList<String[]> repo = null;
            
            reporte = controlador.listarEmpleadosREDIS();
            for(int i=0; i<reporte.length; i++){
            repo.add(reporte[i]);
            }
            System.out.println("\n Fin REDIS \n");
            ArrayList<String[]> listado = mcon.listar();
            for(String[] c:listado ){
            repo.add(c);
            }
            
            /*
            //controlador.generar_pdf(reporte, "/Desktop/Reporte_REDIS.pdf");
            //reporte = controlador.listarEmpleadoREDIS("500");
            //reporte = controlador.listarCargosREDIS();
            //reporte = controlador.listarEmpleadoAnoREDIS("2020");
            //reporte = controlador.listarEmpleadoSalarioREDIS(15000);
            /*controlador.insertarEmpleadosREDIS("500", "Alejandro Torres", "The ¡Boss!",
            "The ¡Boss!", "The ¡Boss!", 8, "Septiembre", "2001",
            "C:/Users/alejo/Desktop/perfil3.png");
            */
            //controlador.eliminarEmpleadosREDIS("emp500");
            controlador.backupREDIS();
            controlador.desconectarREDIS();
            
            
            //String binario = controlador.ImagenBinarioREDIS();
            //controlador.BinarioImagenREDIS(binario);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}

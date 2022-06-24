
package Redis.DAO;

import Redis.DTO.DTO_Backup_REDIS;
import Redis.DTO.DTO_Empleado_REDIS;
import Redis.DTO.DTO_Sueldo_REDIS;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class DAO_Empleado_REDIS {     
    
    public ArrayList<DTO_Empleado_REDIS> listarEmpleadosREDIS(Jedis con_jedis) {        
        
        ArrayList<DTO_Empleado_REDIS> listaEmpleados = new ArrayList<DTO_Empleado_REDIS>();  
        try{            
            Set<String> keys = (HashSet) con_jedis.keys("*");
            ArrayList<String> listaClaves = new ArrayList<String>(keys);
            Collections.sort(listaClaves);            
            String id, nombre, departamento, funcion, status, mes_ingreso, ano_ingreso, perfil;
            Double sueldo;
            //int cont=0;
            for (String c : listaClaves) {
                id = c;
                nombre = con_jedis.hget(c, "nombre");
                departamento = con_jedis.hget(c, "departamento");
                funcion = con_jedis.hget(c, "funcion");
                status = con_jedis.hget(c, "estatus");
                sueldo = Double.parseDouble(con_jedis.hget(c, "sueldo"));
                mes_ingreso = con_jedis.hget(c, "mes_ingreso");
                ano_ingreso = con_jedis.hget(c, "ano_ingreso");
                perfil = con_jedis.hget(c, "perfil");
                
                listaEmpleados.add(new DTO_Empleado_REDIS(id, nombre, departamento, funcion, status, sueldo, mes_ingreso,
                                                           ano_ingreso));
            }            
        }catch(Exception e){
        }        
        return listaEmpleados;
    }
    
    public ArrayList<DTO_Empleado_REDIS> listarEmpleadoREDIS(Jedis con_jedis, String clave){        
        ArrayList<DTO_Empleado_REDIS> Empleado = new ArrayList<DTO_Empleado_REDIS>();  
        try{            
            Set<String> keys = (HashSet) con_jedis.keys(clave);
            ArrayList<String> listaClaves = new ArrayList<String>(keys);            
            String id, nombre, departamento, funcion, status, mes_ingreso, ano_ingreso, perfil;
            Double sueldo;
            perfil=null;
            for (String c : listaClaves) {
                id = c;
                nombre = con_jedis.hget(c, "nombre");
                departamento = con_jedis.hget(c, "departamento");
                funcion = con_jedis.hget(c, "funcion");
                status = con_jedis.hget(c, "estatus");
                sueldo = Double.parseDouble(con_jedis.hget(c, "sueldo"));
                mes_ingreso = con_jedis.hget(c, "mes_ingreso");
                ano_ingreso = con_jedis.hget(c, "ano_ingreso");
                perfil = con_jedis.hget(c, "perfil");
                Empleado.add(new DTO_Empleado_REDIS(id, nombre, departamento, funcion, status, sueldo, mes_ingreso,
                                                           ano_ingreso));
            }
            BinarioImagenREDIS(perfil);            
        }catch(Exception e){
        }        
        return Empleado;
    }
    
    public ArrayList<DTO_Sueldo_REDIS> listarSueldoREDIS(Jedis con_jedis) {        
        
        ArrayList<DTO_Sueldo_REDIS> listaEmpleados = new ArrayList<DTO_Sueldo_REDIS>();  
        try{            
            Set<String> keys = (HashSet) con_jedis.keys("*");
            ArrayList<String> listaClaves = new ArrayList<String>(keys);
            Collections.sort(listaClaves);            
            String id, nombre, funcion;
            Double sueldo;
            for (String c : listaClaves) {
                id = c;
                nombre = con_jedis.hget(c, "nombre");
                funcion = con_jedis.hget(c, "funcion");
                sueldo = Double.parseDouble(con_jedis.hget(c, "sueldo"));
                
                listaEmpleados.add(new DTO_Sueldo_REDIS(id, nombre, funcion, sueldo));
            }            
        }catch(Exception e){
        }        
        return listaEmpleados;
    }
    
    public ArrayList<DTO_Empleado_REDIS> listarEmpleadoAnoREDIS(Jedis con_jedis, String ano){        
        ArrayList<DTO_Empleado_REDIS> listaEmpleados = new ArrayList<DTO_Empleado_REDIS>(); 
        try{            
            Set<String> keys = (HashSet) con_jedis.keys("*");
            ArrayList<String> listaClaves = new ArrayList<String>(keys);
            Collections.sort(listaClaves);            
            String id, nombre, departamento, funcion, status, mes_ingreso, ano_ingreso;
            Double sueldo;
            for (String c : listaClaves) {
                id = c;
                nombre = con_jedis.hget(c, "nombre");
                departamento = con_jedis.hget(c, "departamento");
                funcion = con_jedis.hget(c, "funcion");
                status = con_jedis.hget(c, "estatus");
                sueldo = Double.parseDouble(con_jedis.hget(c, "sueldo"));
                mes_ingreso = con_jedis.hget(c, "mes_ingreso");
                ano_ingreso = con_jedis.hget(c, "ano_ingreso");                
                if(ano.equals(ano_ingreso)){
                    listaEmpleados.add(new DTO_Empleado_REDIS(id, nombre, departamento, funcion, status, sueldo, mes_ingreso,
                                                           ano_ingreso));
                }                
            }            
        }catch(Exception e){
        }        
        return listaEmpleados;
    }
    
    public ArrayList<DTO_Empleado_REDIS> listarEmpleadoSalarioREDIS(Jedis con_jedis, double salario){        
        ArrayList<DTO_Empleado_REDIS> listaEmpleados = new ArrayList<DTO_Empleado_REDIS>(); 
        try{            
            Set<String> keys = (HashSet) con_jedis.keys("*");
            ArrayList<String> listaClaves = new ArrayList<String>(keys);
            Collections.sort(listaClaves);            
            String id, nombre, departamento, funcion, status, mes_ingreso, ano_ingreso;
            Double sueldo;
            for (String c : listaClaves) {
                id = c;
                nombre = con_jedis.hget(c, "nombre");
                departamento = con_jedis.hget(c, "departamento");
                funcion = con_jedis.hget(c, "funcion");
                status = con_jedis.hget(c, "estatus");
                sueldo = Double.parseDouble(con_jedis.hget(c, "sueldo"));
                mes_ingreso = con_jedis.hget(c, "mes_ingreso");
                ano_ingreso = con_jedis.hget(c, "ano_ingreso");                
                if(sueldo>=salario){
                    listaEmpleados.add(new DTO_Empleado_REDIS(id, nombre, departamento, funcion, status, sueldo, mes_ingreso,
                                                           ano_ingreso));
                }                
            }            
        }catch(Exception e){
        }        
        return listaEmpleados;
    }
    
    public void insertarEmpleadosREDIS(Jedis con_jedis, String id, String nombre, String departamento, String funcion, 
                                        String estatus, double sueldo, String mes_ingreso, String ano_ingreso, String ruta){        
        Transaction t = con_jedis.multi();
        try{
            //System.out.println(con_jedis.exists(id));
            t.hset(id, "nombre", nombre);
            t.hset(id, "departamento", departamento);
            t.hset(id, "funcion", funcion);
            t.hset(id, "estatus", estatus);
            t.hset(id, "sueldo", String.valueOf(sueldo));
            t.hset(id, "mes_ingreso", mes_ingreso);
            t.hset(id, "ano_ingreso", ano_ingreso);
            String binario = ImagenBinarioREDIS(ruta);
            t.hset(id, "perfil", binario);
            t.exec();
            System.out.println("Insertado correctamente");
        }catch(Exception e){
            t.discard();
            System.out.println("Error en la insercion");            
        }
    }

    public void eliminarEmpleadosREDIS(Jedis con_jedis, String id){        
        try{            
            con_jedis.del(id);
            System.out.println("Eliminado correctamente");
        }catch(Exception e){
            System.out.println("Error en la eliminacion");            
        }
    }
    
    public void backupREDIS(Jedis con_jedis) {                
        ArrayList<DTO_Backup_REDIS> listaEmpleados = new ArrayList<DTO_Backup_REDIS>();  
        try{            
            Set<String> keys = (HashSet) con_jedis.keys("*");
            ArrayList<String> listaClaves = new ArrayList<String>(keys);
            Collections.sort(listaClaves);            
            String id, nombre, departamento, funcion, status, mes_ingreso, ano_ingreso, perfil;
            Double sueldo;
            System.out.println("Hola");
            for (String c : listaClaves) {
                id = c;
                nombre = con_jedis.hget(c, "nombre");
                departamento = con_jedis.hget(c, "departamento");
                funcion = con_jedis.hget(c, "funcion");
                status = con_jedis.hget(c, "estatus");
                sueldo = Double.parseDouble(con_jedis.hget(c, "sueldo"));
                mes_ingreso = con_jedis.hget(c, "mes_ingreso");
                ano_ingreso = con_jedis.hget(c, "ano_ingreso");
                perfil = con_jedis.hget(c, "perfil");
                
                listaEmpleados.add(new DTO_Backup_REDIS(id, nombre, departamento, funcion, status, sueldo, mes_ingreso,
                                                           ano_ingreso, perfil));
            }            
        }catch(Exception e){
        }        
        try {    
            
            PrintWriter writer = new PrintWriter(System.getProperty("user.home")+"/Desktop/respaldo_REDIS.txt", "UTF-8");
            writer.println("id, nombre, departamento, funcion, status, sueldo, mes_ingreso, ano_ingreso, perfil");
            for (DTO_Backup_REDIS dto: listaEmpleados ) {
                writer.println(dto.toString());
            }        
            
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }
    
    public void generar_pdf(String [][] vec2, String nombre_doc){
        Document documento = new Document();
        try{
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + nombre_doc));
            documento.open();
            PdfPTable tabla = new PdfPTable(vec2[0].length);
            for(int i=0;i<vec2.length; i++){
                for(int j=0;j<vec2[0].length; j++){
                    tabla.addCell(vec2[i][j]);
                }
            }
            documento.add(tabla);
            documento.close();
            
        }catch(DocumentException | FileNotFoundException e){}
    }
    public void generar_pdf2(int id, String nombre, String departamento, String funcion, String status, double sueldo,
            String mes, String ano, String ruta_imagen, String nombre_doc){
        
        Document documento = new Document();
        try{
            PdfWriter.getInstance(documento, new FileOutputStream(nombre_doc));
            documento.open();
            Paragraph parrafo = new Paragraph("Datos del usuario "+id);
            parrafo.setAlignment(1);
            documento.add(parrafo);
            
            documento.add(new Paragraph("Nombre: "+nombre));
            documento.add(new Paragraph("Departamento: "+departamento));
            documento.add(new Paragraph("Función: "+funcion));
            documento.add(new Paragraph("Estatus: "+status));
            documento.add(new Paragraph("Sueldo: "+sueldo));
            documento.add(new Paragraph("Mes de ingreso: "+mes));
            documento.add(new Paragraph("Año de ingreso: "+ano));
            documento.add(new Paragraph("Perfil: "));
            Image imagen = Image.getInstance(ruta_imagen);
            documento.add(imagen);
            documento.close();
        }catch(Exception e){
            System.out.println("Error en el dao");
        }
    }
      
    public  String ImagenBinarioREDIS(String ruta) {        
        try {
            File file = new File(ruta); 
            byte[] fileContent = FileUtils.readFileToByteArray(new File(ruta));
            String encodedString = Base64.getEncoder().encodeToString(fileContent);
            return encodedString;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void BinarioImagenREDIS(String base64String) {
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(base64String);
            FileUtils.writeByteArrayToFile(new File(System.getProperty("user.home")+"/Desktop/RES.png"), decodedBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public  String VideoBinarioREDIS(String ruta) {        
        File tempFile = new File(ruta);
        String encodedString = null;
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(tempFile);
        } catch (Exception e) {
            System.out.println("Ocurrio algun error");
        }
        byte[] bytes;
        byte[] buffer = new byte[8192];
        int bytesRead;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        bytes = output.toByteArray();
        encodedString = Base64.getEncoder().encodeToString(bytes);
        //Log.i("Strng", encodedString);        
        return encodedString;
    }
    
    public  void BinarioVideoREDIS(String ruta) {        
        byte[] decodedBytes = Base64.getDecoder().decode(ruta);
        try {
            FileOutputStream out = new FileOutputStream("C:\\Users\\alejo\\Desktop/RES_vid.mp4");
            out.write(decodedBytes);
            out.close();
        } catch (Exception e) {
            // TODO: handle exception
            //Log.e("Error", e.toString());
            System.out.println("Error");
        }
    }
}

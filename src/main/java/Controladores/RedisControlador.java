
package Controladores;

import Redis.conexion.Conexion;
import Redis.DAO.DAO_Empleado_REDIS;
import Redis.DTO.DTO_Backup_REDIS;
import Redis.DTO.DTO_Empleado_REDIS;
import Redis.DTO.DTO_Sueldo_REDIS;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import redis.clients.jedis.Jedis;

public class RedisControlador {
    
    Jedis con_jedis = null;
    DAO_Empleado_REDIS empleadoREDIS = new DAO_Empleado_REDIS();
    
    public void conectarREDIS(){
        con_jedis = Conexion.conectarREDIS();
    }
    
    public void desconectarREDIS(){
        con_jedis = Conexion.desconectarREDIS();
    }
    
    
    public String[][] listarEmpleadosREDIS(){
        ArrayList<DTO_Empleado_REDIS> listaEmpleadosREDIS = empleadoREDIS.listarEmpleadosREDIS(con_jedis);
        String aux = String.valueOf(listaEmpleadosREDIS.get(0));
        String [] vec_aux = null;
        String [][] Matriz = new String [listaEmpleadosREDIS.size()][aux.split(";").length];
        for(int i=0; i<listaEmpleadosREDIS.size(); i++){ 
            aux = String.valueOf(listaEmpleadosREDIS.get(i));
            vec_aux=aux.split(";");
            for(int j = 0; j<vec_aux.length; j++){
                Matriz[i][j]=vec_aux[j];
            }
        }
        for(int i=0; i<Matriz.length; i++){             
            for(int j = 0; j<Matriz[0].length; j++){
                System.out.print(Matriz[i][j]+"   ");
            }
            System.out.println("");
        }
        
        return Matriz;
    }
    
    public String[][] listarCargosREDIS(){
        ArrayList<DTO_Sueldo_REDIS> listaEmpleadosREDIS = empleadoREDIS.listarSueldoREDIS(con_jedis);
        String aux = String.valueOf(listaEmpleadosREDIS.get(0));
        String [] vec_aux = null;
        String [][] Matriz = new String [listaEmpleadosREDIS.size()][aux.split(";").length];
        for(int i=0; i<listaEmpleadosREDIS.size(); i++){ 
            aux = String.valueOf(listaEmpleadosREDIS.get(i));
            vec_aux=aux.split(";");
            for(int j = 0; j<vec_aux.length; j++){
                Matriz[i][j]=vec_aux[j];
            }
        }
        for(int i=0; i<Matriz.length; i++){             
            for(int j = 0; j<Matriz[0].length; j++){
                System.out.print(Matriz[i][j]+"   ");
            }
            System.out.println("");
        }
        
        return Matriz;
    }
    
    public String[][] listarEmpleadoAnoREDIS(String ano){
        ArrayList<DTO_Empleado_REDIS> listaEmpleadosREDIS = empleadoREDIS.listarEmpleadoAnoREDIS(con_jedis, ano);
        String aux = String.valueOf(listaEmpleadosREDIS.get(0));
        String [] vec_aux = null;
        String [][] Matriz = new String [listaEmpleadosREDIS.size()][aux.split(";").length];
        for(int i=0; i<listaEmpleadosREDIS.size(); i++){ 
            aux = String.valueOf(listaEmpleadosREDIS.get(i));
            vec_aux=aux.split(";");
            for(int j = 0; j<vec_aux.length; j++){
                Matriz[i][j]=vec_aux[j];
            }
        }
        for(int i=0; i<Matriz.length; i++){             
            for(int j = 0; j<Matriz[0].length; j++){
                System.out.print(Matriz[i][j]+"   ");
            }
            System.out.println("");
        }        
        return Matriz;
    }
    
    public String[][] listarEmpleadoSalarioREDIS(double sueldo){
        ArrayList<DTO_Empleado_REDIS> listaEmpleadosREDIS = empleadoREDIS.listarEmpleadoSalarioREDIS(con_jedis, sueldo);
        String aux = String.valueOf(listaEmpleadosREDIS.get(0));
        String [] vec_aux = null;
        String [][] Matriz = new String [listaEmpleadosREDIS.size()][aux.split(";").length];
        for(int i=0; i<listaEmpleadosREDIS.size(); i++){ 
            aux = String.valueOf(listaEmpleadosREDIS.get(i));
            vec_aux=aux.split(";");
            for(int j = 0; j<vec_aux.length; j++){
                Matriz[i][j]=vec_aux[j];
            }
        }
        for(int i=0; i<Matriz.length; i++){             
            for(int j = 0; j<Matriz[0].length; j++){
                System.out.print(Matriz[i][j]+"   ");
            }
            System.out.println("");
        }        
        return Matriz;
    }
    
    public String[][] listarEmpleadoREDIS(String clave){
        ArrayList<DTO_Empleado_REDIS> listaEmpleadosREDIS = empleadoREDIS.listarEmpleadoREDIS(con_jedis, clave);
        String aux = String.valueOf(listaEmpleadosREDIS.get(0));
        String [] vec_aux = null;
        String [][] Matriz = new String [listaEmpleadosREDIS.size()][aux.split(";").length];
        for(int i=0; i<listaEmpleadosREDIS.size(); i++){ 
            aux = String.valueOf(listaEmpleadosREDIS.get(i));
            vec_aux=aux.split(";");
            for(int j = 0; j<vec_aux.length; j++){
                Matriz[i][j]=vec_aux[j];
            }
        }
        for(int i=0; i<Matriz.length; i++){             
            for(int j = 0; j<Matriz[0].length; j++){
                System.out.print(Matriz[i][j]+"   ");
            }
            System.out.println("");
        }
        return Matriz;
    }
    
    public void insertarEmpleadosREDIS(String id, String nombre, String departamento, String funcion, 
                                        String estatus, double sueldo, String mes_ingreso, String ano_ingreso, String ruta){
        empleadoREDIS.insertarEmpleadosREDIS(con_jedis, id, nombre, departamento, funcion, estatus, sueldo, mes_ingreso, ano_ingreso, ruta);
    }
    
    public void eliminarEmpleadosREDIS(String id){
        empleadoREDIS.eliminarEmpleadosREDIS(con_jedis, id);
    }
    
    public void backupREDIS(){
        empleadoREDIS.backupREDIS(con_jedis);        
    }
    
    public void generar_pdf(String [][] reporte, String ruta){
        empleadoREDIS.generar_pdf(reporte, ruta);
    }
    
    public void generar_pdf2(int id, String nombre, String departamento, String funcion, String status, double sueldo,
            String mes, String ano, String imagen, String nombre_doc){
        
        empleadoREDIS.generar_pdf2(id, nombre, departamento, funcion, status, sueldo, mes, ano, imagen, nombre_doc);
        
    }
    /*
    public String ImagenBinarioREDIS(){
        String binario = DAO_Empleado_REDIS.ImagenBinarioREDIS();
        return binario;
    }
    
    public void BinarioImagenREDIS(String binario){
        DAO_Empleado_REDIS.BinarioImagenREDIS(binario);
    }
*/
}

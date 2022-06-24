package Oracle.DAO;

import Oracle.DTO.DTO_Historial_Laboral;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Oracle.Modelo.Historial_Laboral;
import Oracle.Singleton.SingletonMaster;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @Autor Samuel
 */
public class DAO_Historial_Laboral {
    private int ventana = -1;
    
    public void setVentana(int ven){
        ventana = ven;
    }
    
    private void conectarDB(int ventana){
        SingletonMaster.getInstance(ventana);
    }
    
    
    public DTO_Historial_Laboral LeerHistorial_Laboral(String aux, String aux2){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "select * from historial_laboral where empleado = ";
        consulta += consulta;
        consulta += " actual = ";
        consulta += aux2;
        
        String datos = aux + " " + aux2;
        bitacora("Leer", consulta, datos);
        
        Statement st = null;
        ResultSet rs = null;
        DTO_Historial_Laboral HL = new DTO_Historial_Laboral();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                Historial_Laboral hl = new Historial_Laboral();
                
                hl.setEmpleado(Double.parseDouble(rs.getString(1)));
                hl.setFecha_ingreso(rs.getString(2));
                hl.setFecha_salida(rs.getString(3));
                hl.setCargo(Integer.parseInt(rs.getString(4)));
                hl.setActual(rs.getString(5));
                
                HL.setEmpleado(rs.getString(1));
                HL.setFecha_ingreso(hl.getFecha_ingreso());
                HL.setFecha_salida(hl.getFecha_salida());
                HL.setCargo(hl.getCargo());
                HL.setActual(hl.getActual());
            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return HL;
    }
    //Read
    public ArrayList<DTO_Historial_Laboral> listarHistorial(){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "select * from historial_laboral";

        bitacora("Leer", consulta, "");
        
        Statement st = null;
        ResultSet rs = null;
        ArrayList<DTO_Historial_Laboral> listaHistorial = new ArrayList<DTO_Historial_Laboral>();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                Historial_Laboral hl = new Historial_Laboral();
                hl.setEmpleado(Double.parseDouble(rs.getString(1)));
                hl.setFecha_ingreso(rs.getString(2));
                hl.setFecha_salida(rs.getString(3));
                hl.setCargo(Integer.parseInt(rs.getString(4)));
                hl.setActual(rs.getString(5));
                

                DTO_Historial_Laboral HL = new DTO_Historial_Laboral();
                
                
                HL.setEmpleado(rs.getString(1));
                HL.setFecha_ingreso(hl.getFecha_ingreso());
                HL.setFecha_salida(hl.getFecha_salida());
                HL.setCargo(hl.getCargo());
                HL.setActual(hl.getActual());
                
                listaHistorial.add(HL);

            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return listaHistorial;
        
    }
    //Create
    public boolean insertarHistorial_Laboral(int empleado, String fecha_ingreso, String fecha_salida, int cargo, String actual){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "insert into historial_laboral values (?,?,?,?,?)";
            
            String datos = String.valueOf(empleado)+", " + fecha_ingreso+", " + fecha_salida+", "+String.valueOf(cargo)+", "+actual;
            bitacora("Insertar", sql, datos);
            
            secuencia = con.prepareStatement(sql);
            secuencia.setInt(1, empleado);
            secuencia.setString(2, fecha_ingreso);
            secuencia.setString(3, fecha_salida);
            secuencia.setInt(4, cargo);
            secuencia.setString(5, actual);
                    
            secuencia.execute();

            secuencia.close();

            con.commit();
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Historial_Laboral.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            return false;
        }
    }
    //Update
    public boolean UpdateHistorial_Laboral(int iden1, String iden2, int empleado, String fecha_ingreso, String fecha_salida, int cargo, String actual){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "UPDATE historial_laboral ";
            iden2 = iden2.replace("\n", "");
            actual = iden2.replace("\n", "");
            fecha_ingreso = fecha_ingreso.split(" ")[0].replace("-", "/");
            fecha_salida = fecha_salida.split(" ")[0].replace("-", "/");
            
            sql += "SET empleado = ?, fecha_ingreso = TO_DATE('";
            sql += fecha_ingreso;
            sql += "', 'YYYY/MM/DD'), fecha_salida = TO_DATE('";
            sql += fecha_salida;
            sql += "', 'YYYY/MM/DD'), cargo = ?, actual = ";
            sql += "'"+actual+"'";
            sql += " WHERE empleado = ? and actual = ";
            sql += "'"+iden2+"'";
            
            String datos = String.valueOf(empleado)+", " + fecha_ingreso+", " + fecha_salida+", "+String.valueOf(cargo)+", "+actual + ", " + String.valueOf(iden1)+", "+String.valueOf(iden2);
            bitacora("Update", sql, datos);
           
            secuencia = con.prepareStatement(sql);
            secuencia.setInt(1, empleado);
            secuencia.setInt(2, cargo);
            secuencia.setInt(3, iden1);
            
            secuencia.execute();

            secuencia.close();

            con.commit();
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Historial_Laboral.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            return false;
        }
    }
    //Update
    public void DeleteHistorial_Laboral(int empleado, String actual){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "DELETE FROM historial_laboral ";
            sql += "WHERE empleado = ?";
            sql +=  " and actual = ";
            actual = actual.replace("\n","");
            sql += "'"+actual+"'";
            secuencia = con.prepareStatement(sql);
            
            String datos = String.valueOf(empleado);
            bitacora("Delete", sql, datos);

            secuencia.setInt(1, empleado);
            
            secuencia.execute();
            secuencia.close();
            con.commit();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Historial_Laboral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void desconectarDB(){}
    public void bitacora(String tipo, String sec, String valS){
        
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String sql = "insert into bitacora values (?, sysdate,to_char(sysdate, 'HH24:MM:SS') ,?,?,?)";
        PreparedStatement secuencia = null;
        try {
            secuencia = con.prepareStatement(sql);
            secuencia.setString(1, con.toString());
            secuencia.setString(2, tipo);
            secuencia.setString(3, sec);
            secuencia.setString(4, valS);
            
            secuencia.execute();
            secuencia.close();
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private int StringtoInt(String aux){
        int nu = 0;
        try{
            nu = Integer.parseInt(aux); 
        }catch(Exception e){
        }
        return nu;
    }
}

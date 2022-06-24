package Oracle.DAO;

import Oracle.DTO.DTO_EE;
import Oracle.DTO.DTO_Elementos_Asignados;
import Oracle.DTO.DTO_EAE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Oracle.Modelo.Elementos_Asignados;
import Oracle.Singleton.SingletonMaster;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @Autor Samuel
 */
public class DAO_Elementos_Asignados{
private int ventana = -1;
    
    public void setVentana(int ven){
        ventana = ven;
    }
    
    private void conectarDB(int ventana){
        SingletonMaster.getInstance(ventana);
    }
    
    
    public DTO_Elementos_Asignados LeerElementos_Asignados(Double aux, int aux2, String aux3){
        //Esta tiene que ser corregida
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);;
        //ESTO EN ESPECIAL
        String consulta = "select * from elementos_asignados where empleado = ";
        consulta += consulta;
        consulta += " actual = ";
        consulta += aux2;
        
        bitacora("Leer", consulta, "");
            
        Statement st = null;
        ResultSet rs = null;
        DTO_Elementos_Asignados EA = new DTO_Elementos_Asignados();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                Elementos_Asignados ea = new Elementos_Asignados();
                
                ea.setEmpleados(Double.parseDouble(rs.getString(1)));
                ea.setElemento(StringtoInt(rs.getString(2)));
                ea.setActual(rs.getString(3));
                ea.setNumero(StringtoInt(rs.getString(4)));
                ea.setCantidad(StringtoInt(rs.getString(5)));
                ea.setDuracion(StringtoInt(rs.getString(6)));
                
                EA.setEmpleados(rs.getString(1));
                EA.setElemento(ea.getElemento());
                EA.setActual(ea.getActual());
                EA.setNumero(ea.getNumero());
                EA.setCantidad(ea.getCantidad());
                EA.setDuracion(ea.getDuracion());
            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return EA;
    }
    //Read
    public ArrayList<DTO_Elementos_Asignados> listarElementos_Asignados(){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "select * from elementos_asignados";
        
        bitacora("Leer", consulta, "");

        Statement st = null;
        ResultSet rs = null;
        ArrayList<DTO_Elementos_Asignados> listaElementos_Asignados = new ArrayList<DTO_Elementos_Asignados>();
        
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                Elementos_Asignados ea = new Elementos_Asignados();
                
                ea.setEmpleados(Double.parseDouble(rs.getString(1)));
                ea.setElemento(StringtoInt(rs.getString(2)));
                ea.setActual(rs.getString(3));
                ea.setNumero(StringtoInt(rs.getString(4)));
                ea.setCantidad(StringtoInt(rs.getString(5)));
                ea.setDuracion(StringtoInt(rs.getString(6)));
                
                DTO_Elementos_Asignados EA = new DTO_Elementos_Asignados();
                
                EA.setEmpleados(rs.getString(1));
                EA.setElemento(ea.getElemento());
                EA.setActual(ea.getActual());
                EA.setNumero(ea.getNumero());
                EA.setCantidad(ea.getCantidad());
                EA.setDuracion(ea.getDuracion());
                
                listaElementos_Asignados.add(EA);

            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return listaElementos_Asignados;
        
    }
public ArrayList<DTO_EAE> listarElementos_Asignados2(){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "    SELECT em.identificacion, (em.nombre_1  ||' '||  em.nombre_2  ||' '||  em.apellido_1  ||' '||  em.apellido_2) nombre_completo,\n" +
        "    ele.elemento, elas.cantidad, elas.duracion, elas.numero talla\n" +
        "    FROM empleados em, elementos_asignados elas, elementos ele\n" +
        "    WHERE elas.empleado = em.identificacion and ele.codigo = elas.elemento\n" +
        "    ORDER BY em.identificacion, ele.elemento ASC";

        bitacora("Leer", consulta, "");
        
        Statement st = null;
        ResultSet rs = null;
        ArrayList<DTO_EAE> listaElementos_Asignados = new ArrayList<DTO_EAE>();
        
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                DTO_EAE EA = new DTO_EAE();
                
                EA.setIdentificacion(rs.getString(1));
                EA.setNombre(rs.getString(2));
                EA.setElemento(rs.getString(3));
                EA.setCantidad(StringtoInt(rs.getString(4)));
                EA.setDuracion(StringtoInt(rs.getString(5)));
                EA.setTalla(StringtoInt(rs.getString(6)));
                
                listaElementos_Asignados.add(EA);

            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return listaElementos_Asignados;
        
    }
public ArrayList<DTO_EE> listarElementos_Asignados3(){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "    SELECT emp.identificacion, (emp.nombre_1  ||' '||  emp.nombre_2  ||' '||  emp.apellido_1  ||' '||  emp.apellido_2) nombre_completo, ele.elemento\n" +
            "    FROM entrega_elementos ent, empleados emp, elementos ele\n" +
            "    WHERE ent.elemento = ele.codigo and ent.empleado = emp.identificacion\n" +
            "    ORDER BY emp.identificacion";

        bitacora("Leer", consulta, "");
        
        Statement st = null;
        ResultSet rs = null;
        ArrayList<DTO_EE> listaElementos_Asignados = new ArrayList<DTO_EE>();
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                DTO_EE EA = new DTO_EE();
                
                EA.setIdentificacion(rs.getString(1));
                EA.setNombre(rs.getString(2));
                EA.setElemento(rs.getString(3));
                
                listaElementos_Asignados.add(EA);

            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return listaElementos_Asignados;
        
    }
    //Create
    public boolean  insertarElementos_Asignados(Double empleados, int elemento, String actual, int numero, int cantidad, int Duracion){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "insert into elementos_asignados values (?,?,?,?,?,?)";
            
            String datos = String.valueOf(empleados) + ", " + String.valueOf(elemento) + ", " + actual + ", " + String.valueOf(numero) + ", " + String.valueOf(cantidad) + ", " + String.valueOf(Duracion);
            bitacora("Insertar", sql, datos);
            
            int empl = (int) Math.round(empleados);
            
            secuencia = con.prepareStatement(sql);
            secuencia.setInt(1,(int) Math.round(empleados));
            secuencia.setInt(2, elemento);
            String aux = actual;
            secuencia.setString(3, aux);
            secuencia.setInt(4, numero);
            secuencia.setInt(5, cantidad);
            secuencia.setInt(6, Duracion);
            secuencia.execute();

            secuencia.close();

            con.commit();
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Elementos_Asignados.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            return false;
        }
    }
    //Update
    public boolean UpdateElementos_Asignados(Double iden, int iden2, String iden3, Double empleados, int elemento, String actual, int numero, int cantidad, int Duracion){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "UPDATE elementos_asignados ";
            sql += "SET empleado = ?, elemento = ? ";
            sql += ", actual =";
            sql += "'"+actual+"'";
            sql += ", numero = ?, cantidad = ?, duracion = ?";
            sql += " WHERE empleado = ? and elemento = ? and actual = ";
            sql += "'"+iden3+"'";
            
            String datos = String.valueOf(empleados) + ", " + String.valueOf(elemento) + ", " + String.valueOf(numero) + ", " + String.valueOf(cantidad) + ", " + String.valueOf(Duracion) + ", " + String.valueOf(iden) + ", " + String.valueOf(iden2);
            bitacora("Update", sql, datos);
            
            secuencia = con.prepareStatement(sql);

            secuencia.setInt(1, (int)Math.round(empleados));
            secuencia.setInt(2, elemento);
            secuencia.setInt(3, numero);
            secuencia.setInt(4, cantidad);
            secuencia.setInt(5, Duracion);
            secuencia.setInt(6, (int)Math.round(iden));
            secuencia.setInt(7, iden2);
            
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
    public void DeleteElementos_Asignados(Double aux, int aux2, String aux3){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            
            String actual = aux3.replace("\n","");
            
            String sql = "DELETE FROM elementos_asignados ";
            sql += "WHERE empleado = ? and elemento = ? and actual = ";
            sql += "'"+actual+"'";
          
            String datos = aux + " " + aux2;
            bitacora("Delete", sql, datos);
            
            int aux4 = (int)Math.round(aux);
            
            secuencia = con.prepareStatement(sql);

            secuencia.setInt(1, aux4);
            secuencia.setInt(2, aux2);
            
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

package Oracle.DAO;

import Oracle.DTO.DTO_Elemento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Oracle.Modelo.Elemento;
import Oracle.Singleton.SingletonMaster;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @Autor Samuel
 */
public class DAO_Elemento {
private int ventana = -1;
    
    public void setVentana(int ven){
        ventana = ven;
    }
    
    private void conectarDB(int ventana){
        SingletonMaster.getInstance(ventana);
    }
    
    
    public DTO_Elemento LeerElemento(String aux){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "select * from elementos where codigo = ";
        consulta += aux;
        
        bitacora("Leer", consulta, "");
        
        Statement st = null;
        ResultSet rs = null;
        DTO_Elemento De = new DTO_Elemento();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                Elemento el = new Elemento();
                
                el.setCodigo(Double.parseDouble(rs.getString(1)));
                el.setElemento(rs.getString(2));
                el.setDevolutivo(rs.getString(3));
                el.setTalla(rs.getString(4));
                el.setUso(rs.getString(5));
                el.setMateriales(rs.getString(6));
                el.setMantenimiento(rs.getString(7));
                el.setUsos(rs.getString(8));
                el.setNorma(rs.getString(9));
                el.setAtenuacion(rs.getString(10));
                el.setSerial(rs.getString(11));
                el.setTallas(rs.getString(12));
                el.setUnidad(StringtoInt(rs.getString(13)));
                el.setRuta(rs.getString(14));
                el.setVida_util(StringtoInt(rs.getString(15)));
                el.setPrecio_actual(StringtoInt(rs.getString(16)));
                el.setCantidad_elementos(StringtoInt(rs.getString(17)));

                
                
                De.setCodigo(el.getCodigo());
                De.setElemento(el.getElemento());
                De.setDevolutivo(el.getDevolutivo());
                De.setTalla(el.getTalla());
                De.setUso(el.getUso());
                De.setMateriales(el.getMateriales());
                De.setMantenimiento(el.getMantenimiento());
                De.setUsos(el.getUsos());
                De.setNorma(el.getNorma());
                De.setAtenuacion(el.getAtenuacion());
                De.setSerial(el.getSerial());
                De.setTallas(el.getTallas());
                De.setUnidad(el.getUnidad());
                De.setRuta(el.getRuta());
                De.setVida_util(el.getVida_util());
                De.setPrecio_actual(el.getPrecio_actual());
                De.setCantidad_elementos(el.getCantidad_elementos());
            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return De;
    }
    
    
    //Read
    public ArrayList<DTO_Elemento> listarElementos(){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "select * from elementos";
        
        bitacora("Leer", consulta, "");

        Statement st = null;
        ResultSet rs = null;
        ArrayList<DTO_Elemento> listaElemento = new ArrayList<DTO_Elemento>();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                Elemento el = new Elemento();
                
                el.setCodigo(Double.parseDouble(rs.getString(1)));
                el.setElemento(rs.getString(2));
                el.setDevolutivo(rs.getString(3));
                el.setTalla(rs.getString(4));
                el.setUso(rs.getString(5));
                el.setMateriales(rs.getString(6));
                el.setMantenimiento(rs.getString(7));
                el.setUsos(rs.getString(8));
                el.setNorma(rs.getString(9));
                el.setAtenuacion(rs.getString(10));
                el.setSerial(rs.getString(11));
                el.setTallas(rs.getString(12));
                el.setUnidad(StringtoInt(rs.getString(13)));
                el.setRuta(rs.getString(14));
                el.setVida_util(StringtoInt(rs.getString(15)));
                el.setPrecio_actual(StringtoInt(rs.getString(16)));
                el.setCantidad_elementos(StringtoInt(rs.getString(17)));

                DTO_Elemento De = new DTO_Elemento();
                
                De.setCodigo(el.getCodigo());
                De.setElemento(el.getElemento());
                De.setDevolutivo(el.getDevolutivo());
                De.setTalla(el.getTalla());
                De.setUso(el.getUso());
                De.setMateriales(el.getMateriales());
                De.setMantenimiento(el.getMantenimiento());
                De.setUsos(el.getUsos());
                De.setNorma(el.getNorma());
                De.setAtenuacion(el.getAtenuacion());
                De.setSerial(el.getSerial());
                De.setTallas(el.getTallas());
                De.setUnidad(el.getUnidad());
                De.setRuta(el.getRuta());
                De.setVida_util(el.getVida_util());
                De.setPrecio_actual(el.getPrecio_actual());
                De.setCantidad_elementos(el.getCantidad_elementos());

                listaElemento.add(De);

            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return listaElemento;
        
    }
    //Create
    public boolean insertarElemento(int codigo, String elemento, String devolutivo, String talla, String uso, String materiales, String mantenimiento, String usos, String norma, String atenuacion, String serial, String tallas, int unidad, String ruta, int vida_util, int precio_actual, int cantidad_elementos){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "insert into elementos values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            String datos = codigo + ", " + elemento + ", " + devolutivo + ", " + talla + ", " + uso + ", " + materiales + ", " + mantenimiento + ", " + usos + ", " + norma + ", " + atenuacion + ", " + serial + ", " + tallas + ", " + unidad + ", " + ruta + ", " + vida_util + ", " + precio_actual + ", " + cantidad_elementos; 
            bitacora("Insertar", sql, datos);
            
            secuencia = con.prepareStatement(sql);
            
            secuencia.setInt(1, codigo);
            secuencia.setString(2, elemento);
            secuencia.setString(3, devolutivo);
            secuencia.setString(4, talla);
            secuencia.setString(5, uso);
            secuencia.setString(6, materiales);
            secuencia.setString(7, mantenimiento);
            secuencia.setString(8, usos);
            secuencia.setString(9, norma);
            secuencia.setString(10, atenuacion);
            secuencia.setString(11, serial);            
            secuencia.setString(12, tallas);
            secuencia.setInt(13, unidad);
            secuencia.setString(14, ruta);
            secuencia.setInt(15, vida_util);
            secuencia.setInt(16, precio_actual);
            secuencia.setInt(17, cantidad_elementos);
                    
            secuencia.execute();

            secuencia.close();

            con.commit();
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Elemento.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            return false;
        }
    }
    //Update
    public boolean UpdateElemento(int iden, int codigo, String elemento, String devolutivo, String talla, String uso, String materiales, String mantenimiento, String usos, String norma, String atenuacion, String serial, String tallas, int unidad, String ruta, int vida_util, int precio_actual, int cantidad_elementos){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "UPDATE elementos ";
            sql += "SET codigo = ?, elemento = ?, devolutivo = ?, talla = ?, uso = ?, materiales = ?, mantenimiento = ?, usos = ?, norma = ?, atenuacion = ?, serial = ?, tallas = ?, unidad = ?, ruta = ?, vida_util = ?, precio_actual = ?, cantidad_elementos = ?";
            sql += "WHERE codigo = ?";
            
            String datos = iden +", "+ codigo + ", " + elemento + ", " + devolutivo + ", " + talla + ", " + uso + ", " + materiales + ", " + mantenimiento + ", " + usos + ", " + norma + ", " + atenuacion + ", " + serial + ", " + tallas + ", " + unidad + ", " + ruta + ", " + vida_util + ", " + precio_actual + ", " + cantidad_elementos; 
            bitacora("Actualizar", sql, datos);
           
            secuencia = con.prepareStatement(sql);
            //  int cantidad_elementos)
            secuencia.setInt(1, codigo);
            secuencia.setString(2, elemento);
            secuencia.setString(3, devolutivo);
            secuencia.setString(4, talla);
            secuencia.setString(5, uso);
            secuencia.setString(6, materiales);
            secuencia.setString(7, mantenimiento);
            secuencia.setString(8, usos);
            secuencia.setString(9, norma);
            secuencia.setString(10, atenuacion);
            secuencia.setString(11, serial);            
            secuencia.setString(12, tallas);
            secuencia.setInt(13, unidad);
            secuencia.setString(14, ruta);
            secuencia.setInt(15, vida_util);
            secuencia.setInt(16, precio_actual);
            secuencia.setInt(17, cantidad_elementos);
            secuencia.setInt(18, iden);
            
            secuencia.execute();

            secuencia.close();

            con.commit();
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Elemento.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            return false;
        }
    }
    //Update
    public void DeleteElemento(int iden){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "DELETE FROM elementos ";
            sql += "WHERE codigo = ?";

            String datos = String.valueOf(iden);
            bitacora("Delete", sql, datos);
            
            secuencia = con.prepareStatement(sql);

            secuencia.setInt(1, iden);
                    
            secuencia.execute();
            secuencia.close();
            con.commit();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Elemento.class.getName()).log(Level.SEVERE, null, ex);
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

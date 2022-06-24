package Oracle.DAO;

import Oracle.DTO.DTO_Cargo;
import Oracle.Singleton.SingletonMaster;
import Oracle.Modelo.Cargo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @Autor Samuel
 */
public class DAO_Cargo {
    private int ventana = -1;
    
    public void setVentana(int ven){
        ventana = ven;
    }
    
    private void conectarDB(int ventana){
        SingletonMaster.getInstance(ventana);
    }
    
    public DTO_Cargo LeerCargo(String aux){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "select * from cargos where cod_cargo = ";
        bitacora("Leer", consulta, aux);
        consulta += aux;
        Statement st = null;
        ResultSet rs = null;
        DTO_Cargo Car = new DTO_Cargo();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                Cargo ca = new Cargo();
                
                ca.setCod_cargo(StringtoInt(rs.getString(1)));
                ca.setCargo(rs.getString(2));

                Car.setCod_cargo(ca.getCod_cargo() );
                Car.setCargo(ca.getCargo()); 
            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return Car;
    }
    //Read    
    public ArrayList<DTO_Cargo> listarCargos(){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "select * from cargos";
        bitacora("Leer", consulta, "");
        Statement st = null;
        ResultSet rs = null;
        ArrayList<DTO_Cargo> listaCargo = new ArrayList<DTO_Cargo>();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                Cargo ca = new Cargo();
                
                ca.setCod_cargo(StringtoInt(rs.getString(1)));
                ca.setCargo(rs.getString(2));
                
                DTO_Cargo Car = new DTO_Cargo();
                
                Car.setCod_cargo(ca.getCod_cargo() );
                Car.setCargo(ca.getCargo()); 

                listaCargo.add(Car);

            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return listaCargo;
        
    }
    public ArrayList<DTO_Cargo> listarCargos2(String aux){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "SELECT * FROM cargos WHERE cargo LIKE '%";
        consulta += aux;
        consulta +=         "%'";
        bitacora("Leer", consulta, aux);
        Statement st = null;
        ResultSet rs = null;
        ArrayList<DTO_Cargo> listaCargo = new ArrayList<DTO_Cargo>();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                Cargo ca = new Cargo();
                
                ca.setCod_cargo(StringtoInt(rs.getString(1)));
                ca.setCargo(rs.getString(2));
                

                DTO_Cargo Car = new DTO_Cargo();
                
                Car.setCod_cargo(ca.getCod_cargo() );
                Car.setCargo(ca.getCargo()); 

                listaCargo.add(Car);

            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return listaCargo;
        
    }
    //Create
    public boolean insertarCargo(int cod_cargo, String cargos){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "insert into cargos values (?,?)";
            String datos = String.valueOf(sql)+", " + cargos;
            bitacora("Insertar", sql, datos);
            secuencia = con.prepareStatement(sql);
            
            secuencia.setInt(1, cod_cargo);
            secuencia.setString(2, cargos);
                    
            secuencia.execute();

            secuencia.close();

            con.commit();
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Cargo.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            return false;
        }
    }
    //Update
    public boolean UpdateCargo(int iden, int cod_cargo, String cargo){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "UPDATE cargos ";
            sql += "SET cod_cargo = ?, cargo = ? ";
            sql += "WHERE cod_cargo = ?";
            String datos = String.valueOf(iden)+", " + String.valueOf(cod_cargo)+", "+cargo;
            bitacora("Actualizar", sql, datos);
            secuencia = con.prepareStatement(sql);

            secuencia.setInt(1, cod_cargo);
            secuencia.setString(2, cargo);
            secuencia.setInt(3, iden);
            
            secuencia.execute();

            secuencia.close();

            con.commit();
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Cargo.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            return false;
        }
    }
    //Update
    public void DeleteCargo(int iden){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "DELETE FROM cargos ";
            sql += "WHERE cod_cargo = ?";
            
            String datos = String.valueOf(iden);
            bitacora("Borrar", sql, datos);
            
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
                Logger.getLogger(DAO_Cargo.class.getName()).log(Level.SEVERE, null, ex);
            }
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
}

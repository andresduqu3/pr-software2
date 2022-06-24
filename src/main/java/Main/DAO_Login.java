/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 * @Autor Alejandro
 */
public class DAO_Login {
    
    public boolean buscarlogin(String usuario, String contrasena){
        Connection con = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "samuel";
        String pass = "12345678";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, pass);
            con.setAutoCommit(false);
            if(con != null){
                System.out.println("conexion exitosa");
            }else{
                System.out.println("error de conexion");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "error: "+e.getMessage());
        }
        boolean bandera = false;        
        String consulta = "select * from usuarios_proyecto";
        
        try {
            Statement st = null;
            ResultSet rs = null;
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                if(rs.getString(1).equals(usuario) && rs.getString(2).equals(getMD5(contrasena))){
                    System.out.println("Existe");
                    bandera=true;
                }

            }
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
        System.out.println(bandera);
        return bandera;
    }
    
    public void insertarUsuario(String usuario, String contrasena){
        Connection con = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "samuel";
        String pass = "12345678";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, pass);
            con.setAutoCommit(false);
            if(con != null){
                System.out.println("conexion exitosa");
            }else{
                System.out.println("error de conexion");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "error: "+e.getMessage());
        }
        PreparedStatement ps = null;
        String sql = "insert into usuarios_proyecto (usuario, contrasena) values (?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, getMD5(contrasena));
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
            con.commit();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
    
    public boolean cambiarContrasena( String usuario, String contrasena_v, String contrasena_n){
        Connection con = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "samuel";
        String pass = "12345678";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, pass);
            con.setAutoCommit(false);
            if(con != null){
                System.out.println("conexion exitosa");
            }else{
                System.out.println("error de conexion");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "error: "+e.getMessage());
        }
        PreparedStatement ps = null;
        String sql = "update usuarios_proyecto set contrasena=? where usuario=? and contrasena = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, getMD5(contrasena_n));
            ps.setString(2, usuario);
            ps.setString(3, getMD5(contrasena_v));
            var a = ps.execute();
            con.commit();
            ps.close();
            return a;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
        return false;
    }
    
    private static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
            }
            return hashtext;
        }catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}

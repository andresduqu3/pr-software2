package Oracle.DAO;

import Oracle.DTO.DTO_Empleado;
import Oracle.Modelo.Empleado;
import Oracle.Singleton.SingletonMaster;

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
public class DAO_Empleado {
    private int ventana = -1;
    
    public void setVentana(int ven){
        ventana = ven;
    }
    
    private void conectarDB(int ventana){
        SingletonMaster.getInstance(ventana);
    }
    
    public DTO_Empleado LeerEmpleado(String aux){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "select * from empleados where identificacion = ";
        consulta += aux;
        bitacora("Leer", consulta, aux);
        Statement st = null;
        ResultSet rs = null;
        DTO_Empleado De = new DTO_Empleado();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                
                Empleado em = new Empleado();
                em.setIdentificacion(Double.parseDouble(rs.getString(1)));
                em.setTipo(rs.getString(2));
                em.setNombre1(rs.getString(3));
                em.setNombre2(rs.getString(4));            
                em.setApellido1(rs.getString(5));
                em.setApellido2(rs.getString(6)); 
                em.setSexo(rs.getString(7));
                em.setFecha(rs.getString(8));
                em.setLugar(rs.getString(9));
                em.setDireccion(rs.getString(10));
                em.setTelefono(rs.getString(11));
                em.setEmail(rs.getString(12));
                em.setSalario(rs.getString(13));
                em.setActivo(rs.getString(14));
                em.setClave(rs.getString(15));
                
                De.setIdentificacion(rs.getString(1));
                De.setTipo(em.getTipo());
                De.setNombre1(em.getNombre1());
                De.setNombre2(em.getNombre2());            
                De.setApellido1(em.getApellido1());
                De.setApellido2(em.getApellido2()); 
                De.setSexo(em.getSexo());
                De.setEmail(em.getEmail());
                De.setFecha(em.getFecha());
                De.setLugar(em.getLugar());
                De.setDireccion(em.getDireccion());
                De.setTelefono(em.getTelefono());
                De.setSalario(em.getSalario());
                De.setActivo(em.getActivo());
                De.setClave(em.getClave());
            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return De;
    }
    //Read
    public ArrayList<DTO_Empleado> listarEmpleados(){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "select identificacion, tipo, nombre_1, nombre_2, apellido_1, apellido_2, sexo, fecha_n, lugar_n, direccion, telefono, email, salario, activo, clave from empleados";

        bitacora("Leer", consulta, "");
        
        Statement st = null;
        ResultSet rs = null;
        ArrayList<DTO_Empleado> listaEmpleado = new ArrayList<DTO_Empleado>();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                Empleado em = new Empleado();
                em.setIdentificacion(Double.parseDouble(rs.getString(1)));
                em.setTipo(rs.getString(2));
                em.setNombre1(rs.getString(3));
                em.setNombre2(rs.getString(4));            
                em.setApellido1(rs.getString(5));
                em.setApellido2(rs.getString(6)); 
                em.setSexo(rs.getString(7));
                em.setFecha(rs.getString(8));
                em.setLugar(rs.getString(9));
                em.setDireccion(rs.getString(10));
                em.setTelefono(rs.getString(11));
                em.setEmail(rs.getString(12));
                em.setSalario(rs.getString(13));
                em.setActivo(rs.getString(14));
                em.setClave(rs.getString(15));
                
                DTO_Empleado De = new DTO_Empleado();
                
                De.setIdentificacion(rs.getString(1));
                De.setTipo(em.getTipo());
                De.setNombre1(em.getNombre1());
                De.setNombre2(em.getNombre2());            
                De.setApellido1(em.getApellido1());
                De.setApellido2(em.getApellido2()); 
                De.setSexo(em.getSexo());
                De.setEmail(em.getEmail());
                De.setFecha(em.getFecha());
                De.setLugar(em.getLugar());
                De.setDireccion(em.getDireccion());
                De.setTelefono(em.getTelefono());
                De.setSalario(em.getSalario());
                De.setActivo(em.getActivo());
                De.setClave(em.getClave());

                listaEmpleado.add(De);

            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return listaEmpleado;
        
    }
public ArrayList<DTO_Empleado> listarEmpleados2(){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "select identificacion, nombre_1 ||' '||nombre_2 ||' '|| apellido_1 ||' '|| apellido_2, fecha_n, lugar_n, salario from empleados ";
        consulta += "order by identificacion";
        
        bitacora("Leer", consulta, "");
        
        Statement st = null;
        ResultSet rs = null;
        ArrayList<DTO_Empleado> listaEmpleado = new ArrayList<DTO_Empleado>();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                Empleado em = new Empleado();
                em.setIdentificacion(Double.parseDouble(rs.getString(1)));
                em.setNombre1(rs.getString(2)); 
                em.setFecha(rs.getString(3));
                em.setLugar(rs.getString(4));
                em.setSalario(rs.getString(5));
                
                DTO_Empleado De = new DTO_Empleado();
                
                De.setIdentificacion(rs.getString(1));
                De.setNombre1(em.getNombre1());
                De.setFecha(em.getFecha());
                De.setLugar(em.getLugar());
                De.setSalario(em.getSalario());

                listaEmpleado.add(De);

            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return listaEmpleado;
        
    }
public ArrayList<DTO_Empleado> listarEmpleados3(){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "    SELECT em.identificacion,  em.nombre_1  ||' '||  em.nombre_2  ||' '||  em.apellido_1  ||' '||  em.apellido_2, car.cargo, his.fecha_ingreso \n" +
        "    FROM empleados em, cargos car, historial_laboral his\n" +
        "    WHERE em.identificacion = his.empleado and car.COD_CARGO = his.CARGO\n" +
        "    ORDER BY em.identificacion, his.fecha_ingreso DESC";
        
        bitacora("Leer", consulta, "");
        
        Statement st = null;
        ResultSet rs = null;
        ArrayList<DTO_Empleado> listaEmpleado = new ArrayList<DTO_Empleado>();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                Empleado em = new Empleado();
                em.setIdentificacion(Double.parseDouble(rs.getString(1)));
                em.setNombre1(rs.getString(2)); 
                em.setNombre2(rs.getString(3));
                em.setFecha(rs.getString(4));
                
                DTO_Empleado De = new DTO_Empleado();
                
                De.setIdentificacion(rs.getString(1));
                De.setNombre1(em.getNombre1());
                De.setNombre2(em.getNombre2());
                De.setFecha(em.getFecha());
                

                listaEmpleado.add(De);

            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return listaEmpleado;
        
    }
    //Create
    public boolean insertarEmpleado(int identificacion, String tipo, String nombre1, String nombre2, String apellido1, String apellido2, String sexo, String fecha, String lugar, String direccion, String telefono, String email, int salario, String activo, String clave){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "insert into empleados values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            String datos = String.valueOf(identificacion)+", " + tipo+", "+nombre1+", "+nombre2+", "+apellido1+", "+apellido2+", "+sexo+", "+fecha+", "+lugar+", "+direccion+", "+telefono+", "+email+", "+String.valueOf(salario)+", "+activo+", "+clave;
            bitacora("Insertar", sql, datos);
            
            secuencia = con.prepareStatement(sql);
            
            secuencia.setInt(1, identificacion);
            secuencia.setString(2, tipo);
            secuencia.setString(3, nombre1);
            secuencia.setString(4, nombre2);
            secuencia.setString(5, apellido1);
            secuencia.setString(6, apellido2);
            secuencia.setString(7, sexo);
            secuencia.setString(8, fecha);
            secuencia.setString(9, lugar);
            secuencia.setString(10, direccion);
            secuencia.setString(11, telefono);            
            secuencia.setString(12, email);
            secuencia.setInt(13, salario);
            secuencia.setString(14, activo);
            secuencia.setString(15, clave);
                    
            secuencia.execute();

            secuencia.close();

            con.commit();
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Empleado.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            return false;
        }
    }
    //Update
    public boolean UpdateEmpleado(int iden, int identificacion, String tipo, String nombre1, String nombre2, String apellido1, String apellido2, String sexo, String fecha, String lugar, String direccion, String telefono, String email, int salario, String activo, String clave){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "UPDATE empleados ";
            sql += "SET identificacion = ?, tipo = ?, nombre_1 = ?, nombre_2 = ?, apellido_1 = ?, apellido_2 = ?, sexo = ?, fecha_n = TO_DATE(?, 'YYYY/MM/DD'), lugar_n = ?, direccion = ?, telefono = ?, email = ?, salario = ?, activo = ?, clave = ? ";
            sql += "WHERE identificacion = ?";
            String datos = String.valueOf(iden)+", " + String.valueOf(identificacion)+", " + tipo+", "+nombre1+", "+nombre2+", "+apellido1+", "+apellido2+", "+sexo+", "+fecha+", "+lugar+", "+direccion+", "+telefono+", "+email+", "+String.valueOf(salario)+", "+activo+", "+clave;
            bitacora("Actualizar", sql, datos);
            
            secuencia = con.prepareStatement(sql);
            
            secuencia.setInt(1, identificacion);
            secuencia.setString(2, tipo);
            secuencia.setString(3, nombre1);
            secuencia.setString(4, nombre2);
            secuencia.setString(5, apellido1);
            secuencia.setString(6, apellido2);
            secuencia.setString(7, sexo);
            fecha = fecha.split(" ")[0].replace("-","/");
            secuencia.setString(8, fecha);
            secuencia.setString(9, lugar);
            secuencia.setString(10, direccion);
            secuencia.setString(11, telefono);            
            secuencia.setString(12, email);
            secuencia.setInt(13, salario);
            secuencia.setString(14, activo);
            secuencia.setString(15, clave);
            secuencia.setInt(16, iden);
            secuencia.execute();

            secuencia.close();

            con.commit();
            return true;
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            try {
                con.rollback();
            } catch (SQLException ex) {
                Logger.getLogger(DAO_Empleado.class.getName()).log(Level.SEVERE, null, ex);
            }
 
            return false;
        }
    }
    //Update
    public void DeleteEmpleado(int iden){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        try {
            PreparedStatement secuencia = null;
            String sql = "DELETE FROM empleados ";
            sql += "WHERE identificacion = ?";
            bitacora("Delete", sql, String.valueOf(iden));
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
                Logger.getLogger(DAO_Empleado.class.getName()).log(Level.SEVERE, null, ex);
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
    
}

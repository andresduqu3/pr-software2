package Oracle.DAO;

import Oracle.DTO.DTO_Bitacora;
import Oracle.Singleton.SingletonMaster;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @Autor Samuel
 */
public class DAO_Bitacora {
    private int ventana = -1;
    
    public void setVentana(int ven){
        ventana = ven;
    }
    
    private void conectarDB(int ventana){
        SingletonMaster.getInstance(ventana);
    }
    public ArrayList<DTO_Bitacora> listarBitacoras(){
        conectarDB(ventana);
        Connection con = SingletonMaster.getCone(ventana);
        String consulta = "select * from bitacora";
        Statement st = null;
        ResultSet rs = null;
        ArrayList<DTO_Bitacora> listaBitacora = new ArrayList<DTO_Bitacora>();
        try {
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            
            while (rs.next()) {
                DTO_Bitacora Car = new DTO_Bitacora();
                
                Car.setConexion(rs.getString(1));
                Car.setHora(rs.getString(2));
                Car.setFecha(rs.getString(3));
                Car.setAccion(rs.getString(4));
                Car.setSql(rs.getString(5));
                Car.setDatos(rs.getString(6));
                
                listaBitacora.add(Car);

            }
         
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
       
        return listaBitacora;
        
    }
}

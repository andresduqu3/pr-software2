package Oracle.Controlador;

import Oracle.DTO.DTO_Historial_Laboral;
import Oracle.DAO.DAO_Historial_Laboral;
import java.util.ArrayList;
/**
 * @Autor Samuel
 */
public class MasterHistorial_Laboral {
    public DTO_Historial_Laboral leerHistorial_Laboral(int vent, String aux, String aux2){
        DAO_Historial_Laboral DE = new DAO_Historial_Laboral();
        DE.setVentana(vent);
        return DE.LeerHistorial_Laboral(aux, aux2);
    }
    public ArrayList<DTO_Historial_Laboral> listarHistorial(int vent){
        DAO_Historial_Laboral DE = new DAO_Historial_Laboral();
        DE.setVentana(vent);
        return DE.listarHistorial();
    }
    public void BorrarHistorial_Laboral(int vent, int iden, String iden2){
        DAO_Historial_Laboral DE = new DAO_Historial_Laboral();
        DE.setVentana(vent);
        DE.DeleteHistorial_Laboral(iden, iden2);
    }
    
    public void UpdateHistorial_Laboral(int vent, int iden1, String iden2, int empleado, String fecha_ingreso, String fecha_salida, int cargo, String actual){
        DAO_Historial_Laboral DE = new DAO_Historial_Laboral();
        DE.setVentana(vent);
        DE.UpdateHistorial_Laboral(iden1, iden2, empleado, fecha_ingreso, fecha_salida, cargo, actual);
    }
    
    public void InsertHistorial_Laboral(int vent, int empleado, String fecha_ingreso, String fecha_salida, int cargo, String actual){
        DAO_Historial_Laboral DE = new DAO_Historial_Laboral();
        DE.setVentana(vent);
        DE.insertarHistorial_Laboral(empleado, fecha_ingreso, fecha_salida, cargo, actual);
    }
}

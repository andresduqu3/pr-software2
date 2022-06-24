package Oracle.Controlador;

import Oracle.DTO.DTO_Elementos_Asignados;
import Oracle.DAO.DAO_Elementos_Asignados;
import Oracle.DTO.DTO_EAE;
import Oracle.DTO.DTO_EE;
import java.util.ArrayList;
/**
 * @Autor Samuel
 */
public class MasterElementos_Asignados {
    public ArrayList<DTO_Elementos_Asignados> listarElementos_Asignados(int vent){
        DAO_Elementos_Asignados DE = new DAO_Elementos_Asignados();
        DE.setVentana(vent);
        return DE.listarElementos_Asignados();
    }
    
    public ArrayList<DTO_EAE> listarElementos_Asignados2(int vent){
        DAO_Elementos_Asignados DE = new DAO_Elementos_Asignados();
        DE.setVentana(vent);
        return DE.listarElementos_Asignados2();
    }
    
    public ArrayList<DTO_EE> listarElementos_Asignados3(int vent){
        DAO_Elementos_Asignados DE = new DAO_Elementos_Asignados();
        DE.setVentana(vent);
        return DE.listarElementos_Asignados3();
    }
    
    public void UpdateElementos_Asignados(int vent, Double iden, int iden2, String iden3, Double empleados, int elemento, String actual, int numero, int cantidad, int Duracion){
        DAO_Elementos_Asignados DE = new DAO_Elementos_Asignados();
        DE.setVentana(vent);
        DE.UpdateElementos_Asignados(iden, iden2, iden3, empleados, elemento, actual, numero, cantidad, Duracion);
    }
    
    public void BorrarElementos_Asignados(int vent, Double iden, int iden2, String iden3){
        DAO_Elementos_Asignados DE = new DAO_Elementos_Asignados();
        DE.setVentana(vent);
        DE.DeleteElementos_Asignados(iden, iden2, iden3);
    } 
    
    public void InsertElementos_Asignados(int vent,Double empleados, int elemento, String actual, int numero, int cantidad, int Duracion){
        DAO_Elementos_Asignados DE = new DAO_Elementos_Asignados();
        DE.setVentana(vent);
        DE.insertarElementos_Asignados(empleados, elemento, actual, numero, cantidad, Duracion);
    }
}

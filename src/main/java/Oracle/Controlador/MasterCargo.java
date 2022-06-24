package Oracle.Controlador;

import Oracle.DTO.DTO_Cargo;
import Oracle.DAO.DAO_Cargo;
import java.util.ArrayList;
/**
 * @Autor Samuel
 */
public class MasterCargo {
    public DTO_Cargo leerCargo(int vent, String aux){
        DAO_Cargo DE = new DAO_Cargo();
        DE.setVentana(vent);
        return DE.LeerCargo(aux);
    }
    public ArrayList<DTO_Cargo> listarCargos(int vent){
        DAO_Cargo DE = new DAO_Cargo();
        DE.setVentana(vent);
        return DE.listarCargos();
    }
    public ArrayList<DTO_Cargo> listarCargos2(int vent, String aux){
        DAO_Cargo DE = new DAO_Cargo();
        DE.setVentana(vent);
        return DE.listarCargos2(aux);
    }   
    public void BorrarCargo(int vent, int iden){
        DAO_Cargo DE = new DAO_Cargo();
        DE.setVentana(vent);
        DE.DeleteCargo(iden);
    }
    
    public void UpdateCargo(int vent, int iden, int cod_cargo, String cargo){
        DAO_Cargo DE = new DAO_Cargo();
        DE.setVentana(vent);
        DE.UpdateCargo(iden, cod_cargo, cargo);
    }
    
    public void InsertCargo(int vent, int cod_cargo, String cargo){
        DAO_Cargo DE = new DAO_Cargo();
        DE.setVentana(vent);
        DE.insertarCargo(cod_cargo, cargo);
    }
}

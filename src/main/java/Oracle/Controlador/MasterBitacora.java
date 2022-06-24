package Oracle.Controlador;

import Oracle.DAO.DAO_Bitacora;
import Oracle.DTO.DTO_Bitacora;
import java.util.ArrayList;
/**
 * @Autor Samuel
 */
public class MasterBitacora {
    public ArrayList<DTO_Bitacora> listarBitacoras(int vent){
        DAO_Bitacora DE = new DAO_Bitacora();
        DE.setVentana(vent);
        return DE.listarBitacoras();
    }
}

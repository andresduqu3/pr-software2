package Oracle.Controlador;

import Oracle.DTO.DTO_Elemento;
import Oracle.DAO.DAO_Elemento;
import java.util.ArrayList;
/**
 * @Autor Samuel
 */
public class MasterElemento { 
    public DTO_Elemento leerElemento(int vent, String aux){
        DAO_Elemento DE = new DAO_Elemento();
        DE.setVentana(vent);
        return DE.LeerElemento(aux);
    }
    public ArrayList<DTO_Elemento> listarElemento(int vent){
        DAO_Elemento DE = new DAO_Elemento();
        DE.setVentana(vent);
        return DE.listarElementos();
    }
    
    public void BorrarElemento(int vent, int iden){
        DAO_Elemento DE = new DAO_Elemento();
        DE.setVentana(vent);
        DE.DeleteElemento(iden);
    }
    
    public void UpdateElemento(int vent, int iden, int codigo, String elemento, String devolutivo, String talla, String uso, String materiales, String mantenimiento, String usos, String norma, String atenuacion, String serial, String tallas, int unidad, String ruta, int vida_util, int precio_actual, int cantidad_elementos){
        DAO_Elemento DE = new DAO_Elemento();
        DE.setVentana(vent);
        DE.UpdateElemento(iden, codigo, elemento, devolutivo, talla, uso, materiales, mantenimiento, usos, norma, atenuacion, serial, tallas, unidad, ruta, vida_util, precio_actual, cantidad_elementos);
    }
    
    public void InsertElemento(int vent, int codigo, String elemento, String devolutivo, String talla, String uso, String materiales, String mantenimiento, String usos, String norma, String atenuacion, String serial, String tallas, int unidad, String ruta, int vida_util, int precio_actual, int cantidad_elementos){
        DAO_Elemento DE = new DAO_Elemento();
        DE.setVentana(vent);
        DE.insertarElemento(codigo, elemento, devolutivo, talla, uso, materiales, mantenimiento, usos, norma, atenuacion, serial, tallas, unidad, ruta, vida_util, precio_actual, cantidad_elementos);
    }
}

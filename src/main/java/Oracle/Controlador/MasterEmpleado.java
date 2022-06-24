package Oracle.Controlador;

import Oracle.DTO.DTO_Empleado;
import Oracle.DAO.DAO_Empleado;
import java.util.ArrayList;


/**
 * @Autor Samuel
 */
public class MasterEmpleado {
    public DTO_Empleado leerEmpleado(int vent, String aux){
        DAO_Empleado DE = new DAO_Empleado();
        DE.setVentana(vent);
        return DE.LeerEmpleado(aux);
    }
    public ArrayList<DTO_Empleado> listarEmpleado(int vent){
        DAO_Empleado DE = new DAO_Empleado();
        DE.setVentana(vent);
        return DE.listarEmpleados();
    }
    public ArrayList<DTO_Empleado> listarEmpleado2(int vent){
        DAO_Empleado DE = new DAO_Empleado();
        DE.setVentana(vent);
        return DE.listarEmpleados2();
    }
    public ArrayList<DTO_Empleado> listarEmpleado3(int vent){
        DAO_Empleado DE = new DAO_Empleado();
        DE.setVentana(vent);
        return DE.listarEmpleados3();
    }
    public void BorrarEmpleado(int vent, int iden){
        DAO_Empleado DE = new DAO_Empleado();
        DE.setVentana(vent);
        DE.DeleteEmpleado(iden);
    }
    public void UpdateEmpleado(int vent, int iden, int identificacion, String tipo, String nombre1, String nombre2, String apellido1, String apellido2, String sexo, String fecha, String lugar, String direccion, String telefono, String email, int salario, String activo, String clave){
        DAO_Empleado DE = new DAO_Empleado();
        DE.setVentana(vent);
        DE.UpdateEmpleado(iden,identificacion, tipo, nombre1, nombre2, apellido1, apellido2, sexo, fecha, lugar, direccion, telefono, email, salario, activo, clave);
    }
    public void InsertEmpleado(int vent, int identificacion, String tipo, String nombre1, String nombre2, String apellido1, String apellido2, String sexo, String fecha, String lugar, String direccion, String telefono, String email, int salario, String activo, String clave){
        DAO_Empleado DE = new DAO_Empleado();
        DE.setVentana(vent);
        DE.insertarEmpleado(identificacion, tipo, nombre1, nombre2, apellido1, apellido2, sexo, fecha, lugar, direccion, telefono, email, salario, activo, clave);
    }
}

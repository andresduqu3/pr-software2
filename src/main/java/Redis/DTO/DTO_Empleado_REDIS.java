
package Redis.DTO;

public class DTO_Empleado_REDIS {
    private String id;
    private String nombre;
    private String departamento;
    private String funcion;
    private String status;
    private double sueldo;
    private String mes_ingreso;
    private String ano_ingreso;

    public DTO_Empleado_REDIS(String id, String nombre, String departamento, String funcion, String status, 
            double sueldo, String mes_ingreso, String ano_ingreso) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.funcion = funcion;
        this.status = status;
        this.sueldo = sueldo;
        this.mes_ingreso = mes_ingreso;
        this.ano_ingreso = ano_ingreso;
    }

    public DTO_Empleado_REDIS(String id, String nombre, String funcion, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.funcion = funcion;
        this.sueldo = sueldo;
    }

    
    
    @Override
    public String toString() {
        return id + ";" + nombre + ";" + departamento + 
                ";" + funcion + ";" + status + ";" + sueldo + ";" + mes_ingreso + 
                ";" + ano_ingreso;
    }  
    
}

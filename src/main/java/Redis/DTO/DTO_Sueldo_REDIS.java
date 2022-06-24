package Redis.DTO;

public class DTO_Sueldo_REDIS {

    private String id;
    private String nombre;
    private String funcion;
    private double sueldo;

    public DTO_Sueldo_REDIS(String id, String nombre, String funcion, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.funcion = funcion;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return id + ";" + nombre + ";" + funcion + ";" + sueldo;
    }

}

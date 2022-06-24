package Oracle.DTO;

/**
 * @Autor Samuel
 */
public class DTO_Historial_Laboral {
    String empleado;
    String fecha_ingreso;
    String fecha_salida;
    int cargo;
    String actual;

    public DTO_Historial_Laboral(String empleado, String fecha_ingreso, String fecha_salida, int cargo, String actual) {
        this.empleado = empleado;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.cargo = cargo;
        this.actual = actual;
    }

    public DTO_Historial_Laboral() {
        this.empleado = null;
        this.fecha_ingreso = null;
        this.fecha_salida = null;
        this.cargo = 0;
        this.actual = null;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    @Override
    public String toString() {
        return empleado + "," + fecha_ingreso + "," + fecha_salida + "," + cargo + "," + actual + '\n';
    }
   
    
    
}

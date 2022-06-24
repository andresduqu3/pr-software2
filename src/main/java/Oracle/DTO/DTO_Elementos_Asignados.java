package Oracle.DTO;


/**
 * @Autor Samuel
 */
public class DTO_Elementos_Asignados {
    String empleados;
    int elemento;
    String actual;
    int numero;
    int cantidad;
    int Duracion;

    public DTO_Elementos_Asignados(String empleados, int elemento, String actual, int numero, int cantidad, int Duracion) {
        this.empleados = empleados;
        this.elemento = elemento;
        this.actual = actual;
        this.numero = numero;
        this.cantidad = cantidad;
        this.Duracion = Duracion;
    }

    public DTO_Elementos_Asignados() {
        this.empleados = null;
        this.elemento = 0;
        this.actual = null;
        this.numero = 0;
        this.cantidad = 0;
        this.Duracion = 0;
    }

    public String getEmpleados() {
        return empleados;
    }

    public void setEmpleados(String empleados) {
        this.empleados = empleados;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return empleados + "," + elemento + "," + actual + "," + numero + "," + cantidad + "," + Duracion + '\n';
    }
    
    public String toString2() {
        return empleados + "," + elemento+ '\n';
    }    
    
}

package Oracle.DTO;
/**
 * @author csamu
 */
public class DTO_EE {
    String identificacion;
    String nombre;
    String elemento;

    public DTO_EE(String identificacion, String nombre, String elemento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.elemento = elemento;
    }

    public DTO_EE() {
        this.identificacion = null;
        this.nombre = null;
        this.elemento = null;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return identificacion + " " + nombre + " " + elemento + '\n';
    }
    
}

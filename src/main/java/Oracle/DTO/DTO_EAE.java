package Oracle.DTO;
/**
 * @Autor Samuel
 */
public class DTO_EAE {
    String identificacion;
    String nombre;
    String elemento;
    int cantidad;
    int duracion;
    int talla;

    public DTO_EAE(String identificacion, String nombre, String elemento, int cantidad, int duracion, int talla) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.elemento = elemento;
        this.cantidad = cantidad;
        this.duracion = duracion;
        this.talla = talla;
    }

    public DTO_EAE() {
        this.identificacion = null;
        this.nombre = null;
        this.elemento = null;
        this.cantidad = 0;
        this.duracion = 0;
        this.talla = 0;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return  identificacion + " " + nombre + " " + elemento + " " + cantidad + " " + duracion + " " + talla + '\n';
    }
    
    
    
}

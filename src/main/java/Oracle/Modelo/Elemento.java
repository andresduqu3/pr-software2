package Oracle.Modelo;
/**
 * @Autor Samuel
 */
public class Elemento {
    Double codigo;
    String elemento;
    String devolutivo;
    String talla;
    String uso;
    String materiales;
    String mantenimiento;
    String usos;
    String norma;
    String atenuacion;
    String serial;
    String tallas;
    int unidad;
    String ruta;
    int vida_util;
    int precio_actual;
    int cantidad_elementos;

    public Elemento(Double codigo, String elemento, String devolutivo, String talla, String uso, String materiales, String mantenimiento, String usos, String norma, String atenuacion, String serial, String tallas, int unidad, String ruta, int vida_util, int precio_actual, int cantidad_elementos) {
        this.codigo = codigo;
        this.elemento = elemento;
        this.devolutivo = devolutivo;
        this.talla = talla;
        this.uso = uso;
        this.materiales = materiales;
        this.mantenimiento = mantenimiento;
        this.usos = usos;
        this.norma = norma;
        this.atenuacion = atenuacion;
        this.serial = serial;
        this.tallas = tallas;
        this.unidad = unidad;
        this.ruta = ruta;
        this.vida_util = vida_util;
        this.precio_actual = precio_actual;
        this.cantidad_elementos = cantidad_elementos;
    }

    public Elemento() {
        this.codigo = 0.0;
        this.elemento = null;
        this.devolutivo = null;
        this.talla = null;
        this.uso = null;
        this.materiales = null;
        this.mantenimiento = null;
        this.usos = null;
        this.norma = null;
        this.atenuacion = null;
        this.serial = null;
        this.tallas = null;
        this.unidad = 0;
        this.ruta = null;
        this.vida_util = 0;
        this.precio_actual = 0;
        this.cantidad_elementos =0;
    }

    public Double getCodigo() {
        return codigo;
    }

    public void setCodigo(Double codigo) {
        this.codigo = codigo;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getDevolutivo() {
        return devolutivo;
    }

    public void setDevolutivo(String devolutivo) {
        this.devolutivo = devolutivo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public String getUsos() {
        return usos;
    }

    public void setUsos(String usos) {
        this.usos = usos;
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public String getAtenuacion() {
        return atenuacion;
    }

    public void setAtenuacion(String atenuacion) {
        this.atenuacion = atenuacion;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getTallas() {
        return tallas;
    }

    public void setTallas(String tallas) {
        this.tallas = tallas;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getVida_util() {
        return vida_util;
    }

    public void setVida_util(int vida_util) {
        this.vida_util = vida_util;
    }

    public int getPrecio_actual() {
        return precio_actual;
    }

    public void setPrecio_actual(int precio_actual) {
        this.precio_actual = precio_actual;
    }

    public int getCantidad_elementos() {
        return cantidad_elementos;
    }

    public void setCantidad_elementos(int cantidad_elementos) {
        this.cantidad_elementos = cantidad_elementos;
    }

    @Override
    public String toString() {
        return codigo + "," + elemento + "," + devolutivo + "," + talla + "," + uso + "," + materiales + "," + mantenimiento + "," + usos + "," + norma + "," + atenuacion + "," + serial + "," + tallas + "," + unidad + "," + ruta + "," + vida_util + "," + precio_actual + "," + cantidad_elementos;
    }
    
    
    
}

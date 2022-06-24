package Oracle.DTO;
/**
 * @Autor Samuel
 */
public class DTO_Bitacora {
    String conexion;
    String fecha;
    String hora;
    String accion;
    String sql;
    String datos;

    public DTO_Bitacora(String conexion, String fecha, String hora, String accion, String sql, String datos) {
        this.conexion = conexion;
        this.fecha = fecha;
        this.hora = hora;
        this.accion = accion;
        this.sql = sql;
        this.datos = datos;
    }

    public DTO_Bitacora() {
        this.conexion = null;
        this.fecha = null;
        this.hora = null;
        this.accion = null;
        this.sql = null;
        this.datos = null;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return conexion + "," + fecha + "," + hora + "," + accion + "," + sql + "," + datos+"\n";
    }
    
    
}

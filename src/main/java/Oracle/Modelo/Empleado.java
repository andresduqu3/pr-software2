package Oracle.Modelo;
/**
 * @Autor Samuel
 */
public class Empleado {
    Double identificacion;
    String tipo;
    String nombre1;
    String nombre2;
    String apellido1;
    String apellido2;
    String sexo;
    String fecha;
    String lugar;
    String direccion;
    String telefono;
    String email;
    String salario;
    String activo;
    String clave;

    public Empleado(Double identificacion, String tipo, String nombre1, String nombre2, String apellido1, String apellido2, String sexo, String fecha, String lugar, String direccion, String telefono, String email, String salario, String activo, String clave) {
        this.identificacion = identificacion;
        this.tipo = tipo;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.sexo = sexo;
        this.fecha = fecha;
        this.lugar = lugar;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.salario = salario;
        this.activo = activo;
        this.clave = clave;
    }

    
    public Empleado() {
        this.identificacion = null;
        this.tipo = null;
        this.nombre1 = null;
        this.nombre2 = null;
        this.apellido1 = null;
        this.apellido2 = null;
        this.sexo = null;
        this.email = null;
    }

    public Double getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Double identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    

    
}

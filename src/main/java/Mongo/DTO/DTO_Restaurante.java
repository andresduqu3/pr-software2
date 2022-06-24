package Mongo.DTO;

import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Richard
 */
public class DTO_Restaurante {

    private ObjectId id;
    String razon_Social="";

    String municipio="";

    String descripcion_Rnt="";

    String categoria="";

    String subcategoria;

    String estado_Rnt="";
    DTO_Tipo_Plato tipo=new DTO_Tipo_Plato();
    String total="";

    public DTO_Restaurante() {
    }

    public DTO_Restaurante(String razon_Social, String municipio, String descripcion_Rnt, String categoria, String subcategoria, String estado_Rnt, String total, DTO_Tipo_Plato tipo) {
        this.razon_Social = razon_Social;
        this.municipio = municipio;
        this.descripcion_Rnt = descripcion_Rnt;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.estado_Rnt = estado_Rnt;
        this.total = total;
        this.tipo = tipo;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public DTO_Tipo_Plato getTipo() {
        return tipo;
    }

    public void setTipo(DTO_Tipo_Plato tipo) {
        this.tipo = tipo;
    }

    public String getRazon_Social() {
        return razon_Social;
    }

    public void setRazon_Social(String razon_Social) {
        this.razon_Social = razon_Social;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDescripcion_Rnt() {
        return descripcion_Rnt;
    }

    public void setDescripcion_Rnt(String descripcion_Rnt) {
        this.descripcion_Rnt = descripcion_Rnt;
    }

    public String getCategoria() {
        return categoria;
    }

    public Document generarDoc() {
        Document documento = new Document();
        documento.append("Razon Social", razon_Social);
        documento.append("Municipio", municipio);
        documento.append("Descripcion Tipo Rnt", descripcion_Rnt);
        documento.append("Categoria", categoria);
        documento.append("Subcategoria", subcategoria);
        documento.append("Estado Rnt", estado_Rnt);
        documento.append("TOTAL", total);

        return documento;

    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getEstado_Rnt() {
        return estado_Rnt;
    }

    public void setEstado_Rnt(String estado_Rnt) {
        this.estado_Rnt = estado_Rnt;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void mostrar() {
        System.out.println(this.razon_Social + " " + this.municipio);
    }

    @Override
    public String toString() {
        return this.getRazon_Social() + "," + this.getMunicipio() + "," + this.getCategoria()+ "," + this.getSubcategoria()+"," + this.getSubcategoria() + ","+this.getEstado_Rnt()+ "," + this.getTotal() + "," + this.getTipo().getTipo() + "," + this.getTipo().getPrecio_minimo() + ","+this.getTipo().getPrecio_maximo()+","+this.getTipo().getRecomendacion();

    }
}

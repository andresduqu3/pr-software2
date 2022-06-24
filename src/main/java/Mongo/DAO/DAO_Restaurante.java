/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mongo.DAO;

import Cassandra.DTO.DTO_Persona;
import Mongo.DTO.DTO_Restaurante;
import Mongo.DTO.DTO_Tipo_Plato;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.json.simple.JSONObject;

/**
 *
 * @author Richard
 */
public class DAO_Restaurante {

    public void insertar(DTO_Restaurante rest) {

        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(), fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClient mongoClient = new MongoClient("localhost", MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
        MongoDatabase database = mongoClient.getDatabase("'baseProyecto'");
        database = database.withCodecRegistry(pojoCodecRegistry);
        MongoCollection<DTO_Restaurante> collection = database.getCollection("Datos_Mongo", DTO_Restaurante.class);

        collection.insertOne(rest);
//        ConexionMongo con = new ConexionMongo();
//        //System.out.println(prueba);  
//        MongoDatabase db = con.getConexion();
//        //DBCollection tabla = db.getCollection(coleccion);
//        MongoCollection collection = (MongoCollection) db.getCollection(coleccion);
//        collection.insertOne(rest.generarDoc());

//        BasicDBObject documento = new BasicDBObject();
//        documento.put("razon_Social", razon_Social);
//        documento.put("municipio", municipio);
//        documento.put("descripcion_Rnt", descripcion_Rnt);
//        documento.put("categoria", categoria);
//        documento.put("subcategoria", subcategoria);
//        documento.put("estado_Rnt", estado_Rnt);
//        documento.put("total", total);
//        tabla.insert(documento);
    }

    public void actualizar(DTO_Restaurante rest, String coleccion, String razon_social) {
        ConexionMongo con = new ConexionMongo();
        //System.out.println(prueba);  
        MongoDatabase db = con.getConexion();
        MongoCollection collection = (MongoCollection) db.getCollection(coleccion);
        collection.updateOne(new Document("Razon Social", razon_social),
                new Document("$set", rest.generarDoc())
        );

    }

    public void actualizar2(DTO_Restaurante rest, String razon_social) {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(), fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClient mongoClient = new MongoClient("localhost", MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
        MongoDatabase database = mongoClient.getDatabase("'baseProyecto'");
        database = database.withCodecRegistry(pojoCodecRegistry);
        MongoCollection<DTO_Restaurante> collection = database.getCollection("Datos_Mongo", DTO_Restaurante.class);

        //UpdateResult updateResult = collection.updateMany(eq("Razon Social", razon_social), rest.generarDoc());
        //System.out.println(updateResult.getModifiedCount());
//        ConexionMongo con = new ConexionMongo();
//        //System.out.println(prueba);  
//        MongoDatabase db = con.getConexion();
//        MongoCollection collection = (MongoCollection) db.getCollection(coleccion);
//        collection.updateOne(new Document("Razon Social", razon_social),
//                new Document("$set", rest.generarDoc())
//        );
    }

    public void elimiinar(String coleccion, String razon_social) {
        ConexionMongo con = new ConexionMongo();
        MongoDatabase db = con.getConexion();
        MongoCollection collection = (MongoCollection) db.getCollection(coleccion);

        //Delete data
        collection.deleteOne(Filters.eq("Razon Social", razon_social));

    }

    public void elimiinar1(String id) {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(), fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClient mongoClient = new MongoClient("localhost", MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
        MongoDatabase database = mongoClient.getDatabase("'baseProyecto'");
        database = database.withCodecRegistry(pojoCodecRegistry);
        MongoCollection<DTO_Restaurante> collection = database.getCollection("Datos_Mongo", DTO_Restaurante.class);

        DeleteResult deleteResult = collection.deleteMany(eq("razon_Social", id));
        System.out.println(deleteResult.getDeletedCount());
//        ConexionMongo con = new ConexionMongo();
//        MongoDatabase db = con.getConexion();
//        MongoCollection collection = (MongoCollection) db.getCollection(coleccion);
//
//        //Delete data
//        collection.deleteOne(Filters.eq("Razon Social", razon_social));

    }

    public ArrayList<String[]> listar() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(), fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClient mongoClient = new MongoClient("localhost", MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
        MongoDatabase database = mongoClient.getDatabase("'baseProyecto'");
        database = database.withCodecRegistry(pojoCodecRegistry);
        MongoCollection<DTO_Restaurante> collection = database.getCollection("Datos_Mongo", DTO_Restaurante.class);
        //collection = collection.withCodecRegistry(pojoCodecRegistry);

        FindIterable<DTO_Restaurante> iterable = collection.find();
        ArrayList<String[]> listado = new ArrayList<String[]>();
        for (DTO_Restaurante rest : iterable) {
            //rest.mostrar();
            String[] fila = new String[11];
            fila[0] = rest.getRazon_Social();
            fila[1] = rest.getMunicipio();
            fila[2] = rest.getDescripcion_Rnt();
            fila[3] = rest.getCategoria();
            fila[4] = rest.getSubcategoria();
            fila[5] = rest.getEstado_Rnt();
            fila[6] = rest.getTotal() + "";
            if (rest.getTipo() != null) {
                fila[7] = rest.getTipo().getTipo();
                fila[8] = rest.getTipo().getPrecio_minimo() + "";
                fila[9] = rest.getTipo().getPrecio_maximo() + "";
                fila[10] = rest.getTipo().getRecomendacion() + "";

            } else {

                fila[7] = "";
                fila[8] = "";
                fila[9] = "";
                fila[10] = "";
            }

            listado.add(fila);
        }
        //ArrayList<DTO_Restaurante> listado = new ArrayList<DTO_Restaurante>();

        return listado;
    }

    public ArrayList<DTO_Restaurante> listar2() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(), fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClient mongoClient = new MongoClient("localhost", MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());
        MongoDatabase database = mongoClient.getDatabase("'baseProyecto'");
        database = database.withCodecRegistry(pojoCodecRegistry);
        MongoCollection<DTO_Restaurante> collection = database.getCollection("Datos_Mongo", DTO_Restaurante.class);
        //collection = collection.withCodecRegistry(pojoCodecRegistry);

        FindIterable<DTO_Restaurante> iterable = collection.find();
        ArrayList<DTO_Restaurante> listado = new ArrayList<DTO_Restaurante>();
        for (DTO_Restaurante rest : iterable) {
            //rest.mostrar();

            listado.add(rest);
        }
        //ArrayList<DTO_Restaurante> listado = new ArrayList<DTO_Restaurante>();

        return listado;
    }

    public void respaldo() {
        String columnas[] = {"Razon Social", "Municipio", "Descripcion Tipo Rnt", "Categoria", "Subcategoria",
            "Estado Rnt", "Total", "Tipo", "Precio Minimo", "Precio Maximo", "Recomendacion"};
        ArrayList<DTO_Restaurante> listado = this.listar2();
        try {

            PrintWriter writer = new PrintWriter("./respaldoMongo.txt", "UTF-8");
            writer.println("Razon Socia,Municipi,Descripcion Tipo Rn,Categori,Subcategori,Estado Rn,Tota,Tip,Precio Minim,Precio Maxim,Recomendacio");
            for (DTO_Restaurante dto : listado) {
                writer.println(dto.toString());
            }

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//        ConexionMongo con = new ConexionMongo();
//        DB db = con.getConexionDB();
//        DBCollection collection = db.getCollection(coleccion);
//        
//        DBCollection tabla = db.getCollection("restaurante");
//        DBCursor cursor = tabla.find();
//        //ArrayList<DTO_Restaurante> listado = new ArrayList<DTO_Restaurante>();
//        ArrayList<String[]> listado = new ArrayList<String[]>();
//        while (cursor.hasNext()) {
//            String[] fila = new String[7];
//            //cursor.next().get(coleccion).toString();
//
//            //listado.add(new DTO_Restaurante(cursor.next().get("Razon Social").toString(), cursor.curr().get("Municipio").toString(), cursor.curr().get("Descripcion Tipo Rnt").toString(), cursor.curr().get("Categoria").toString(), cursor.curr().get("Subcategoria").toString(), cursor.curr().get("Estado Rnt").toString(), cursor.curr().get("TOTAL").toString()));
//            fila[0] = cursor.next().get("Razon Social").toString();
//            fila[1] = cursor.curr().get("Municipio").toString();
//            fila[2] = cursor.curr().get("Descripcion Tipo Rnt").toString();
//            fila[3] = cursor.curr().get("Categoria").toString();
//            fila[4] = cursor.curr().get("Subcategoria").toString();
//            fila[5] = cursor.curr().get("Estado Rnt").toString();
//            fila[6] = cursor.curr().get("TOTAL").toString();
//            listado.add(fila);
//            //System.out.println(fila[0]+" "+fila[1]+""+fila[2]+fila[3]+fila[4]+" "+fila[5]+" "+fila[6]);
//            //System.out.println(cursor.next().get("Razon Social") + " - " + cursor.curr().get("Municipio") + "-" + cursor.curr().get("Descripcion Tipo Rnt") + "-" + cursor.curr().get("Categoria") + " - " + cursor.curr().get("Subcategoria") + " - " + cursor.curr().get("Estado Rnt") + " - " + cursor.curr().get("TOTAL"));
//            //System.out.println(cursor.next().toString());
//        }
//        return listado;
    public static void main(String[] aaa) {
        DAO_Restaurante x = new DAO_Restaurante();
//DTO_Tipo_Plato x2=new DTO_Tipo_Plato("CASEROS", 0, 0, "Bandeja Corriente");
//        DTO_Restaurante res = new DTO_Restaurante("La mesa coja", "VILLAVICENCIO", "CASEROS Y DOMICILIOS", "NO SE", "NO SE", "NO SE", "NO SE",x2);
//        x.insertar(res);
        //x.update(res, "restaurante", "La mesa coja");
        //x.elimiinar("restaurante", "La mesa coja");
        //x.listar();
        //x.elimiinar1("La mesa coja");
//x.respaldo();
        //ReportesMongo prueba = new ReportesMongo();
        //prueba.Reporte4();
        x.respaldo();

    }

}

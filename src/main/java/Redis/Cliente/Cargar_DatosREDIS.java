package Redis.Cliente;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import Redis.DAO.DAO_Empleado_REDIS;

public class Cargar_DatosREDIS {

    public static final String SEPARATOR = ";";
    public static final String QUOTE = "\"";

    public static void main(String[] args) throws IOException {
        DAO_Empleado_REDIS dao = new DAO_Empleado_REDIS();
        BufferedReader br = null;
        Jedis con_jedis = null;
        con_jedis =new Jedis("localhost");
        //Carga de datos
       
        Transaction t = con_jedis.multi();

        try {

            br = new BufferedReader(new FileReader("/home/osboxes/Desktop/datos_proyecto.csv"));
            String line = br.readLine();
            int cont=0;
            while (null != line) {
                if (cont != 0) {
                    String[] fields = line.split(SEPARATOR);
                    System.out.println(fields[0] + " " + fields[1] + " " + fields[2] + " " + fields[3] + " " + fields[4] + " " + fields[5] + " " + fields[6] + " " + fields[7]);
                    t.hset(fields[0], "nombre", fields[1]);
                    t.hset(fields[0], "departamento", fields[2]);
                    t.hset(fields[0], "funcion", fields[3]);
                    t.hset(fields[0], "estatus", fields[4]);
                    t.hset(fields[0], "sueldo", String.valueOf(fields[5]));
                    t.hset(fields[0], "mes_ingreso", fields[6]);
                    t.hset(fields[0], "ano_ingreso", fields[7]);
                    
                    String binario = null;
                    if (cont % 2 == 0) {
                        String ruta = "/home/osboxes/Desktop/perfil1.png";
                        binario = dao.ImagenBinarioREDIS(ruta);
                        System.out.println(binario);
                        t.hset(fields[0], "perfil", binario);
                        System.out.println("Hola");
                    } else {
                        if (cont % 3 == 0) {
                            String ruta = "/home/osboxes/Desktop/perfil2.png";
                            binario = dao.ImagenBinarioREDIS(ruta);
                            t.hset(fields[0], "perfil", binario);
                        } else {
                            String ruta = "/home/osboxes/Desktop/perfil3.png";
                            binario = dao.ImagenBinarioREDIS(ruta);
                            t.hset(fields[0], "perfil", binario);
                        }
                    }
                    
                    line = br.readLine();
                    System.out.println(cont);
                    
                }
                cont++;
            }
            
            t.exec();
        } catch (Exception e) {
            t.discard();
            System.out.println("ERROR");
        } finally {
            if (null != br) {
                br.close();
            }
        }
        
        //Video a String
        //String video = dao.VideoBinarioREDIS("C:/Users/alejo/Desktop/vid_soft.mp4");
        //dao.BinarioImagenREDIS(video);
    }
}

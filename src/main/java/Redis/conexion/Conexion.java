
package Redis.conexion;

import redis.clients.jedis.Jedis;


public class Conexion {
    
    private static Jedis con_jedis = null;
    private static Conexion con = null;
    
    public static Jedis conectarREDIS(){  
        if (con_jedis == null){
            con = new Conexion();
            try{
                con_jedis =new Jedis("localhost", 6379);
                System.out.println("Server Ping: "+con_jedis.ping());            

            }catch(Exception e){
                System.out.println("Error, no se pudo conectar");
            }  
        }
        return con_jedis;
    }
    
    public static Jedis desconectarREDIS(){
        try {
            con_jedis.close();
            System.out.println("Desconectado");
            con = null;
        } 
        catch (Exception e) {
            System.out.println("Error, no se pudo desconectar");
        }
        return con_jedis;
    }
}

package Oracle.Singleton;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * @Autor Samuel
 */
public class SingletonMaster {
    private static int tiempovida = 10;
    private static Map<Integer,Singleton> mapsingle = new HashMap<Integer,Singleton>();
    private static Map<Integer,String> mapfechas = new HashMap<Integer,String>();
    private static ArrayList<Integer> disponibles = new ArrayList<Integer>(); 
   
    public static Singleton getInstance(int cont){
        if (cont == -1){
            System.out.println("Intento de instanciar Singleton desde un DAO");
            return null;
        }else{
            Singleton aux = mapsingle.get(cont);
            if(aux != null){
                return aux;
            }else{
                if(disponibles.isEmpty()){
                    aux = Singleton.getInstance();
                }else{
                    int caux = disponibles.get(0);
                    disponibles.remove(0);
                    aux = mapsingle.get(caux);
                    mapsingle.remove(cont); 
                }
                if(aux != null){
                    mapsingle.put(cont, aux);
                }
                System.out.println(aux);
                return aux;
            }
        }
    }
    public static Connection getCone(int cont){
        Singleton aux =  mapsingle.get(cont);
        if (aux!=null){
            Connection conne = mapsingle.get(cont).getCone();
            return conne;
        }else{
            return null;
        }
    }
    public static void desconectar(int cont){
        //System.out.println("BANDERA 1");
        Singleton aux =  mapsingle.get(cont);
        if (aux!=null){
            //System.out.println("BANDERA 2");
        
            disponibles.add(cont);
            LocalDateTime locaDate = LocalDateTime.now();
            int hours  = locaDate.getHour();
            int minutes = locaDate.getMinute();
            int seconds = locaDate.getSecond();
            int segundos = seconds + 60*minutes + 3600*hours + tiempovida;
            new Owlman(String.valueOf(cont)).start();
            mapfechas.put(cont, String.valueOf(segundos));
        }
    }
    
    public static void aux_desconectar(int cont){
        int rev = disponibles.indexOf(cont);
        //System.out.println("BITCH");
        if (rev != -1){
            //System.out.println("Entra al auxiliar");
            mapsingle.remove(cont);
            Singleton.desconectar();   
        }
        
    }
    
    public static int revisor(int cont){
        return StringtoInt(mapfechas.get(cont));
    }
    
    private static void añadirTiempo(int cont){
        int auxseg = Integer.parseInt(mapfechas.get(cont));
        auxseg += 30;
        mapfechas.remove(cont);
        mapfechas.put(cont,String.valueOf(auxseg));
    }
    
    private static int StringtoInt(String aux){
        int nu = 0;
        try{
            nu = Integer.parseInt(aux); 
        }catch(Exception e){
        }
        return nu;
    }
}

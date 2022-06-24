package Oracle.Singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Autor Samuel
 */
public class Singleton {
    private static int n = 4;
    private static Singleton single;
    public static Connection cone;
    private static int cont = 0;
    public Singleton() {
    }
    
    public static Singleton getInstance(){
        //System.out.println("Contador de Singleton " + cont);
        if(cont < n){
            cont += 1;
            single = new Singleton();
            Connection con2 = null;
            String user = "samuel";
            String pass = "12345678";
            String url = "jdbc:oracle:thin:@localhost:1521:xe";

            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con2=DriverManager.getConnection(url,user,pass);
                con2.setAutoCommit(false);

                if(con2 != null){
                    System.out.println("Conexion exitosa");
                }else{
                    System.out.println("Error de conexion");
                }
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error: "+e.getMessage());
            }
            cone = con2;
            return single;
        }
        return null;
    }

    public static Connection getCone() {
        return cone;
    }

    public static void setCone(Connection cone) {
        Singleton.cone = cone;
    }

    public static Singleton getSingle() {
        return single;
    }

    public static void setSingle(Singleton single) {
        Singleton.single = single;
    }
    public static void desconectar(){
        cont -= 1;
    }
}

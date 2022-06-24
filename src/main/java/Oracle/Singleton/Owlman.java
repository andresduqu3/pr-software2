package Oracle.Singleton;

import java.time.LocalDateTime;

/**
 * @Autor Samuel
 */
public class Owlman extends Thread{
    public Owlman(String str) {
        super(str);
    }
    public void run() {
        while (true){
            LocalDateTime locaDate = LocalDateTime.now();
            int hours  = locaDate.getHour();
            int minutes = locaDate.getMinute();
            int seconds = locaDate.getSecond();
            int segundos = seconds + 60*minutes + 3600*hours;
            int segfin = SingletonMaster.revisor(Integer.parseInt(getName()));
            /*
            System.out.println("Owlman");
            System.out.println(segundos);
            System.out.println(segfin);
            */
            if (segundos>=segfin){
                System.out.println("");
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        SingletonMaster.aux_desconectar(Integer.parseInt(getName()));
        System.out.println("Termina thread " + getName());
    }
}
package Oracle.Modelo;
/**
 * @Autor Samuel
 */
public class Cargo {
   int cod_cargo;
   String cargo;

    public Cargo(int cod_cargo, String cargo) {
        this.cod_cargo = cod_cargo;
        this.cargo = cargo;
    }

    public Cargo() {
        this.cod_cargo = 0;
        this.cargo = null;        
    }

    public int getCod_cargo() {
        return cod_cargo;
    }

    public void setCod_cargo(int cod_cargo) {
        this.cod_cargo = cod_cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return  cod_cargo + "," + cargo + '\n';
    }
    
    
   
   
}

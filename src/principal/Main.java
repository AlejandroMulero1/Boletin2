package principal;

import java.io.File;

import static principal.GestionClientes.altaCliente;

public class Main {

    public static void main(String[] args) {
	    File fichero = null;
        Cliente asd= new Cliente("Pepe", "JuanesRodriguez", "1234A", "PaseoPaseado", 5);

        try {
            fichero=new File("CLIENTES.TXT");
            altaCliente(fichero, asd);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

package principal;

import java.io.File;

import static principal.GestionClientes.*;

public class Main {

    public static void main(String[] args) {
	    File fichero = null;
        Cliente asd= new Cliente("Pepe", "JuanesRodriguez", "1234A", "PaseoPaseado", 5);

        try {
            File clientes= new File("CLIENTES.TXT");
            File modificaciones= new File("MODIFICACIONES.TXT");
            realizarModificaciones(clientes, modificaciones);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

package principal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class GestionClientes {

    public static void altaCliente(File fichero, Cliente cliente) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            fw = new FileWriter(fichero,true);
            bw = new BufferedWriter(fw);
            bw.write(cliente.toString() + "\n");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}

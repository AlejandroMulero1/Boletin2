package principal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


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

    public static void consultarElementoPorApellido(File fichero, String apellidos) {
        Scanner sc = null;
        String[] datos;
        try {
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                datos = sc.nextLine().split(",");
                if (datos[1].equals(apellidos))
                    System.out.println(Arrays.toString(datos));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            if (sc != null)
                sc.close();
        }
    }

    public static String buscarElementoPorApellido(File fichero, String apellidos) {
        Scanner sc = null;
        String[] datos;
        String registro = "No se ha encontrado el registro";
        try {
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                datos = sc.nextLine().split(",");
                if (datos[1].equals(apellidos))
                    registro=Arrays.toString(datos);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            if (sc != null)
                sc.close();
        }

        return registro;
    }


    public static void consultarElementoPorCIF(File fichero, String cif) {
        Scanner sc = null;
        String[] datos;
        try {
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                datos = sc.nextLine().split(",");
                if (datos[2].equals(cif))
                    System.out.println(Arrays.toString(datos));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            if (sc != null)
                sc.close();
        }
    }


    public static String buscarElementoPorCIF(File fichero, String cif) {
        Scanner sc = null;
        String[] datos;
        String registro = "No se ha encontrado el registro";
        try {
            sc = new Scanner(fichero);
            while (sc.hasNextLine()) {
                datos = sc.nextLine().split(",");
                if (datos[2].equals(cif))
                    registro=Arrays.toString(datos);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            if (sc != null)
                sc.close();
        }
        return registro;
    }
    public static void insertarModificacionCliente(File fichero, Cliente cliente) {
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




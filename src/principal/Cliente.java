package principal;


public class Cliente {
    private String nombre, apellidos, cif, direccion;
    private int LONGITUD_MAX_NOMBRE=50, LONGITUD_MAXIMA_CIF=10;
    private int categoria;

    public Cliente(String nombre, String apellidos, String cif, String direccion, int categoria){
        setNombre(nombre);
        setApellidos(apellidos);
        setCif(cif);
        setDireccion(direccion);
        this.categoria=categoria;
    }

    public void setNombre(String nombre) {
        if(nombre.length()>LONGITUD_MAX_NOMBRE)
            nombre= nombre.substring(0, LONGITUD_MAX_NOMBRE);

        this.nombre=nombre;
    }

    public void setApellidos(String apellidos) {
        if(apellidos.length()>LONGITUD_MAX_NOMBRE)
            apellidos= apellidos.substring(0, LONGITUD_MAX_NOMBRE);

        this.apellidos = apellidos;
    }

    public void setCif(String cif) {
        if(cif.length()>LONGITUD_MAXIMA_CIF)
            cif= cif.substring(0, LONGITUD_MAXIMA_CIF);

        this.cif = cif;
    }

    public void setDireccion(String direccion) {
        if(direccion.length()>LONGITUD_MAX_NOMBRE)
            direccion= direccion.substring(0, LONGITUD_MAX_NOMBRE);
        this.direccion = direccion;
    }



    @Override
    public String toString() {
        return nombre +","+ apellidos +","+ cif +","+ categoria +","+ direccion;
    }
}

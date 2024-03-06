public class Usuario {
    private String nombre;
    private String apellidos;
    private long numeroCarnet;

    public Usuario(String nombre, String apellidos, long numeroCarnet) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroCarnet = numeroCarnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(long numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }
 
}

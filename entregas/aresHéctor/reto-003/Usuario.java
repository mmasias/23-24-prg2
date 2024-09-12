package 23-24-prg2.entregas.aresHéctor.reto-003;

public class Usuario {
    private String nombre;
    private String apellido;
    private int dni;
    private int telefono;

    
    public Usuario(String nombre, String apellido, int dni, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getDni() {
        return dni;
    }


    public void setDni(int dni) {
        this.dni = dni;
    }


    public int getTelefono() {
        return telefono;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}

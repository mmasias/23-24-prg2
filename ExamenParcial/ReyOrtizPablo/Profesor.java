package ReyOrtizPablo;
public class Profesor{
private String nombre;
private String apellido;
private String dni;
public Profesor(String nombre,String apellido,String dni){
this.nombre=nombre;
this.apellido=apellido;
this.dni=dni;
}
public void mostrarInformacionProfesor(){
    System.out.println("Nombre del profesor: " + nombre + " " +apellido+" - NIE: " + dni );
}
}
package ReyOrtizPablo;

public class Main {
    public static void main(String[] args) {
        
    Examen examen= new Examen("Examen Parcial", "Loyda Alas", "433452A");
    Asignatura asignatura= new Asignatura("Programacion 2", "PRG2", 6);
    Preguntas preguntas=new Preguntas("Vista pública clases", "vista pública de objetos", "Vista privada de clases");
    Profesor profesor=new Profesor("Manuel", "Masias", "666999XY");
    profesor.mostrarInformacionProfesor();
    asignatura.mostrarInformacionAsignatura();
    examen.mostrarInformacionExamen();
    preguntas.mostrarInformacionPreguntas();
    }
}

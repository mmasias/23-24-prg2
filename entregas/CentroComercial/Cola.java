package entregas.CentroComercial;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<Persona> cola;

    public Cola() {
        this.cola = new LinkedList<>();
    }

    public void agregarPersona(Persona persona) {
        cola.add(persona);
    }

    public Persona siguientePersona() {
        return cola.poll();
    }

    public int personasEnCola() {
        return cola.size();
    }
}
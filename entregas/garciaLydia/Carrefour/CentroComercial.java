package entregas.garciaLydia.Carrefour;

import java.util.LinkedList;
import java.util.Queue;

public class CentroComercial {
    private Caja[] cajas;
    private Queue<Persona> cola;

    public CentroComercial() {
        cajas = new Caja[4];
        for (int i = 0; i < cajas.length; i++) {
            cajas[i] = new Caja();
        }
        cola = new LinkedList<>();
    }

    public void recibe(Persona persona) {
        cola.add(persona);
    }

    public void actualizar() {
        deColaACaja();
        atiendeCajas();
    }

    private void deColaACaja() {
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i].estaLibre() && !cola.isEmpty()) {
                Persona persona = cola.poll();
                cajas[i].recibe(persona);
            }
        }
    }

    private void atiendeCajas() {
        for (int i = 0; i < cajas.length; i++) {
            cajas[i].atiende();
        }
    }

    public void verEstado(int minutoActual) {
        System.out.println("MINUTO " + minutoActual + " - En Cola: " + cola.size());
        for (int i = 0; i < cajas.length; i++) {
            System.out.print("Caja" + (i + 1) + ": ");
            cajas[i].verEstado();
        }
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }

    public int personasEnCola() {
        return cola.size();
    }

    public Caja[] getCajas() {
        return cajas;
    }
}


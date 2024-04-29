package src;

import java.util.Scanner;

public class Jugador {

    private String nombre;
    private Opcion opcion;
    private int victorias;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void elegirOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(nombre + " elige (1: Piedra, 2: Papel, 3: Tijera): ");
        int opcionElegida = scanner.nextInt();
        Opcion[] opciones = { Opcion.Piedra, Opcion.Papel, Opcion.Tijera };

        if (opcionElegida >= 1 && opcionElegida <= 3) {
            opcion = opciones[opcionElegida - 1];
        } else {
            System.out.println("Opción incorrecta");
            elegirOpcion();
        }
    }

    public Opcion getOpcion() {
        return opcion;
    }

    public void incrementarVictorias() {
        victorias++;
    }

    public int getVictorias() {
        return victorias;
    }

    public enum Opcion {
        Piedra, Papel, Tijera
    }
}

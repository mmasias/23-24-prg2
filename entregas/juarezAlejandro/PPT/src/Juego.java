package src;

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private int empates;

    public Juego(String nombreJugador1, String nombreJugador2) {
        jugador1 = new Jugador(nombreJugador1);
        jugador2 = new Jugador(nombreJugador2);
    }

    public void jugar() {
        jugador1.elegirOpcion();
        jugador2.elegirOpcion();
    }

    public void determinarGanador() {
        if (jugador1.getOpcion() == jugador2.getOpcion()) {
            System.out.println("Empate!");
            empates++;
        } else if ((jugador1.getOpcion() == Jugador.Opcion.Piedra && jugador2.getOpcion() == Jugador.Opcion.Tijera) ||
                (jugador1.getOpcion() == Jugador.Opcion.Papel && jugador2.getOpcion() == Jugador.Opcion.Piedra) ||
                (jugador1.getOpcion() == Jugador.Opcion.Tijera && jugador2.getOpcion() == Jugador.Opcion.Papel)) {
            System.out.println(jugador1.getNombre() + " gana!");
            jugador1.incrementarVictorias();
        } else {
            System.out.println(jugador2.getNombre() + " gana!");
            jugador2.incrementarVictorias();
        }
    }

    public void mostrarResultado() {
        System.out.println("[" + jugador1.getNombre() + "] saca [" + jugador1.getOpcion() + "] / ["
                + jugador2.getNombre() + "] saca [" + jugador2.getOpcion() + "]");
        System.out.println("Resultados: ");
        System.out.println(jugador1.getNombre() + ": " + jugador1.getVictorias() + " victorias");
        System.out.println(jugador2.getNombre() + ": " + jugador2.getVictorias() + " victorias");
        System.out.println("Empates:" + empates);
        System.out.println("-".repeat(50));
    }

    public void mostrarInicio() {
        System.out.println(
                ".______    __   _______  _______  .______           ___             .______        ___      .______    _______  __           ______      .___________. __         __   _______ .______           ___      ");
        System.out.println(
                "|   _  \\  |  | |   ____||       \\ |   _  \\         /   \\            |   _  \\      /   \\     |   _  \\  |   ____||  |         /  __  \\     |           ||  |       |  | |   ____||   _  \\         /   \\     ");
        System.out.println(
                "|  |_)  | |  | |  |__   |  .--.  ||  |_)  |       /  ^  \\           |  |_)  |    /  ^  \\    |  |_)  | |  |__   |  |        |  |  |  |    `---|  |----`|  |       |  | |  |__   |  |_)  |       /  ^  \\    ");
        System.out.println(
                "|   ___/  |  | |   __|  |  |  |  ||      /       /  /_\\  \\          |   ___/    /  /_\\  \\   |   ___/  |   __|  |  |        |  |  |  |        |  |     |  | .--.  |  | |   __|  |      /       /  /_\\  \\   ");
        System.out.println(
                "|  |      |  | |  |____ |  '--'  ||  |\\  \\----. /  _____  \\   __    |  |       /  _____  \\  |  |      |  |____ |  `----.   |  `--'  |        |  |     |  | |  `--'  | |  |____ |  |\\  \\----. /  _____  \\  ");
        System.out.println(
                "| _|      |__| |_______||_______/ | _| `._____|/__/     \\__\\ (_ )   | _|      /__/     \\__\\ | _|      |_______||_______|    \\______/         |__|     |__|  \\______/  |_______|| _| `._____|/__/     \\__\\ ");
        System.out.println(
                "                                                              |/                                                                                                                                           ");
    }

}

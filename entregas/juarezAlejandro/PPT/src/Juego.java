package src;

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;

    public Juego(String nombreJugador1, String nombreJugador2) {
        jugador1 = new Jugador(nombreJugador1);
        jugador2 = new Jugador(nombreJugador2);
    }

    public void jugar() {
        jugador1.elegirOpcion();
        jugador2.elegirOpcion();
    }

    public void determinarGanador() {

    }

}

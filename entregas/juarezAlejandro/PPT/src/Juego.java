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
        if (jugador1.getOpcion() == jugador2.getOpcion()) {
            System.out.println("Empate!");
        } else if ((jugador1.getOpcion() == Jugador.Opcion.Piedra && jugador2.getOpcion() == Jugador.Opcion.Tijera) ||
                (jugador1.getOpcion() == Jugador.Opcion.Papel && jugador2.getOpcion() == Jugador.Opcion.Piedra) ||
                (jugador1.getOpcion() == Jugador.Opcion.Tijera && jugador2.getOpcion() == Jugador.Opcion.Papel)) {
            System.out.println(jugador1.getNombre() + " gana!");
        } else {
            System.out.println(jugador2.getNombre() + " gana!");
        }
    }

}

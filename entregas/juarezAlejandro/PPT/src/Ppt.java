package src;

public class Ppt {
    public static void main(String[] args) {
        Juego juego = new Juego("Bill Gates", "Steve Jobs");
        juego.mostrarInicio();
        while (true) {
            juego.jugar();
            juego.determinarGanador();
            juego.mostrarResultado();
        }
    }
}

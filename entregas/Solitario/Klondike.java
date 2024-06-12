import java.util.Scanner;

class Klondike {

    private Baraja baraja;
    private Descarte descarte;
    private Palo[] palos;
    private Columna[] columnas;

    public Klondike() {
        baraja = new Baraja();
        descarte = new Descarte();
        palos = new Palo[4];
        columnas = new Columna[7];
        for (int i = 0; i < 4; i++) {
            palos[i] = new Palo();
        }
        for (int i = 0; i < 7; i++) {
            columnas[i] = new Columna(baraja, i + 1);
        }
    }

    public void jugar() {
        boolean estaJugando = true;
        do {
            Menu menu = new Menu();
            menu.mostrar();
            mostrarTapete();
            int opcion = menu.getOpcion();

            switch (opcion) {
                case 1:
                    baraja.moverA(descarte);
                    break;
                case 2:
                    descarte.moverA(this.escogerPalo("A"));
                    break;
                case 3:
                    descarte.moverA(this.escogerColumna("A"));
                    break;
                case 4:
                    this.escogerPalo("De").moverA(this.escogerColumna("A"));
                    break;
                case 5:
                    this.escogerColumna("De").moverA(this.escogerPalo("A"));
                    break;
                case 6:
                    this.escogerColumna("De").moverA(this.escogerColumna("A"));
                    break;
                case 7:
                    this.escogerColumna("De").voltearCarta();
                    break;
                case 8:
                    descarte.voltear(baraja);
                    break;
                case 9:
                    estaJugando = !estaJugando;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            mostrarTapete();
            menu.mostrar();
            opcion = menu.getOpcion();
        } while (estaJugando);
    }

    private Palo escogerPalo(String prefijo) {

        System.out.println(prefijo + " qué palo?" + " (1-4)");
        int palo = new Scanner(System.in).nextInt();
        return palos[palo - 1];
    }

    private Columna escogerColumna(String prefijo) {

        System.out.println(prefijo + " qué columna?" + " (1-7)");
        int columna = new Scanner(System.in).nextInt();
        return columnas[columna - 1];
    }


    public void mostrarTapete() {

        baraja.mostrar();
        descarte.mostrar();
        for (int i = 0; i < 4; i++) {
            palos[i].mostrar();
        }
        for (int i = 0; i < 7; i++) {
            columnas[i].mostrar();
        }
    }

    public static void main(String[] args) {

        new Klondike().jugar();
    }

}
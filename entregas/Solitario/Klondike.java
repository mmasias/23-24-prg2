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
            columnas[i] = new Columna();
        }
    }

    public void jugar() {
        boolean estaJugando = true;
        do {
            Menu menu = new Menu();
            mostrarTapete();
            menu.mostrar();
            int opcion = menu.getOpcion();

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

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
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
        
    }

    public static void main(String[] args) {

        new Klondike().jugar();
    }
    
}
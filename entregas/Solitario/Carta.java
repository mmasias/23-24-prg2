
public class Carta {

    private int palo;
    private int numero;
    private boolean bocaArriba;

    private final String[] PALOS = { "Espadas", "Treboles", "Diamantes", "Corazones" };
    private final String[] NUMEROS = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

    private final Intervalo NEGROS = new Intervalo(0, 1);
    private final Intervalo ROJOS = new Intervalo(2, 3);

    public Carta(int palo, int numero) {
        this.palo = palo;
        this.numero = numero;
        bocaArriba = false;
    }

    public void mostrar() {

        String numero = "=";
        String palo = "?";
        if (bocaArriba) {
            numero = NUMEROS[this.numero];
            palo = PALOS[this.palo];
        }
        System.out.println("[" + numero + " " + palo + "]");
    }

    public void voltear() {
        bocaArriba = !bocaArriba;
    }

    public boolean esAs() {
        return numero == 0;
    }

    public boolean esSiguiente(Carta carta) {
        return this.numero == carta.numero + 1;
    }

    public boolean igualPalo(Carta carta) {
        return this.palo == carta.palo;
    }

    public boolean bocaArriba() {
        return bocaArriba = true;
    }

    public boolean esRey() {
        return numero == 13;
    }

    public boolean distintoColor(Carta carta) {
        return this.rojo() && carta.negro() || carta.rojo() && this.negro();
    }

    private boolean negro() {
        return this.color == 
    }

    private boolean rojo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rojo'");
    }

}

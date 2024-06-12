
public class Palo {

    private Carta[] cartas;
    private int ultima;

    public Palo() {
        cartas = new Carta[13];
        ultima = 0;
    }

    public void mostrar() {

        System.out.println("Palo: ");
        if (this.vacia()) {
            System.out.println("No hay cartas en el palo");
        } else {
            Carta carta = this.cima();
            carta.mostrar();
        }
    }

    private boolean vacia() {
        return ultima == 0;
    }

    private Carta cima() {
        return cartas[ultima - 1];
    }

    public void moverA(Columna columna) {
        if (this.vacia()) {
            System.out.println("No hay cartas en el palo");
        } else {
            Carta carta = this.sacar();
            if (columna.apilable(carta)) {
                columna.poner(carta);
            } else {
                System.out.println("No se puede poner la carta en la columna");
                this.poner(carta);
            }
        }
    }

    private Carta sacar() {
        ultima--;
        return cartas[ultima];
    }

    public boolean apilable(Carta carta) {
        return this.vacia() && carta.esAs()
                || !this.vacia() && carta.esSiguiente(this.cima()) && carta.igualPalo(this.cima());
    }

    public void poner(Carta carta) {
        cartas[ultima] = carta;
        ultima++;
    }

}

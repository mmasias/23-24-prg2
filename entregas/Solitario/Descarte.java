
public class Descarte {

    private Carta[] cartas;
    private int ultima;

    public Descarte() {
        cartas = new Carta[52 - 28];
        ultima = 0;
    }

    public void mostrar() {

        System.out.println("Descarte:");
        if (this.vacia()) {
            System.out.println("No hay cartas en el descarte");
        } else {
            int primeraVisible = ultima - 3;
            if (primeraVisible < 0) {
                primeraVisible = 0;
            }
            for (int i = primeraVisible; i < ultima; i++) {
                cartas[i].mostrar();
            }
        }
    }

    private boolean vacia() {
        return ultima == 0;
    }

    public void moverA(Palo palo) {

        if (this.vacia()) {
            System.out.println("No hay cartas en el descarte");
        } else {
            Carta carta = this.sacar();
            if (palo.apilable(carta)) {
                palo.poner(carta);
            } else {
                System.out.println("No se puede poner la carta en el palo");
                this.poner(carta);
            }
        }

    }

    private Carta sacar() {
        ultima--;
        return cartas[ultima];
    }

    public void moverA(Columna columna) {

        if (this.vacia()) {
            System.out.println("No hay cartas en el descarte");
        } else {
            Carta carta = this.sacar();
            if (columna.apilable(carta)) {
                columna.poner(carta);
            } else {
                System.out.println("No se puede poner la carta en la columna");
            }
        }
    }

    public void voltear(Baraja baraja) {

        if (this.vacia() || !baraja.vacia()) {
            System.out.println("No se puede voltear");
        } else {
            while (!this.vacia()) {
                Carta carta = this.sacar();
                carta.voltear();
                baraja.ponerCarta(carta);
            }
        }
    }

    public void poner(Carta carta) {
        cartas[ultima] = carta;
        ultima++;
    }

}

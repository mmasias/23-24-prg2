
public class Columna {

    private Carta[] cartas;
    private int ultima;
    private int posicion;

    public Columna(Baraja baraja, int numeroColumna) {
        this.posicion = numeroColumna;
        cartas = new Carta[19];
        ultima = 0;
        for (int i = 0; i < this.posicion; i++) {
            Carta carta = baraja.sacar();
            if(i == this.posicion - 1) {
                carta.voltear();
            }
            this.poner(carta);
        }
    }


    public void mostrar() {
        System.out.println("Columna " + this.posicion + ":");
        if(this.vacia()) {
            System.out.println("VACÍA");
        } else {
            for (int i = 0; i < ultima; i++) {
                cartas[i].mostrar();
            }
        }
    }

    private boolean vacia() {
        return ultima == 0;
    }


    public void moverA(Columna columna) {
        if(this.vacia()) {
            System.out.println("No se puede");
        } else {
            Carta carta = this.sacar();
            if(columna.apilable(carta)) {
                columna.poner(carta);
            } else {
                System.out.println("No se puede poner la carta en la columna");
                this.poner(carta);
            }
        }
    }

    public void moverA(Palo palo) {
        if(this.vacia()) {
            System.out.println("No se puede");
        } else {
            Carta carta = this.sacar();
            if(palo.apilable(carta)) {
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


    public void voltearCarta() {
        if(this.vacia()) {
            System.out.println("No se puede");
        } else if(this.cima().bocaArriba()){
            System.out.println("No se puede");
        } else{
            this.cima().voltear();
        }
    }

    private Carta cima() {
        return cartas[ultima - 1];
    }


    public boolean apilable(Carta carta) {
        return this.vacia() && carta.esRey() ||
        !this.vacia() && this.cima().bocaArriba() 
        && this.cima.siguiente(carta) && this.cima().distintoColor(carta);
    }

    public void poner(Carta carta) {
        cartas[ultima] = carta;
        ultima++;
    }

}

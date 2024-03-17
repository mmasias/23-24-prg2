package entregas.antonioGavilanes.Intervalo;

class Intervalo {

    private double inferior;
    private double superior;

    public Intervalo() {
        superior = 8;
        inferior = 13;
    }

    public Intervalo(double inferior, double superior) {
        this.inferior = inferior;
        this.superior = superior;
    }

    public Intervalo(double superior) {
        inferior = 0;
        this.superior = superior;
    }

    public Intervalo(Intervalo intervalo) {
        this(intervalo.inferior, intervalo.superior);
    }

    public double longitud() {
        return (superior - inferior);
    }

    public Intervalo clonar() {
        return new Intervalo(this);
    }

    public void mostrar() {
        System.out.println("(" + inferior + " , " + superior + ")");
    }

    public double puntoMedio() {
        return (inferior + superior) / 2;
    }

    public void escalar(double factor) {
        inferior *= factor;
        superior *= factor;
    }

    public void desplazar(double desplazamiento) {
        inferior += desplazamiento;
        superior += desplazamiento;
    }

    public boolean incluye(double punto) {
        return (punto >= inferior && punto <= superior);
    }

    public boolean incluye(Intervalo intervalo) {
        return (intervalo.inferior >= inferior && intervalo.superior <= superior);
    }

    public boolean igual(Intervalo intervalo) {
        return (intervalo.inferior == inferior && intervalo.superior == superior);
    }

    public boolean dintinto(Intervalo intervalo) {
        return (intervalo.inferior != inferior || intervalo.superior != superior);
    }

    public boolean intersecta(Intervalo intervalo) {
        return (intervalo.inferior <= superior && intervalo.superior >= inferior);
    }

    public Intervalo simetrico() {
        return new Intervalo(-superior, -inferior);
    }

    public Intervalo desplazado(double desplazamiento) {
        return new Intervalo(inferior + desplazamiento, superior + desplazamiento);
    }

    public Intervalo interseccion(Intervalo intervalo) {
        if (intersecta(intervalo)) {
            return new Intervalo(Math.max(inferior, intervalo.inferior), Math.min(superior, intervalo.superior));
        } else {
            return new Intervalo();
        }
    }

    public Intervalo union(Intervalo intervalo) {
        return new Intervalo(Math.min(inferior, intervalo.inferior), Math.max(superior, intervalo.superior));
    }

    public Intervalo entre(Intervalo intervalo) {
        return new Intervalo(Math.max(inferior, intervalo.inferior), Math.min(superior, intervalo.superior));
    }

    public Intervalo[] trozos(double trozos) {
        Intervalo[] intervalos = new Intervalo[(int) trozos];
        double longitud = longitud() / trozos;
        double inf = inferior;
        double sup = inferior + longitud;
        for (int i = 0; i < trozos; i++) {
            intervalos[i] = new Intervalo(inf, sup);
            inf = sup;
            sup += longitud;
        }
        return intervalos;
    }

    public static void main(String[] args) {
        Intervalo intervalo = new Intervalo(4, 10);
        Intervalo intervalo2 = new Intervalo(5);
        Intervalo intervalo3 = new Intervalo(intervalo);

        intervalo.mostrar();
        System.out.println("Longitud: " + intervalo.longitud());

        intervalo2.mostrar();
        System.out.println("Longitud: " + intervalo2.longitud());

        intervalo.puntoMedio();
        System.out.println("Punto medio: " + intervalo.puntoMedio());

        intervalo.escalar(2);
        System.out.println("Escalar: ");
        intervalo.mostrar();

        intervalo.desplazar(3);
        System.out.println("Desplazar: ");
        intervalo.mostrar();

        System.out.println("Incluye: " + intervalo.incluye(3));
        System.out.println("Incluye: " + intervalo.incluye(intervalo2));

        System.out.println("Igual: " + intervalo.igual(intervalo2));
        System.out.println("Distinto: " + intervalo.dintinto(intervalo2));

        System.out.println("Intersecta: " + intervalo.intersecta(intervalo2));

        intervalo.simetrico().mostrar();

        intervalo.desplazado(3).mostrar();

        intervalo.interseccion(intervalo2).mostrar();

        intervalo.union(intervalo3).mostrar();

        intervalo2.entre(intervalo3).mostrar();

        Intervalo[] intervalos = intervalo.trozos(7);

        for (Intervalo i : intervalos) {
            System.out.print("Trozo: ");
            i.mostrar();
        }
    }

}

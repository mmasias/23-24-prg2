import java.util.Scanner;

class Intervalo {

    private double puntoMedio;

    private double longitud;

    private double getInferior() {
        return puntoMedio - longitud / 2;
    }

    private void setInferior(double inferior) {
        longitud = this.getSuperior() - inferior;
        puntoMedio = inferior + longitud / 2;
    }

    private double getSuperior() {
        return puntoMedio + longitud / 2;
    }

    private void setSuperior(double superior) {
        longitud = superior - this.getInferior();
        puntoMedio = superior - longitud / 2;
    }

    public Intervalo(double inferior, double superior) {
        this.setInferior(inferior);
        this.setSuperior(superior);
    }

    public Intervalo(double superior) {
        this(0, superior);
    }

    public Intervalo(Intervalo intervalo) {
        this(intervalo.getInferior(), intervalo.getSuperior());
    }

    public Intervalo() {
        this(0, 0);
    }

    public Intervalo clone() {
        return new Intervalo(this);
    }

    public double longitud() {
        return getSuperior() - getInferior();
    }

    public void desplazar(double desplazamiento) {
        setInferior(getInferior() + desplazamiento);
        setSuperior(getSuperior() + desplazamiento);
    }

    public Intervalo desplazado(double desplazamiento) {
        Intervalo intervalo = this.clone();
        intervalo.desplazar(desplazamiento);
        return intervalo;
    }

    public boolean incluye(double valor) {
        return getInferior() <= valor && valor <= getSuperior();
    }

    public boolean incluye(Intervalo intervalo) {
        assert intervalo != null;
        return this.incluye(intervalo.getInferior()) &&
                this.incluye(intervalo.getSuperior());
    }

    public boolean equals(Intervalo intervalo) {
        assert intervalo != null;
        return getInferior() == intervalo.getInferior() &&
                getSuperior() == intervalo.getSuperior();
    }

    public Intervalo interseccion(Intervalo intervalo) {
        assert this.intersecta(intervalo);
        if (this.incluye(intervalo)) {
            return intervalo.clone();
        } else if (intervalo.incluye(this)) {
            return this.clone();
        } else if (this.incluye(intervalo.getInferior())) {
            return new Intervalo(intervalo.getInferior(), getSuperior());
        } else {
            return new Intervalo(getInferior(), intervalo.getSuperior());
        }
    }

    public boolean intersecta(Intervalo intervalo) {
        assert intervalo != null;
        return this.incluye(intervalo.getInferior()) ||
                this.incluye(intervalo.getSuperior()) ||
                intervalo.incluye(this);
    }

    public void oponer() {
        double inferiorInicial = getInferior();
        double superiorInicial = getSuperior();
        setInferior(-superiorInicial);
        setSuperior(-inferiorInicial);
    }

    public void doblar() {
        double longitudInicial = this.longitud();
        setInferior(getInferior() - longitudInicial / 2);
        setSuperior(getSuperior() + longitudInicial / 2);
    }

    public void recoger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inferior?");
        setInferior(scanner.nextDouble());
        System.out.println("Superior?");
        setSuperior(scanner.nextDouble());
    }

    public void mostrar() {
        System.out.println("[" + getInferior() + "," + getSuperior() + "]");
    }

    public Intervalo[] trocear(int trozos) {
        return null;
    }

}

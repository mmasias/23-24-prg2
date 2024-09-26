import java.util.Scanner;

class Intervalo{

    private double inferior;
    private double superior;

    public Intervalo(double inferior, double superior){
        this.inferior = inferior;
        this.superior = superior;
    }

    public Intervalo(){
        this(0,0);
    }

    public Intervalo(double superior) {
        inferior = 0;
        this.superior = superior;
    }

    public Intervalo(Intervalo intervalo){
        this(intervalo.inferior, intervalo.superior);
    }

    public double longitud(){
        return (superior - inferior);
    }

    public void doblar(){
        double longitudOriginal = longitud();
        inferior = inferior - longitudOriginal/2;
        superior = superior + longitudOriginal/2;
    }

    public void recoger(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nuevo extremo inferior: ");
        inferior = entrada.nextDouble();

        System.out.println("Nuevo extremo superior: ");
        superior = entrada.nextDouble();
        
    }

    public Intervalo clonar(){
        return new Intervalo(this);
    }

    public void desplazar(double distancia){
        inferior = inferior + distancia;
        superior = superior + distancia;
    }

    public void oponer(){
        double superiorAnterior = superior;
        double inferiorAnterior = inferior;
        superior = -inferiorAnterior;
        inferior = -superiorAnterior;
    }

    public Intervalo desplazado(double desplazamiento){
        Intervalo intervalo = this.clonar();
        intervalo.desplazar(desplazamiento);
        return intervalo;
    }

    public boolean incluye(double valor){
        return inferior<=valor && valor <= superior;
    }

    public boolean incluye(Intervalo intervalo){
        return this.incluye(intervalo.inferior) && this.incluye(intervalo.superior);
    }

    public boolean equals(Intervalo intervalo){
        return inferior==intervalo.inferior && superior==intervalo.superior;
    }

    public boolean intersecta(Intervalo intervalo){
        return this.incluye(intervalo.superior)||this.incluye(intervalo.inferior)||this.incluye(intervalo);
    }

    public Intervalo interseccion(Intervalo intervalo){
        assert this.intersecta(intervalo);
        if (this.incluye(intervalo)){
            return intervalo.clonar();
        } else if (intervalo.incluye(this)) {
            return this.clonar();
        } else if (this.incluye(intervalo.inferior)) {
            return new Intervalo(intervalo.inferior, superior);
        } else {
            return new Intervalo(inferior,intervalo.superior);
        }
    }


    public void mostrar(){
        System.out.println("(" + inferior + " , " + superior + ")");
    }    

    public static void main(String[] args) {

        Intervalo intervalo = new Intervalo(-2,2);
        Intervalo intervalo2 = new Intervalo (0,5);
        Intervalo intervalo3 = intervalo.interseccion(intervalo2);
        intervalo3.mostrar();


    }
}
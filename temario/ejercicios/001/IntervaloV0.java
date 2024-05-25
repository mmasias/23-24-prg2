import java.util.Scanner;

public class IntervaloV0 {

	private double inferior;

	private double superior;

	public IntervaloV0(double inferior, double superior) {
		this.inferior = inferior;
		this.superior = superior;
	}

	public IntervaloV0(double superior) {
		this(0, superior);
	}

	public IntervaloV0(IntervaloV0 intervalo) {
		this(intervalo.inferior, intervalo.superior);
	}

	public IntervaloV0() {
		this(0, 0);
	}

	public IntervaloV0 clone() {
		return new IntervaloV0(this);
	}

	public double longitud() {
		return superior - inferior;
	}

	public void desplazar(double desplazamiento) {
		inferior += desplazamiento;
		superior += desplazamiento;
	}

	public IntervaloV0 desplazado(double desplazamiento) {
		IntervaloV0 intervalo = this.clone();
		intervalo.desplazar(desplazamiento);
		return intervalo;
	}

	public boolean incluye(double valor) {
		return inferior <= valor && valor <= superior;
	}

	public boolean incluye(IntervaloV0 intervalo) {
		assert intervalo!=null;
		return this.incluye(intervalo.inferior) && 
				this.incluye(intervalo.superior);
	}

	public boolean equals(IntervaloV0 intervalo) {
		assert intervalo!=null;
		return inferior == intervalo.inferior && 
				superior == intervalo.superior;
	}

	public IntervaloV0 interseccion(IntervaloV0 intervalo) {
		assert this.intersecta(intervalo);
		if (this.incluye(intervalo)){
			return intervalo.clone();
		} else if (intervalo.incluye(this)){
			return this.clone();
		} else if (this.incluye(intervalo.inferior)){
			return new IntervaloV0(intervalo.inferior, superior);
		} else {
			return new IntervaloV0(inferior, intervalo.superior);
		}
	}

	public boolean intersecta(IntervaloV0 intervalo) {
		assert intervalo!=null;
		return this.incluye(intervalo.inferior) ||
				this.incluye(intervalo.superior) || 
				intervalo.incluye(this);
	}

	public void oponer() {
		double inferiorInicial = inferior;
		double superiorInicial = superior;
		inferior = -superiorInicial;
		superior = -inferiorInicial;
	}

	public void doblar() {
		double longitudInicial = this.longitud();
		inferior -= longitudInicial / 2;
		superior += longitudInicial / 2;
	}

    public void recoger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inferior?");
        inferior = scanner.nextDouble();
        System.out.println("Superior?");
        superior = scanner.nextDouble();
    }

    public void mostrar() {
        System.out.println("[" + inferior + "," + superior + "]");
    }

	public IntervaloV0[] trocear(int trozos) {
		return null;
	}
	
	public static void main(String[] args){
		IntervaloV0 intervalo = new IntervaloV0();
		intervalo.recoger();
		intervalo.mostrar();
		System.out.println("Longitud: "+intervalo.longitud());
	}
}

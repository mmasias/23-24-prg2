import java.util.Scanner;

public class Caja {

    private double saldo;

    public Caja() {
        this.saldo = 0.0;
    }

    public void agregarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Dinero agregado correctamente. Saldo actual: $" + saldo);
        } else {
            System.out.println("La cantidad a agregar debe ser positiva.");
        }
    }

    public void retirarDinero(double cantidad) {
        if (cantidad <= saldo && cantidad > 0) {
            saldo -= cantidad;
            System.out.println("Dinero retirado correctamente. Saldo actual: $" + saldo);
        } else if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser positiva.");
        } else {
            System.out.println("Saldo insuficiente para realizar la operación.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }

    public static void main(String[] args) {
        Caja miCaja = new Caja();
        miCaja.agregarDinero(1000.0);
        miCaja.retirarDinero(500.0);
        miCaja.consultarSaldo();

        /*
         * Scanner scanner = new Scanner(System.in);
         * Caja miCaja2 = new Caja();
         * 
         * while (true) {
         * System.out.println("¿Qué deseas hacer?");
         * System.out.println("1. Agregar dinero");
         * System.out.println("2. Retirar dinero");
         * System.out.println("3. Consultar saldo");
         * System.out.println("4. Salir");
         * System.out.print("Elige una opción (1-4): ");
         * 
         * int opcion = scanner.nextInt();
         * 
         * switch (opcion) {
         * case 1:
         * System.out.print("Ingresa la cantidad a agregar: ");
         * double cantidadAgregar = scanner.nextDouble();
         * miCaja2.agregarDinero(cantidadAgregar);
         * break;
         * case 2:
         * System.out.print("Ingresa la cantidad a retirar: ");
         * double cantidadRetirar = scanner.nextDouble();
         * miCaja2.retirarDinero(cantidadRetirar);
         * break;
         * case 3:
         * miCaja2.consultarSaldo();
         * break;
         * case 4:
         * System.out.println("Gracias por utilizar el sistema.");
         * scanner.close();
         * return;
         * default:
         * System.out.
         * println("Opción no válida. Por favor, elige una opción entre 1 y 4.");
         * }
         * }
         */
    }
}

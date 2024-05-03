import java.util.Scanner;

public class Menu {

    public void mostrar() {

        System.out.println("1. Mover de baraja a descarte");
        System.out.println("2. Mover de descarte a palo");
        System.out.println("3. Mover de descarte a columna");
        System.out.println("4. Mover de palo a columna");
        System.out.println("5. Mover de columna a palo");
        System.out.println("6. Mover de columna a columna");
        System.out.println("7. Voltear carta en columna");
        System.out.println("8. Voltear carta en palo");
        System.out.println("9. Salir");
    }

    public int getOpcion() {

        int opcion;
        opcion = new Scanner(System.in).nextInt();
        return opcion;
    }

}

import java.util.Scanner;

public class Menu {

    private final String[] TITULOS = new String[] {
            "1. Mover de Baraja a Descarte",
            "2. Mover de Descate a Palo",
            "3. Mover de Descate a Columna",
            "4. Mover de Palo a Columna",
            "5. Mover de Columna a Palo",
            "6. Mover de Columna a Columna",
            "7. Voltear carta de Columna",
            "8. Voltear Descarte en Baraja",
            "9. Salir"
    };

    private final Intervalo OPCIONES = new Intervalo(1, 9);

    public void mostrar() {
        System.out.println("OPCIONES>");
        for (String titulo : TITULOS) {
            System.out.println(titulo);
        }
    }

    public int getOpcion() {
        int opcion;
        boolean error;
        do {
            System.out.println("Elige una opción  [1-9]");
            opcion = new Scanner(System.in).nextInt();
            error = !OPCIONES.incluye(opcion);
        } while (error);
        return opcion;
    }
}

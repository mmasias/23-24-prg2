import java.util.Scanner;

class CentroComerical_Carrefour{

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    final double HORARIO_APERTURA = 9.0;
    final double HORARIO_CIERRE = 21.0;
    final double DURACION_ATENCION = 1.0 / 60.0;
    double atendiendoclientes = HORARIO_APERTURA;
    boolean trabajando = true;

    do {
        atendiendoclientes += DURACION_ATENCION;
        System.out.println("Hora actual: " + atendiendoclientes);
        scanner.nextLine();
        trabajando = atendiendoclientes < HORARIO_CIERRE;
    } while (trabajando);
    }
}
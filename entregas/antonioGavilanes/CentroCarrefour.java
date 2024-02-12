import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.util.Random;

public class CentroCarrefour {
    static double probabilidad = 0.6;
    static int cajas = 4;
    static int minPack = 5;
    static int maxPack = 15;
    static int tiempoInicio = 9;
    static int tiempoFinal = 21;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        for (int hora = tiempoInicio; hora < tiempoFinal; hora++) {
            imprimirMarcoHora();
            for (int minutos = 0; minutos < 60; minutos++) {
                imprimirMarcoMinutos();
                System.out.println("Hora: " + hora + ":" + String.format("%02d", minutos));
                sc.nextLine();

            }
        }
        sc.close();
    }

    public static void imprimirMarcoMinutos() {
        System.out.print("+");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void imprimirMarcoHora() {
        for (int i = 0; i < 25; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Centro Comercial Carrefour");
        for (int i = 0; i < 25; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
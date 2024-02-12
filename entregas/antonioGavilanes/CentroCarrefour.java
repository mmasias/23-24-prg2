import java.util.Scanner;
import java.util.Random;

public class CentroCarrefour {
    static int clientes = 0;
    static String mensaje;
    static int caja1 = 0;
    static int caja2 = 0;
    static int caja3 = 0;
    static int caja4 = 0;
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
                clientesEnCaja();

                System.out.println("Hora: " + hora + ":" + String.format("%02d", minutos) + " || " + mensaje
                        + " || Clientes en cola: " + clientes);
                System.out.println("Caja 1: " + "[" + caja1 + "]" + " productos" + " || Caja 2: " + "[" + caja2 + "]"
                        + " productos" + " || Caja 3: " + "[" + caja3 + "]" + " productos" + " || Caja 4: " + "["
                        + caja4 + "]" + " productos");
                sc.nextLine();

            }
        }
        sc.close();
    }

    public static void clientesEnCaja() {
        Random clientesRandom = new Random();
        Random packItems = new Random();
        int items = packItems.nextInt(maxPack - minPack + 1) + minPack;
        if (clientesRandom.nextDouble() < 0.6) {
            clientes = clientes + 1;
            mensaje = "Llega un cliente";
        } else {
            mensaje = "No ha llegado nadie";
        }

        if (clientes > 0 && caja1 < 15 && caja1 + items <= 15) {
            mensaje = "Un cliente ha sido atendido";
            caja1 = caja1 + items;
        } else if (clientes > 0 && caja2 < 15 && caja2 + items <= 15) {
            mensaje = "Un cliente ha sido atendido";
            caja2 = caja2 + items;
        }

        else if (clientes > 0 && caja3 < 15 && caja3 + items <= 15) {
            mensaje = "Un cliente ha sido atendido";
            caja3 = caja3 + items;
        }

        else if (clientes > 0 && caja4 < 15 && caja4 + items <= 15) {
            mensaje = "Un cliente ha sido atendido";
            caja4 = caja4 + items;
        }

        if (caja1 > 0) {
            caja1 = caja1 - 1;
        }
        if (caja2 > 0) {
            caja2 = caja2 - 1;
        }
        if (caja3 > 0) {
            caja3 = caja3 - 1;
        }
        if (caja4 > 0) {
            caja4 = caja4 - 1;
        }
    }

    public static void imprimirMarcoMinutos() {
        System.out.print("+");
        for (int i = 0; i < 35; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void imprimirMarcoHora() {
        for (int i = 0; i < 40; i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Centro Comercial Carrefour");
        for (int i = 0; i < 40; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
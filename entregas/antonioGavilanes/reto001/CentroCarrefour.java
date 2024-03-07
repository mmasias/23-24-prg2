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
    static int articulosVendidos = 0;
    static int contadorClientes = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        imprimirMarcoHora();
        System.out.println("Bienvenido al centro comercial Carrefour");
        System.out.println("El centro comercial abre a las 9:00 y cierra a las 21:00");
        System.out.println("Pulse enter para comenzar");
        sc.nextLine();
        imprimirMarcoHora();

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
        System.out.println("==========================================");
        System.out.println("El centro comercial ha cerrado");
        System.out.println("==========================================");
        System.out.println("Personas en la cola al cierre: " + clientes);
        System.out.println("Productos vendidos en total: " + articulosVendidos);
        System.out.println("Personas atendidas el día de hoy: " + contadorClientes);
        System.out.println("==========================================");
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

        if (clientes > 0 && caja1 == 0 && caja1 + items <= 15) {
            mensaje = "Un cliente ha sido atendido";
            caja1 = caja1 + items;
            clientes = clientes - 1;
            contadorClientes = contadorClientes + 1;
        } else if (clientes > 0 && caja2 == 0 && caja2 + items <= 15) {
            mensaje = "Un cliente ha sido atendido";
            caja2 = caja2 + items;
            clientes = clientes - 1;
            contadorClientes = contadorClientes + 1;
        }

        else if (clientes > 0 && caja3 == 0 && caja3 + items <= 15) {
            mensaje = "Un cliente ha sido atendido";
            caja3 = caja3 + items;
            clientes = clientes - 1;
            contadorClientes = contadorClientes + 1;
        }

        else if (clientes > 0 && caja4 == 0 && caja4 + items <= 15) {
            mensaje = "Un cliente ha sido atendido";
            caja4 = caja4 + items;
            clientes = clientes - 1;
            contadorClientes = contadorClientes + 1;
        }

        if (caja1 > 0) {
            caja1 = caja1 - 1;
            articulosVendidos = articulosVendidos + 1;
        }
        if (caja2 > 0) {
            caja2 = caja2 - 1;
            articulosVendidos = articulosVendidos + 1;
        }
        if (caja3 > 0) {
            caja3 = caja3 - 1;
            articulosVendidos = articulosVendidos + 1;
        }
        if (caja4 > 0) {
            caja4 = caja4 - 1;
            articulosVendidos = articulosVendidos + 1;
        }
    }

    public static void imprimirMarcoMinutos() {
        System.out.print("+");
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void imprimirMarcoHora() {
        for (int i = 0; i < 105; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
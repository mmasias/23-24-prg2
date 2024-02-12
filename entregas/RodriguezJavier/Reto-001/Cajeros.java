import java.util.Random;

public class Cajeros {
    public static void main(String[] args) {
        int[] clientesAtendidos = {0, 0, 0, 0}; // Número de clientes atendidos por cada cajero
        int[] objetosAtendidos = {0, 0, 0, 0}; // Número de objetos que atiende cada cliente
        boolean[] cajerosLibres = {true, true, true, true}; // Estado de cada cajero (libre/ocupado)
        int clientesEnCola = 0; // Número de clientes en cola
        final int minutosEnUnDia = 12 * 60; // Total de minutos en un día
        int totalClientes = 0; // Contador de clientes que han pasado por la tienda
        boolean nuevoCliente = false; // Indica si llega un nuevo cliente
        int minutosSinCola = 0; // Contador de minutos en los que la cola está vacía
        int totalObjetos = 0; // Total de objetos vendidos durante el día
        boolean quintaCajaActivada = false; // Indica si se activa la quinta caja

        Random aleatorio = new Random();

        // Simulación de los minutos del día
        for (int tiempo = 1; tiempo < minutosEnUnDia; tiempo++) {
            if (tiempo > 100) {
                break; // Detener la simulación después de 100 minutos
            }

            if (Math.random() * 100 < 40) {
                nuevoCliente = true;
                clientesEnCola++;
                for (int i = 0; i < 4; i++) {
                    if (cajerosLibres[i]) {
                        clientesAtendidos[i]++;
                        cajerosLibres[i] = false;
                        objetosAtendidos[i] = aleatorio.nextInt(11) + 5;
                        totalObjetos += objetosAtendidos[i];
                        clientesEnCola--;
                        break;
                    }
                }
            }
        }
    }
}



    


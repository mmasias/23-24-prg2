import java.util.Arrays;

public class CentroCarreFour {
    public static void main(String[] args) {
        final int TOTAL_MINUTES = 720;
        final int TOTAL_CASHIERS = 4;
        final int CLIENTS_PER_CASHIER = 5;
        final int NEW_CASHIER_MAX_AMOUNT_ = 15;

        int cola = 0;
        boolean[] occupiedCashier = new boolean[TOTAL_CASHIERS];
        int[] itemsClientCashier = new int[TOTAL_CASHIERS];
        int numberCashier = TOTAL_CASHIERS;
        int minutesWithoutClientInLine = 0;
        int clientsInLineAtTheEnd = 0;
        int servedPeople = 0;
        int soldItems = 0;

        boolean newCashierAddedThisMinute = false;

        for (int minuto = 1; minuto <= TOTAL_MINUTES; minuto++) {
            cleanScreen();

            for (int i = 0; i < numberCashier; i++) {
                occupiedCashier[i] = cashierState(itemsClientCashier[i]);
            }

            if (clientArrives()) {
                cola++;
                System.out.println("MINUTO " + minuto + " - Llega 1 persona - En Cola: " + cola);
            } else {
                System.out.println("MINUTO " + minuto + " - Llegan 0 personas - En Cola: " + cola);
                minutesWithoutClientInLine++;
            }

            if (cola > NEW_CASHIER_MAX_AMOUNT_ && !newCashierAddedThisMinute) {
                numberCashier++;
                System.out.println("Nueva caja agregada. Total de cajas: " + numberCashier);
                cola = 0;
                occupiedCashier = Arrays.copyOf(occupiedCashier, numberCashier);
                itemsClientCashier = Arrays.copyOf(itemsClientCashier, numberCashier);
                newCashierAddedThisMinute = true;
            }

            for (int i = 0; i < numberCashier; i++) {
                if (occupiedCashier[i] && itemsClientCashier[i] > 0) {
                    itemsClientCashier[i]--;
                    System.out
                            .println("El cliente de la caja " + (i + 1) + " tiene un total de: "
                                    + itemsClientCashier[i]);
                    soldItems++;
                }
                if (cola >= 1 && !occupiedCashier[i]) {
                    System.out.println("Ha pasado a la caja " + (i + 1) + " un cliente");
                    cola--;
                    occupiedCashier[i] = true;
                    itemsClientCashier[i] = items();
                    System.out.println("El cliente tiene un total de: " + itemsClientCashier[i]);
                    servedPeople++;
                }
            }

            printCashierState(itemsClientCashier);

            pause(1);
        }

        clientsInLineAtTheEnd = cola;
        System.out.println("\nEstadística Final de la Jornada:");
        System.out.println("Número de minutos que pasaron en el cual no hubo nadie en cola: " + minutesWithoutClientInLine);
        System.out.println(
                "Número total de personas que estaban en cola al finalizar el día: " + clientsInLineAtTheEnd);
        System.out.println("Número total de personas atendidas durante el día: " + servedPeople);
        System.out.println("Número total de items vendidos en el día: " + soldItems);
    }

    
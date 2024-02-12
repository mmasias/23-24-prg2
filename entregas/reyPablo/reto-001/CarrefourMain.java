import java.util.Random;

public class CarrefourMain {

    public static void main(String[] args) {
        int[] caja = { 0, 0, 0, 0, 0 };
        int[] nItems = { 0, 0, 0, 0, 0 };
        boolean[] libre = { true, true, true, true, true };
        int cola = 0;//Reto extendido
        final int minutosEnUnDia = 12 * 60; //Se trabajan 12 horas al dia, pero maniobramos con minutos.
        int numeroDeClientes = 0;//Reto extendido
        boolean llegaNuevo = false;
        int minutosSinCola = 0; //Reto extendido
        int totalItems = 0;//Reto extendido
        boolean activa = false;//Reto ampliado
        for (int tiempo = 1; tiempo < minutosEnUnDia; tiempo++) {

            if (Math.random() * 100 < 40) { 
                //Probabilidad de que llegue un cliente nuevo.
                llegaNuevo = true;
                cola++;
                //Al que entra se le manda a la cola.
                if (libre[0]) {
                    caja[0]++;
                    libre[0] = false;
                    //Se pasa a un cliente a la caja, queda ocupada.
                    nItems[0] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[0];
                    cola--;

                } else if (libre[1]) {
                    caja[1]++;
                    libre[1] = false; 
                    // Queda ocupada
                    nItems[1] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[1];
                    cola--;

                } else if (libre[2]) {
                    caja[2]++;
                    libre[2] = false; 
                    // Queda ocupada
                    nItems[2] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[2];
                    cola--;

                } else if (libre[3]) {
                    caja[3]++;
                    libre[3] = false; 
                    // Queda ocupada
                    nItems[3] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[3];
                    cola--;
                } else if (libre[4] && activa) {
                    caja[4]++;
                    libre[4] = false;
                     // Queda ocupada
                    nItems[4] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[4];
                    cola--;
                    
                }
                //Se llenan las cajas y se cuenta la cola.
            }
            if (nItems[0] > 0) {
                nItems[0]--;
                if (nItems[0] == 0) {
                    libre[0] = true;
                }
            }

            if (nItems[1] > 0) {
                nItems[1]--;

                if (nItems[1] == 0) {

                    libre[1] = true;
                }
            }
            if (nItems[2] > 0) {
                nItems[2]--;

                if (nItems[2] == 0) {

                    libre[2] = true;
                }
            }
            if (nItems[3] > 0) {
                nItems[3]--;

                if (nItems[3] == 0) {
                    libre[3] = true;
                }
            }
            if (nItems[4] > 0) {
                nItems[4]--;
                if (nItems[4] == 0) {
                    libre[4] = true;
                }
            }
            if (cola == 0) {
                minutosSinCola++;
            }
            System.out.println("--------------------------------------------------------------");

            System.out.print("MINUTO " + tiempo);

            if (llegaNuevo) {//Llega un nuevo cliente
                System.out.println(" - LLega 1 persona - En cola: " + cola);
                llegaNuevo = false;
            } else {//no llega ninguno nuevo
                System.out.println(" - LLega 0 persona - En cola: " + cola);
            }
            System.out.print(" Caja1:[" + nItems[0] + "] | Caja2:[" + nItems[1] + "] | Caja3:[" + nItems[2] + "] | Caja4:["
                    + nItems[3] + "]");//items en cada caja
            if (nItems[4] > 0 || activa) {//Items en la ultima caja cuando está activada.
                System.out.println(" Caja5:[" + nItems[4] + "] ");
            } else {
                System.out.println();
            }

            if (cola >= 15) {//se activa la ultima caja.
                activa = true;
            } else {
                activa = false;
            }
        }
        for(int i=0;i<caja.length;i++){
            System.out.println("clientes totales que pasan por la caja " + (i+1) + " : " + caja[i]);

        }
        int total=0;
        for(int i=0;i<caja.length;i++){
        total+= caja[i];    
        }
             
    }
}
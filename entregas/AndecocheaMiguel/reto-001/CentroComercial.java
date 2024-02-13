import java.util.Random;

public class CentroComercial {
    public static void main(String[] args) {
        int[] caja={0,0,0,0,0};
        int[] objetos={0,0,0,0,0};
        boolean[] libre={ true, true, true, true, true };
        int cola= 0;
        final int minutosEnUnDia = 12 * 60;
        int numeroDeClientes = 0;
        boolean llegaNuevo = false;
        int minutosSinCola = 0;
        int totalItems = 0;
        int caja5 = 0, nItems5 = 0;
        boolean libre5 = true, activa = false;

        for (int tiempo=1; tiempo< minutosEnUnDia; tiempo++) {
            if (Math.random() * 100 < 40) {
                
                llegaNuevo = true;
                cola++;
                if (libre[0]) {
                    caja[0]++;
                    libre[0] = false; 
                    nItems[0] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[0];
                    cola--;

                } else if (libre[1]) {
                    caja[1]++;
                    libre[1] = false; 
                    nItems[1] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[1];
                    cola--;

                } else if (libre[2]) {
                    caja[2]++;
                    libre[2] = false; 
                    nItems[2] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[2];
                    cola--;

                } else if (libre[3]) {
                    caja[3]++;
                    libre[3] = false; 
                    nItems[3] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[3];
                    cola--;
                } else if (libre[4] && activa) {
                    caja[4]++;
                    libre[4] = false; 
                    nItems[4] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[4];
                    cola--;
                }
            
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
            
        }



    }
}

 

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

        
            }
        }


    }
}

 
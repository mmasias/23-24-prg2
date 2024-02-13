import java.util.Random;

public class CentroComercial {
    public static void main(String[] args) {
        int[] caja = { 0, 0, 0, 0, 0 };
        int[] objetos = { 0, 0, 0, 0, 0 };
        boolean[] libre = { true, true, true, true, true };
        int cola = 0;
        final int minutosEnUnDia = 12 * 60;
        int numeroDeClientes = 0;
        boolean llegaNuevo = false;
        int minutosSinCola = 0;
        int totalObjetos = 0;
        boolean activa = false;

        for (int tiempo = 1; tiempo < minutosEnUnDia; tiempo++) {

            if (Math.random() * 100 < 40) { 
                llegaNuevo = true;
                cola++; 
                if (libre[0]) {
                    caja[0]++;
                    libre[0] = false; 
                    objetos[0] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalObjetos = totalObjetos + objetos[0];

                    cola--;

                } else if (libre[1]) {
                    caja[1]++;
                    libre[1] = false; 
                    objetos[1] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalObjetos = totalObjetos + objetos[1];
                    cola--;
                } else if (libre[1]) {
                    caja[1]++;
                    libre[1] = false; 
                    objetos[1] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalIObjetos = totalObjetos + objetos[1];
                    cola--;

                } else if (libre[2]) {
                    caja[2]++;
                    libre[2] = false; 
                } else if (libre[1]) {
                    caja[1]++;
                    libre[1] = false; 
                    objetos[1] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalObjetos = totalObjetos + objetos[1];
                    cola--;

                } else if (libre[2]) {
                    caja[2]++;
                    libre[2] = false; 
                    objetos[2] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalObjetos = totalObjetos + objetos [2];
                    cola--;

                } else if (libre[3]) {
                    caja[3]++;
                    libre[3] = false; 
                    objetos[3] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalObjetos = totalObjetos + objetos[3];
                    cola--;
                } else if (libre[4] && activa) {
                    caja[4]++;
                    libre[4] = false; 
                    objetos[4] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalObjetos = totalObjetos + objetos[4];
                    cola--;

                }

            }[2] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalObjetos = totalObjetos + objetos[2];
                    cola--;

                } else if (libre[3]) {
                    caja[3]++;
                    libre[3] = false; 
                    objetos[3] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalObjetos = totalObjetos + objetos[3];
                    cola--;
                } else if (libre[4] && activa) {
                    caja[4]++;
                    libre[4] = false; 
                    objetos[4] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalObjetos = totalObjetos + objetos[4];
                    cola--;

                }

            }
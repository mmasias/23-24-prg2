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
              

                } else if (libre[2]) {
                    caja[2]++;
                    libre[2] = false; 
              

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
        }
    }
}    if (objetos[0] > 0) {
    objetos[0]--;
    if (objetos[0] == 0) {
        libre[0] = true;
    }
}
if (objetos[1] > 0) {
    objetos[1]--;

    if (objetos[1] == 0) {

        libre[1] = true;
    }
}
if (objetos[2] > 0) {
    objetos[2]--;

    if (objetos[2] == 0) {

        libre[2] = true;
    }
}
if (objetos[3] > 0) {
    objetos[3]--;

    if (objetos[3] == 0) {
        libre[3] = true;
    }
}
if (objetos[4] > 0) {
    objetos[4]--;
    if (objetos[4] == 0) {
        libre[4] = true;
    }
}
if (cola == 0) {
    minutosSinCola++;
}   

System.out.println("--------------------------------------------------------------");
System.out.print("MINUTO " + tiempo);
if (llegaNuevo) {
    System.out.println(" - LLega 1 persona - En cola: " + cola);
    llegaNuevo = false;
} else {
    System.out.println(" - LLega 0 persona - En cola: " + cola);
}
System.out.print(" Caja1:[" + objetos[0] + "] | Caja2:[" + objetos[1] + "] | Caja3:[" + objetos[2] + "] | Caja4:[" + objetos[3] + "]");
if (objetos[4] > 0 || activa) {
    System.out.println(" Caja5:[" + objetos[4] + "] ");
} else {
    System.out.println();
}

if (cola >= 15) {
    activa = true;
} else {
    activa = false;
}
for (int i = 0; i < caja.length; i++) {
    System.out.println("clientes totales que pasan por la caja " + (i + 1) + ": " + caja[i]);
}
int total = 0;
for (int i = 0; i < caja.length; i++) {
    total += caja[i];
}

System.out.println("Personas que han pasado por la tienda" + ":" + total);
System.out.println("Hoy se han vendido " + totalObjetos + " de productos");
System.out.println("La cola ha estado vacia durante " + minutosSinCola + " minutos");
System.out.println("Clientes en la cola al finalizar el dia " + cola);

   
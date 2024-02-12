package entregas.grizoniManuela;

import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;



class Cliente {
    int packs;

    public Cliente (int packs){
        this.packs = packs;
    }
}

class Caja {
    boolean ocupada;

    public Caja(){
        this.ocupada = false;
    }
}

public class reto001 {
    public static void main(String[] args){

        int tiempo = 720;
        int packsPorMinuto = 1;
        int probabilidaDeLLegadaCliente= 40;
        int cantidadDeCajas = 4;

        Queue<Cliente> cola = new LinkedList<>();
        Caja[] cajas = new Caja[cantidadDeCajas];

        for (int i=0; i< cantidadDeCajas; i++){

            cajas[i] = new Caja ();
        }

        Random random = new Random();

        System.out.println("MINUTO 1 - Llega 1 persona - En cola:0");
        

        for (int minuto = 2; minuto <= tiempo; minuto++){

            if (random.nextInt(100) < probabilidaDeLLegadaCliente){

                int packsCliente = random.nextInt(11)+5;
                Cliente nuevoCliente = new Cliente(packsCliente);
                cola.add(nuevoCliente);
                System.out.println("MINUTO" + minuto + " - Llega 1 persona  - En cola: " + cola.size());

            }else{
                System.out.println("MINUTO" + minuto + " - No llega nadie  - En cola: " + cola.size());
            }

            for (int i = 0; i < cantidadDeCajas; i++){

                if (cajas[i].ocupada){
                    cajas[i].ocupada = false;

                }else if (!cola.isEmpty()){

                    Cliente clienteActual = cola.poll();
                    int tiempoAtencionTotal = clienteActual.packs * packsPorMinuto;

                    for (int j = 0; j < tiempoAtencionTotal; j++){
                    }

                    cajas[i].ocupada = true;
                }
            }

           

        }

    }
    
}

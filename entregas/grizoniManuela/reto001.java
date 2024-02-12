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
       

        


    }
    
}

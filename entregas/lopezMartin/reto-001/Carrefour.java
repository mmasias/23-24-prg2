public class Carrefour {

    public static void main(String[] args) {
        
        final int MINUTOS_FINAL = 720;
        int colaLlegadaClientes = 0;

        for(int minutoActual = 1; minutoActual<=MINUTOS_FINAL; minutoActual++){
            if (Math.random()<=0.6) {
                colaLlegadaClientes++;
            }         

        }

    }
}
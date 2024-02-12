public class CentroComercial {
    public static void main(String[] args) {

        final int MINUTOS_JORNADA = 720;
        final int NUM_CAJAS = 4;

        int cola = 0;

        boolean[] cajaOcupada = new boolean[NUM_CAJAS];
        int[] itemsClienteCaja = new int[NUM_CAJAS];

        for(int minuto = 1;minuto <= MINUTOS_JORNADA; minuto++){

            if(llegaCliente()){
                cola++;
            }
            System.out.println(cola);
        }
    }

    static boolean llegaCliente() {
        return Math.random() <= 0.6;
    }

}

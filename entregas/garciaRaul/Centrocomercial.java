public class CentroComercial {
    public static void main(String[] args) {

        final int MINUTOS_JORNADA = 720;
        final int NUM_CAJAS = 4;

        int cola = 0;

        boolean[] cajaOcupada = new boolean[NUM_CAJAS];
        int[] itemsClienteCaja = new int[NUM_CAJAS];
    }

    static boolean llegaCliente() {
        return Math.random() <= 0.6;
    }

}

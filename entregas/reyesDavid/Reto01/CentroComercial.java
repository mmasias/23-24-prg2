public class CentroComercial {
    public static void main(String[] args) {
        final int MINUTOS_JORNADA = 720;
        final int NUM_CAJAS_INICIALES = 4;
        final int PERSONAS_POR_CAJA = 5;
        final int MAX_PERSONAS_EN_COLA_PARA_NUEVA_CAJA = 15;

        int cola = 0;
        boolean[] cajaOcupada = new boolean[NUM_CAJAS_INICIALES];
        int[] itemsClienteCaja = new int[NUM_CAJAS_INICIALES];
        int numCajas = NUM_CAJAS_INICIALES;
        int minutosSinCola = 0;
        int personasEnColaAlFinalizar = 0;
        int personasAtendidas = 0;
        int itemsVendidos = 0;

      
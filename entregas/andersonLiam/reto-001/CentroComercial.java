import java.util.Random;

public class CentroComercial {
    private static final int HORAS_TRABAJO = 12;
    private static final int INTERVALO_TIEMPO = 1; 
    private static final int CAJAS = 4;
    private static final int MIN_PACKS = 5;
    private static final int MAX_PACKS = 15;
    private static final double PROBABILIDAD_LLEGADA = 0.4;

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int[] cola = new int[HORAS_TRABAJO * 60]; 

        for (int tiempo = 1; tiempo <= HORAS_TRABAJO * 60; tiempo += INTERVALO_TIEMPO) {
            Thread.sleep(1000); 

            
            if (random.nextDouble() <= PROBABILIDAD_LLEGADA) {
                int packs = MIN_PACKS + random.nextInt(MAX_PACKS - MIN_PACKS + 1);
                int indice = encontrarIndiceLibre(cola);
                if (indice != -1) {
                    cola[indice] = packs;
                    System.out.println("Llegó una persona con " + packs + " pack(s) de items en el minuto " + tiempo);
                }
            }

            
            int personasEnCola = contarPersonasEnCola(cola);
            System.out.println("Personas en cola: " + personasEnCola);

            
           }
}

}
public class CentroComercial {

    private static final int NUMERO_CAJAS = 4;
    private static final double PROBABILIDAD_LLEGADA_CLIENTE = 0.6;

    public static void main(String[] args) {
        int[] colaClientes = new int[720];

        int[] tiempoAtencionCajas = new int[NUMERO_CAJAS];
        int minutosConColaCero = 0;
        int personasEnColaAlCierre = 0;
        int personasAtendidas = 0;
        int articulosVendidos = 0;

        for (int tiempo = 1; tiempo <= 720; tiempo++) {
            if (Math.random() < PROBABILIDAD_LLEGADA_CLIENTE) {
                int packsDeItems = (int) (Math.random() * 11) + 5;
                agregarACola(colaClientes, packsDeItems);
                System.out.println("MINUTO " + tiempo + " - Llega 1 persona - En Cola: " + contarElementosNoCero(colaClientes));
            } else {
                System.out.println("MINUTO " + tiempo + " - No llega nadie  - En Cola: " + contarElementosNoCero(colaClientes));
            }
    }
    private static void agregarACola(int[] cola, int elemento) {
        for (int i = 0; i < cola.length; i++) {
            if (cola[i] == 0) {
                cola[i] = elemento;
                break;
            }
        }
    }
    private static int contarElementosNoCero(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value != 0) {
                count++;
            }
        }
        return count;
    }

    
}
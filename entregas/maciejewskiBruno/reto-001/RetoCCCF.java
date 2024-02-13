public class RetoCCCF {

    final static int PROBABILIDAD_CLIENTE = 60;
    final static int HORAS_JORNADA = 12;

    public static void main(String[] args) {

        int cola = 0;

        for (int minuto = 1; minuto <= HORAS_JORNADA * 60; minuto++) {
            System.out.print("MINUTO " + minuto + " - ");
            cola = llegadaCola(cola);
            System.out.println("En Cola: " + cola);
        }
    }
    private static int llegadaCola(int cola) {
        double probabilidadCliente = Math.random() * 100;
        if (PROBABILIDAD_CLIENTE > probabilidadCliente) {
            cola++;
            System.out.print("Llega 1 persona - ");
        } else {
            System.out.print("No llega nadie  - ");
        }
        return cola;
    }
}

public class RetoCCCF {

    final static int PROBABILIDAD_CLIENTE = 60;
    final static int HORAS_JORNADA = 12;
    final static int MINIMO_ITEMS = 5;
    final static int MAXIMO_ITEMS = 15;

    public static void main(String[] args) {

        int[] cajas = { 0, 0, 0, 0, };
        int cola = 0;

        for (int minuto = 1; minuto <= HORAS_JORNADA * 60; minuto++) {
            
            cola = llegadaCola(cola);
    
            for (int caja = 0; caja < cajas.length; caja++) {
                if (cajas[caja] > 0) {
                    cajas[caja]--;
                } else if (cola > 0) {
                    cola--;
                    cajas[caja] = (int) (Math.random() * (MAXIMO_ITEMS - MINIMO_ITEMS)) + MINIMO_ITEMS;
                }

            }
            System.out.print("MINUTO " + minuto + " - ");
            System.out.println("En Cola: " + cola);
            for (int caja = 0; caja < cajas.length; caja++) {
                System.out.print("Caja " + (caja + 1) + ":[" + cajas[caja] + "] | ");
            }
            System.out.println();
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
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

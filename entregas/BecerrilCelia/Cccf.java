package Cccf;

public class Cccf {


    public static void main(String[] args) {
        Cccf reto = new Cccf();
        reto.simularDia();
       
    }

    int cola = 0;
    int contadorPersonas = 0;
    int contadorPaquetes = 0;
    private int paquetesCaja1 = 0;
    private int paquetesCaja2 = 0;
    private int paquetesCaja3 = 0;
    private int paquetesCaja4 = 0;
    private int paquetesCaja5 = 0;
    int contadorReset = 0;

    public void simularDia() {
        int minutosDia = 12 * 60;
        for (int i = 0; i < minutosDia; i++) {
            double probabilidadPersonaLlegue = Math.random();
            int persona = (probabilidadPersonaLlegue <= 0.4) ? 1 : 0;
    
            if (persona == 1) {
                cola++;
                contadorPersonas++;
            }
    
        }
    }

    public void restarPaquetePorMinuto() {
        if (paquetesCaja1 != 0) {
            paquetesCaja1--;
        
        } if (paquetesCaja2 != 0) {
            paquetesCaja2--;
        
        }  if (paquetesCaja3 != 0) {
            paquetesCaja3--;
        
        }  if (paquetesCaja4 != 0) {
            paquetesCaja4--;
        
        }  if (paquetesCaja5 != 0) {
            paquetesCaja5--;
        } 
    }






    
}

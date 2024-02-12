import java.util.Scanner;
import java.util.Random;


public class Carrefour{
    public static void main(String[] args) {

        int minutosDia=12*60;
        int  personas=0;
        int  numeroPaquetes=0;
        int cola=0;
        int paquetesCaja1=0;
        int paquetesCaja2=0;
        int paquetesCaja3=0;
        int paquetesCaja4=0;
        int paquetesCaja5=0;
        double probabilidadPersona;

        for (int i=1; i <= minutosDia; i++) {
            probabilidadPersona = Math.random();
            numeroPaquetes = 0;
            if ( probabilidadPersona <= 0.4) {
                personas = 1;
            }
            else {
                personas = 0;
            }
            if (personas == 1) {
                numeroPaquetes = (int)(Math.random() * 11 + 5);
                cola++;
            }
            else if (cola != 0) {
                numeroPaquetes = (int)(Math.random() * 11 + 5);
            }

            if (paquetesCaja1 != 0){
                paquetesCaja1--;
            }
            if (paquetesCaja2 != 0){
                paquetesCaja2--;
            }
            if (paquetesCaja3 != 0){
                paquetesCaja3--;
            }
            if (paquetesCaja4 != 0){
                paquetesCaja4--;
            }
            if (paquetesCaja5 != 0){
                paquetesCaja5--;
            }
            for (int j=1; j<=cola; j++) {
                if (paquetesCaja1==0){
                    paquetesCaja1=numeroPaquetes;
                    cola--;
                    System.out.println("1");
                }
                else if (paquetesCaja2 == 0){
                    paquetesCaja2=numeroPaquetes;
                    cola--;
                    System.out.println("2");
                }
                else if (paquetesCaja3 == 0){
                    paquetesCaja3=numeroPaquetes;
                    cola--;
                    System.out.println("3");
                }
                else if (paquetesCaja4 == 0){
                    paquetesCaja4=numeroPaquetes;
                    cola--;
                    System.out.println("4");
                }
                else if (paquetesCaja5 == 0){
                    paquetesCaja5=numeroPaquetes;
                    cola--;
                    System.out.println("5");
                }
            }
            for (int j=0; j<=25; j++){
                System.out.print("- ");
            }
            System.out.println("");
            System.out.println("Minuto " + i + ": Ha entrado " + personas + " persona/s");
            System.out.println("Hay "+ cola + " persona/s en la cola");
            System.out.println("Paquetes: Caja1["+paquetesCaja1+"] Caja2["+paquetesCaja2+"] Caja3["+paquetesCaja3+"] Caja4["+paquetesCaja4+"] Caja5["+paquetesCaja5+"]");
      
            for (int j=0; j<=25; j++){
                System.out.print("- ");
            }
            System.out.println("\n");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

        }
    }
}

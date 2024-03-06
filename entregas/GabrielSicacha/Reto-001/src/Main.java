//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CF cff = new CF(6,4,0.4);
        for(int min=1; min<=760; min ++){
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("MINUTO "+min+ " - ");
            cff.avanzar();
            cff.imprimirCajaYCola();
        }



    }

}
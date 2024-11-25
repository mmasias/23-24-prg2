package HojaDeCalculo;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Interfaz {

    private HojaDeCalculo hoja;
    private Cursor cursor;
    private Scanner scanner;


    public Interfaz(HojaDeCalculo hoja) {
        this.hoja = hoja;
        this.cursor = new Cursor(hoja);
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean salir = false;
        do{
            mostrar();
            int comando = scanner.nextInt();
            salir = procesarComando(comando);
        } while(!salir);

        System.out.println("Se ha salido de la hoja de calculo");
    }

    private boolean procesarComando(int comando) {
        if (comando == 0 || comando == 5){
            switch (comando) {
            case 0:
                return true;
            
            case 5:
                editarCelda();
                break;         
        }
        }else{
            cursor.mover(comando);
            return false;
        }
        return false;
    }

    private void editarCelda() {
        Celda celdaActual = cursor.obtenerPosicion();
        System.out.println("Introduce el valor que quieres poner en la celda");
        String valor = scanner.next();
        celdaActual.cambiarValor(valor);
    }

    private void mostrar() {
        limpiarPantalla();
        System.out.println("Ubicacion actual: Fila[" + cursor.obtenerFilaActual() + "] / Columna[" + cursor.obtenerColumnaActual() + "]");
        System.out.println("Opciones: Movimiento:2468 || Editar celda:5 || Salir: 0");
        for (int i = 0; i < 15; i ++){
            System.out.printf("%-5d|", i+1);
            for (int j = 0; j < 15; j++){
                String celda = hoja.devolverCelda(i, j).devolverValor();
                celda = celda.length() > 5 ? celda.substring(0, 5) : String.format("%-5s", celda);

                if (i == cursor.obtenerFilaActual() && j == cursor.obtenerColumnaActual()) {
                    System.out.print("[" + celda + "]");
                } else {
                    System.out.print(" " + celda + " ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

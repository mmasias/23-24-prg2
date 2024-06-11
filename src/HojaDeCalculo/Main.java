package HojaDeCalculo;

public class Main {

    private static final int FILAS = 15;
    private static final int COLUMNAS = 15;

    public static void main(String[] args) {
        HojaDeCalculo hoja = new HojaDeCalculo(FILAS, COLUMNAS);
        Interfaz ui = new Interfaz(hoja);
        ui.iniciar();
        
    }
}

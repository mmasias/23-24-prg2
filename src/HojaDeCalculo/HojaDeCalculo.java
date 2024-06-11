package HojaDeCalculo;

public class HojaDeCalculo {

    private Celda[][] celdas;
    private Cursor cursor;
    private final int FILAS;
    private final int COLUMNAS;


    public HojaDeCalculo(int filas, int columnas) {
        FILAS = filas;
        COLUMNAS = columnas;
        celdas = new Celda[filas][columnas];
        for(int i = 0; i < FILAS; i++){
            for(int j = 0; j < COLUMNAS; j++){
                celdas[i][j] = new Celda();
            }
        }
    }

    public Celda devolverCelda(int fila, int columna){
        return celdas[fila][columna];
    }

}

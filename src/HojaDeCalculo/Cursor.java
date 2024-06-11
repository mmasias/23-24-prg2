package HojaDeCalculo;

public class Cursor {
    private HojaDeCalculo hoja;
    private int fila;
    private int columna;

    public Cursor(HojaDeCalculo hoja){
        this.hoja = hoja;
        fila = 0;
        columna = 0;
    }

    public Celda obtenerPosicion(){
        return hoja.devolverCelda(fila, columna);
    }

    public int obtenerFilaActual(){
        return fila;
    }

    public int obtenerColumnaActual(){
        return columna;
    }

    public void mover(int direccion){
        switch (direccion) {
            case 8:
                fila --;
                fila = fila < 0 ? 14: fila;
                break;
            case 2:
                fila ++;
                fila = fila > 14 ? 0 : fila;
                break;
            case 4:
                columna --;
                columna = columna < 0 ? 14: columna;
                break;
            case 6:
                columna ++;
                columna = columna > 14 ? 0: columna;
                break;
        }
    }
    
}

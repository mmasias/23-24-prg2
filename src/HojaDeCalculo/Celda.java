package HojaDeCalculo;

public class Celda {
    
    private String valor;

    Celda(){
        this.valor = "";
    }

    public String devolverValor(){
        return valor;
    }
    
    public void cambiarValor(String valor){
        this.valor = valor;
    }
}

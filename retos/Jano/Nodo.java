public class Nodo {

    private int valor;
    private String texto;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(int valor, String texto) {
        this.valor = valor;
        this.texto = texto;
        this.izquierda = null;
        this.derecha = null;
    };

    public Nodo izquierda(){
        return izquierda;
    }

    public Nodo derecha(){
        return derecha;
    }

    public void mostrar() {
        System.out.println(texto);
    }

    public int valor() {
        return valor;
    }

    public void asignarLaterales(Nodo izquierda, Nodo derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }
    
}

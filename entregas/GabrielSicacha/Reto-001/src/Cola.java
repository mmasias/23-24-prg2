public class Cola {
    private Cliente primero;
    private int tamano;

    public Cola() {
        this.primero = null;
        this.tamano = 0;
        System.out.println("> Se abre la cola al iniciar el dia");
    }

    public int tamano(){
        return this.tamano;
    }

    public boolean vacio(){
        return this.tamano == 0;
    }

    public void llegada(){
        Cliente nuevoCliente = new Cliente();
        if (this.primero==null){
           this.primero = nuevoCliente;
        } else {
            Cliente iterador = this.primero;
            while (iterador.getSiguiente()!=null){
                iterador = iterador.getSiguiente();
            }
            iterador.setSiguiente(nuevoCliente);
        }
        this.tamano++;
    }

    public void avanzar(){
        if(!vacio()){
            this.primero = this.primero.getSiguiente();
            this.tamano--;
        }
    }

    public int getTamano() {
        return tamano;
    }

    public Cliente getPrimero() {
        return primero;
    }
}


package Reto-003;

public class Fila {
    private Cliente[]nPersonas;

    public Cliente[] getnPersonas() {
        return nPersonas;
    }

    public void setnPersonas(Cliente[] nPersonas) {
        this.nPersonas = nPersonas;
    }

    public Fila(Cliente[] nPersonas) {
        this.nPersonas = nPersonas;
    }
    
    
}

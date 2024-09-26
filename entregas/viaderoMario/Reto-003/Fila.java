package entregas.viaderoMario.Reto-003;

public class Fila {
    private Cliente[]nPersons;

    public Cliente[] getnPersons() {
        return nPersons;
    }

    public void setnPersons(Cliente[] nPersons) {
        this.nPersons = nPersons;
    }

    public void insertarCliente(Cliente cliente){
        
    }

    public Fila(Cliente[] nPersons) {
        this.nPersons = nPersons;
    }
    
}

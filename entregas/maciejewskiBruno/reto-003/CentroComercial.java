class CentroComercial {

    public CentroComercial(Fila fila){}
    public Caja[] obtenerCajas();
    
}
class Caja{

    public Caja(Fila fila){};
    public Fila obtenerFila();
    public Cliente obtenerClienteActual();

}
class Fila {

    public Fila(){};
    public Cliente[] obtenerClientes();
    public void añadirCliente(Cliente cliente);
    
}
class Cliente{

    public Cliente(int numeroItems){};
    public int numeroItems();

}

class main{

    public static void main(String[] args) {

        Fila fila = new Fila();
        CentroComercial carrefour = new CentroComercial(fila);
        Cliente juan = new Cliente(10);
        Cliente pedro = new Cliente(15);
        fila.añadirCliente(juan);
        fila.añadirCliente(pedro);
        

    }

}

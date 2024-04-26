public class Cliente {

    public int numeroProductos;
    public String cliente;

    public Cliente(String string) {
        this.cliente = string;
        this.numeroProductos = (int) (Math.random() * 10) + 1;
    }
}

public class App {
    public static void main(String[] args) {

        CentroComercial centroComercial = new CentroComercial(5, 3);

        while (true) {
            if (centroComercial.avanzar() == 0) {
                break;
            }
            Cliente cliente = (Cliente) centroComercial.siguienteClienteEnFila();
            if (cliente != null) {
                centroComercial.agregarCliente(cliente);
                centroComercial.procesarCliente();
            }
            centroComercial.mostrarEstado();
            System.out.println();
        }
    }
}

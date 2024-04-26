public class Fila {

    Cliente clientes[];
    
    public Fila() {
        clientes = new Cliente[5];
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente("Cliente " + i);
        }
    }

    public Cliente siguienteCliente() {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].numeroProductos > 0) {
                return clientes[i];
            }
        }
        return null;
    }

    public void avanzar() {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].numeroProductos > 0) {
                clientes[i].numeroProductos--;
            }
        }
    }

    public void mostrarEstado() {
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i].cliente + ": " + clientes[i].numeroProductos);
        }
    }
    
}

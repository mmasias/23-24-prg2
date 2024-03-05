class Restaurante {

	public Restaurante(Cliente cliente, Mesa mesa, Reserva reserva, int maxMesas, int maxReservas)
	public Cliente anadirCliente()
	public Reserva anadirReserva()
	public void anadirMesa(Mesa mesa)
	public void eliminarMesa(Mesa mesa)
	public void asignarClienteAMesa(int numeroMesa, Cliente cliente
	public void añadirReserva(Reserva reserva) 
	public void eliminarReserva(Reserva reserva)
	

}


class Cliente {
	public Cliente(String nombre, String apellido)
	public String anadirNombre
	public String anadirApellido
	public void hacerReserva(Restaurante, restaurante, Mesa mesa, LocalDateTime fechaHora)
	public void anularReserva(Restaurante restaurante, Reserva reserva)
	
}

class Reserva {
	
	public Reserva(Cliente cliente, Mesa mesa, LocalDateTime fechaHora)
	public Cliente anadirCliente()
	public Mesa anadirMesa()
	public LocalDateTime anadirFechaHora()
	public boolean estaCancelada()

}

class Mesa {
	public Mesa(int capacidad, int numero, boolean disponible)
	public int anadirCapacidad()
	public int anadirNumero()
	public boolean estaDisponible()
	public Cliente anadirCliente()
	public void anadirReserva(Reserva reserva)

}

public class Main {
        public static void main(String[] args) {
            Cliente cliente = new Cliente("Celia", "Becerril");
            Mesa mesa = new Mesa(1, 4, true); // Fix: Update the constructor call for the Mesa class
            Reserva reserva = new Reserva(cliente, mesa, LocalDateTime.now());

            Restaurante restaurante = new Restaurante(cliente, mesa, reserva, 10, 10);

            Cliente newCliente = new Cliente("Celia", "Becerril");
            restaurante.setCliente(newCliente);

            Reserva newReserva = new Reserva(newCliente, mesa, LocalDateTime.now().plusDays(1));
            restaurante.setReserva(newReserva);

            System.out.println(
                    "Cliente: " + restaurante.anadirCliente().anadirNombre() + "  " + restaurante.anadirCliente().anadirApellido());
            System.out.println("Reserva: " + restaurante.anadirReserva().anadirFechaHora());
        }
}




	
	

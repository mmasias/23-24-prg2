public class App {

    public static void main(String [] args) {
        
        Restaurante donJamon = new Restaurante("Don Jamon");
        
        Cliente fondoAlejandro = new Cliente("Alejandro Fondo");

        Reserva reserva = new Reserva(1, fondoAlejandro.mostrar());
        
        Mesa unaMesa = new Mesa(1,1);
        

        unaMesa.adjudicarMesa(fondoAlejandro.mostrar());
        
        donJamon.mesasDisponibles(10);
        

        System.out.println(donJamon.mostrar());
        System.out.println(reserva.mostrar());
        System.out.println(unaMesa.mostrar());
        
    }
}
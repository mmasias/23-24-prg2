class Usuario {
    
    public Usuario(String Nombre, int DNI);
    public Usuario(int DNI);

    public String obtenerNombre();
    public int obtenerDNI();
}

class Libro {

    public Libro(String obtenerTítulo, String Autor);
    public Libro(String obtenerTítulo);
    
    public String obtenerTítulo();
    public String obtenerAutor();
    public boolean disponibilidad();
    
}

class Préstamo{

    class Préstamo(String nombreUsuario, int DNI, int DíaQueSeHiZO, Int DíaDevolución, String nombreLibro )

    class int obtenerIdentificador();

}

class Biblioteca{ 

class Biblioteca(String Ubicación);

class boolean hacerPréstamo(Préstamo prestamo);
class boolean operativa(Fecha fecha);
class void operativa(Hora hora);
class void aplicarMulta(Préstamo préstamo);
class void actualizarDisponilidad();
}
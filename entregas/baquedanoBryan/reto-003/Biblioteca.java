class Usuario {
    
    public Usuario(String Nombre, int dni);
    public Usuario(int dni);
}

class Libro {

    public Libro(String obtenerTítulo, String autor);
    public Libro(String obtenerTítulo);
    
    public String obtenerTítulo();
    public String obtenerAutor();
    public boolean disponibilidad();
    
}

class Préstamo{

    class Préstamo(String nombreUsuario, int dni, int DíaQueSeHiZO, int DíaDevolución, String nombreLibro );
    class int obtenerIdentificador();

}


class Biblioteca{ 

    class Biblioteca(String Ubicación);

    class void hacerPréstamo(Préstamo prestamo);
    class boolean operativa(Fecha fecha);
    class boolean operativa(Hora hora);
    class void aplicarMulta(Préstamo préstamo);
    class void actualizarDisponilidad();
}
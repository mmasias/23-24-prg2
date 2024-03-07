class Biblioteca {
    
    public Biblioteca(String nombre, String direccion)
    
    public boolean estaAbierto(String horario)
    public void registrarPrestamo(Usuario usuario, Libro libro, String fechaPedido)
    public void registrarDevolucion(Usuario usuario, Libro libro)
    
}

class Libro{
    public Libro(String titulo, String autor, String editorial, String numeroPaginas, String genero, String añoPublicacion)

    public boolean estaDisponible()
    public int obtenerNumeroPaginas()
    public int obtenerAñoPublicacion()
    public String obtenerEditorial()
    public String obtenerAutor()
    public String obtenerTitulo()
    
}

class Prestamo{
    
    public Prestamo(Usuario Usuario, String fechaPedido, Libro libro)

    
}

class Usuario{
    public Usuario(String nombre, int edad, int contacto, String direccion)

    public void pedirLibro()

}

class App{
    
    public static void main(String[] args) {
            
        
            Biblioteca biblioteca = new biblioteca(usuario,prestamo,libro);

            Libro libro = new libro("Harry Potter", "Lord of the Rings", "1984")
            biblioteca.addLibro(HarryPotter)

            Usuario usuario = new usuario("Kelvia", "18", "999999999", "Calle Albert Einstein");
            biblioteca.addUsuario(Kelvia)
            
            Prestamo prestamo = kelvia.prestamo(HarryPotter);
            
            Prestamo prestamo = new Prestamo(usuario, LocalDateTime.now(), libro);
            Biblioteca.setPrestamo();

            System.out.println(
                    "Usuario: " + biblioteca.anadirUsuario().anadirNombre() + "  " + biblioteca.anadirUsuario().anadirEdad());
            System.out.println("Prestamo: " + biblioteca.anadirPrestamo().anadirFechaHora());

    }
}



    

    
    
    
    
    
    
    
    
    

    

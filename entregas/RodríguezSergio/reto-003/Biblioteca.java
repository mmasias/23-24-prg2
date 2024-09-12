class Biblioteca {

    public Biblioteca(String nombre, String ciudad, LocalTime horaApertura, LocalTime horaCierre){
    }
    public boolean estado(Biblioteca biblioteca){
    }
}

class Libro {     

    public Libro(String titulo, String autor, int año, String editorial, String genero){    
    }
    public void agregarLibro(Libro libro){
    }
    public boolean comprobarDisponibilidad(Libro libro){ 
    }
}

class Usuario {
    
    public Usuario(String nombre, int numeroID){ 
    }
    public boolean comprobarExistenciaUsuario(Usuario usuario){ 
    }
    public void agregarNuevoUsuario(Usuario usuario){ 
    }
    public void editarUsuarioExistente(Usuario usuario){ 
    }
    public void darDeBajaUsuario(Usuario usuario){ 
    }
}

class Prestamo {
    
    public Prestamo(String nombreUsuario, String nombreLibro, int diaEntregaLibro, int diaDevolucionLibro){
    }
    public void pedirPrestamoLibro(Prestamo prestamo){
    }
    public boolean comprobarDisponibilidadLibroParaPrestamo(Libro libro){ 
    }
    public void cancelarPrestamo(Prestamo prestamo){
    }
    public boolean pedirAmpliacion(Prestamo prestamo){
    }
}
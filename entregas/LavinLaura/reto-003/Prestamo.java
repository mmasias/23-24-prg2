public class Prestamo {
    private Usuario usuario;
    private Libro libro;
    private int diasPrestado;

    public Prestamo(Usuario usuario, Libro libro, int diasPrestado) {
        this.usuario = usuario;
        this.libro = libro;
        this.diasPrestado = diasPrestado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getDiasPrestado() {
        return diasPrestado;
    }

    public void setDiasPrestado(int diasPrestado) {
        this.diasPrestado = diasPrestado;
    }
    
}

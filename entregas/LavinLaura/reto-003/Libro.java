public class Libro {
    private String titulo;
    private String genero;
    private String añoPublicacion;
    private  int numPaginas;
    private String autor;
    public Libro(String titulo, String genero, String añoPublicacion, int numPaginas, String autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.añoPublicacion = añoPublicacion;
        this.numPaginas = numPaginas;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAñoPublicacion() {
        return añoPublicacion;
    }
    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}

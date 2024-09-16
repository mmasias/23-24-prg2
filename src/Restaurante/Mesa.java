public class Mesa {
    
    private int numeroMesa;
    private int cantidadComensales;
    private String nombre;
    
    public Mesa(int numeroMesa, int cantidadComensales) {

        this.numeroMesa = numeroMesa;
        this.cantidadComensales = cantidadComensales;

        numeroMesa = 1;
        cantidadComensales = 1;

    }

    public void adjudicarMesa(String nombre) {

        this.nombre = nombre;

    }

    public String mostrar() {
        return "Cliente: | " + "nombre: " + nombre + " - " + "numero de mesa: " + this.numeroMesa + " - " + "cantidad de comensales: " + this.cantidadComensales;
    }




}

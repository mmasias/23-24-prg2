public class Cliente {
    private int paqueteDeItems;
    private Cliente siguiente;


    public Cliente(){
        this.paqueteDeItems = (int)(Math.random()*11)+5;
        System.out.print(" Llega 1 persona");
    }
    public int getPaqueteDeItems(){ return paqueteDeItems;}
    public Cliente getSiguiente() {return siguiente;}
    public void setSiguiente(Cliente next){ this.siguiente=next;}
}

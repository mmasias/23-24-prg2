public class Caja {
    private int cajaID;
    private boolean activa;
    private boolean ocupada;
    private int itemsEnCaja;

    public Caja(int cajaID, boolean activa) {
        this.cajaID = cajaID;
        this.activa = activa;
        this.ocupada = false;
        this.itemsEnCaja = 0;
        if(activa){
            System.out.println("> Se abre la caja numero "+cajaID);
        }
    }

    public int getCajaID(){ return cajaID; }

    public boolean getActiva(){ return activa; }

    public void setActiva(boolean estado) {
        this.activa = estado;
    }

    public boolean getOcupada() { return itemsEnCaja!=0; }

    public void imprimirItemsEnCaja() {
        System.out.print("Caja"+cajaID+":["+itemsEnCaja+"] | "); }

    public void setItemsEnCaja(int itemsEnCaja) {
        this.itemsEnCaja = itemsEnCaja;
    }

    public void registrarItems(){
        itemsEnCaja--;
    }

}

package entregas.CentroComercial;

class Caja {
    private int itemsPorAtender;

    public Caja() {
        this.itemsPorAtender = 0;
    }

    public boolean estaLibre() {
        return itemsPorAtender == 0;
    }

    public void recibe(Persona persona) {
        this.itemsPorAtender = persona.getItems();
    }

    public void atiende() {
        if (itemsPorAtender > 0) {
            itemsPorAtender--;
        }
    }

    public int getItemsPorAtender() {
        return itemsPorAtender;
    }

    public void verEstado() {
        System.out.print("[" + itemsPorAtender + "] ");
    }
}

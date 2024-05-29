class Caja {
    private int clientesProcesados;
    private int itemsRestantes;
    private boolean libre;

    public Caja() {
        this.clientesProcesados = 0;
        this.itemsRestantes = 0;
        this.libre = true;
    }

    public boolean isLibre() {
        return libre;
    }

    public void ocuparCaja(int items) {
        this.clientesProcesados++;
        this.itemsRestantes = items;
        this.libre = false;
    }

    public void procesarItem() {
        if (itemsRestantes > 0) {
            itemsRestantes--;
            if (itemsRestantes == 0) {
                libre = true;
            }
        }
    }

    public int getClientesProcesados() {
        return clientesProcesados;
    }

    public int getItemsRestantes() {
        return itemsRestantes;
    }
}


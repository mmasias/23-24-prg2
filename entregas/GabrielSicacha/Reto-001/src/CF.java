public class CF {
    private int cajasTotales;
    private int cajasIniciales;

    public Caja[] cajas;
    private double clientesPorMin;
    private Cola cola;

    public CF(int cajasTotales, int cajasIniciales, double clientesPorMin) {
        this.cajasTotales = cajasTotales;
        this.cajasIniciales = Math.min(cajasIniciales, cajasTotales);
        this.clientesPorMin = clientesPorMin;
        abrir();
        this.cola = new Cola();
    }

    public void abrir() {
        cajas = new Caja[cajasTotales];
        for (int i = 0; i < cajasTotales; i++) {
            cajas[i] = new Caja(i + 1, i < cajasIniciales);
        }
    }

    public void avanzar() {
        llegada();
            for (int i = 0; i < cajasTotales; i++) {
                if (cajas[i].getActiva()) {
                    if (!cajas[i].getOcupada()&&!cola.vacio()) {
                        cajas[i].setItemsEnCaja(cola.getPrimero().getPaqueteDeItems());
                        cola.avanzar();
                    } else if (cajas[i].getOcupada()) {
                        cajas[i].registrarItems();
                    }
                }
            }
        }


    public void llegada() {
        if(Math.random()>clientesPorMin) {
            cola.llegada();
        } else {
            System.out.print("No llega nadie");
        }
    }

    public void imprimirCajaYCola(){
        System.out.println(" - En cola: " + cola.tamano());
        for(int i=0;i<cajasIniciales;i++){
            cajas[i].imprimirItemsEnCaja();
        }
        System.out.println();
    }
}
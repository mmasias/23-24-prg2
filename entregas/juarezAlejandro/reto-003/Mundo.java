class Mundo {
    public static void main(String[] args) {
        Restaurante mrUchu = new Restaurante(0, 0);

        Cliente alejandroJuarez = new Cliente("Alejandro Juárez");
        mrUchu.hacerReserva(alejandroJuarez);

        Mesa unaMesa = new Mesa(4, 7);

    }
}
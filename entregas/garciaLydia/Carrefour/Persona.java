package entregas.garciaLydia.Carrefour;

public class Persona {
    private int items;

    public Persona() {
        this.items = 5 + (int) (Math.random() * 11); // entre 5 y 15 items
    }

    public int getItems() {
        return items;
    }
}

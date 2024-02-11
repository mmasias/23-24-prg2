class Carrefour {

    public static void main(String[] args) {

        final double OPENING_TIME = 9;
        final double CLOSING_TIME = 21;
        int time = 0;
        boolean isOpen = true;
        final double PROBABILITY_ARRIVAL = 0.6;

        if (time<CLOSING_TIME) {
            isOpen = true;
            time++;
            System.out.println("Time: " + time);
        }
       

}
}
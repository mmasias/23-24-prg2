class Carrefour {

    public static void main(String[] args) {

        final double OPENING_TIME = 9.0;
        final double CLOSING_TIME = 21.0;
        final double MINUTE = 1.0 / 60.0;
        double currentTime = OPENING_TIME;
        boolean isWorking = true;

        int line = 0;
        final double PROBABILITY_ARRIVAL = 0.6;

        do {
            currentTime = currentTime + MINUTE;
            isWorking = currentTime < CLOSING_TIME;
            
            line = line + (Math.random() < PROBABILITY_ARRIVAL ? 1 : 0);
            
            System.out.println(currentTime);
            System.out.println("> COLA DE " + line);

        } while (isWorking);
    }
}
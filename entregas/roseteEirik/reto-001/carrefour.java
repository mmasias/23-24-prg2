class carrefour{
    public static void main(String[] args) {
        
        final int DAY_HOURS = 12;
        final int DAY_MINUTES = DAY_HOURS * 60;
        int costumerQueue = 0;
        
        for(int minutes = 0; minutes <= DAY_MINUTES; minutes++){
            currentTime(minutes);
            boolean costumerSpawnProbability = Math.random() < 0.6;
            costumerQueue = costumerQueue + (costumerSpawnProbability ? 1 : 0);
            System.out.println(costumerQueue);
        }

    }

    static void currentTime(int minutes) {
        int hour = 9 + (minutes / 60);
        minutes = minutes % 60;
        String division = ":";
        if (minutes < 10){
            division = ":0";
        }
        System.out.println(hour + division + minutes);
    }

    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    static void pause(double seconds) {
        try {
            Thread.sleep((int) (1000 * seconds));
        } catch (InterruptedException e) {
        }
    }
}
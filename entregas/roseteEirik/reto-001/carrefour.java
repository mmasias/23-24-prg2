class carrefour{
    public static void main(String[] args) {
        
        final int DAY_HOURS = 12;
        final int DAY_MINUTES = DAY_HOURS * 60;

        for(int minutes = 0; minutes <= DAY_MINUTES; minutes++){
            
        }

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
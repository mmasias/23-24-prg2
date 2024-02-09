class CentroComercial{
    
    public static void main(String[] args) {

    }

    static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    static boolean somethingHappens(int chance) {
        if (randomNumber(0, 100) < chance){
            return true;
        } else {
            return false;
        }
    }

    static void sleep(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
        }
    }
}
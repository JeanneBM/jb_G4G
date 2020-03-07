public class DeutschWelcome {
    private static DeutschWelcome instance = new DeutschWelcome();

    private DeutschWelcome(){}

    public static DeutschWelcome getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Guten Tag! Ich heiße Asia. Auf Wiedersehen!");
    }
}



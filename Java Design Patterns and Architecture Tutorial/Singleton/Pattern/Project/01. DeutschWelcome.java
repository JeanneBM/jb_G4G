public class DeutschWelcome {
    private static DeutschWelcome instance = new DeutschWelcome();

    //make the constructor private so that this class cannot be
    //instantiated
    private DeutschWelcome(){}

    //Get the only object available
    public static DeutschWelcome getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Guten Tag! Ich heiße Asia. Auf Wiedersehen!");
    }
}



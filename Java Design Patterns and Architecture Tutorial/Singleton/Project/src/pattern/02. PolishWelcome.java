public class PolishWelcome {
    private static PolishWelcome instance = new PolishWelcome();

    //make the constructor private so that this class cannot be
    //instantiated
    private PolishWelcome(){}

    //Get the only object available
    public static PolishWelcome getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Czesc! Mam na imie Asia. Do zobaczenia!");
    }
}

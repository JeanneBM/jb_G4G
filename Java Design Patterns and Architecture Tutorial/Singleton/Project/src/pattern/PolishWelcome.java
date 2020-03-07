public class PolishWelcome {
    private static PolishWelcome instance = new PolishWelcome();
    
    private PolishWelcome(){}

    public static PolishWelcome getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Czesc! Mam na imie Asia. Do zobaczenia!");
    }
}

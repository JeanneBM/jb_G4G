public class SpanishWelcome {
    private static SpanishWelcome instance = new SpanishWelcome();

    //make the constructor private so that this class cannot be
    //instantiated
    private SpanishWelcome(){}

    //Get the only object available
    public static SpanishWelcome getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hola! Mi nombre es Asia. Hasta La Vista!");
    }
}

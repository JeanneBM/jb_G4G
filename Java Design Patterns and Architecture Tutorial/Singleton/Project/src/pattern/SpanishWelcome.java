public class SpanishWelcome {
    private static SpanishWelcome instance = new SpanishWelcome();
    
    private SpanishWelcome(){}

    public static SpanishWelcome getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hola! Mi nombre es Asia. Hasta La Vista!");
    }
}

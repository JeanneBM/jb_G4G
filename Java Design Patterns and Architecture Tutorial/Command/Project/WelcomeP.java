public class WelcomeP implements Interfejs {
    private PolishWelcome abcWelcome;

    public WelcomeP(PolishWelcome abcWelcome){
        this.abcWelcome = abcWelcome;
    }

    public void execute() {
        abcWelcome.greetP();
    }
}

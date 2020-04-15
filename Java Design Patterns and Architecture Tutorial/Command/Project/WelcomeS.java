public class WelcomeS implements Interfejs {
    private SpanishWelcome abcWelcome;

    public WelcomeS(SpanishWelcome abcWelcome){
        this.abcWelcome = abcWelcome;
    }

    public void execute() {
        abcWelcome.greetS();
    }
}

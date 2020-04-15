public class WelcomeS implements Interfejs {
    private SpanishWelcome abcsWelcome;

    public WelcomeD(SpanishWelcome abcdWelcome){
        this.abcsWelcome = abcsWelcome;
    }

    public void execute() {
        abcsWelcome.greetS();
    }
}

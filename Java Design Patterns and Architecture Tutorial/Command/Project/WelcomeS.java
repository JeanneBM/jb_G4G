public class WelcomeS implements interfejs {
    private SpanishWelcome abcsWelcome;

    public WelcomeD(SpanishWelcome abcdWelcome){
        this.abcsWelcome = abcsWelcome;
    }

    public void execute() {
        abcsWelcome.greetS();
    }
}

public class WelcomeP implements interfejs {
    private PolishWelcome abcpWelcome;

    public WelcomeP(PolishWelcome abcdWelcome){
        this.abcpWelcome = abcpWelcome;
    }

    public void execute() {
        abcpWelcome.greetP();
    }
}

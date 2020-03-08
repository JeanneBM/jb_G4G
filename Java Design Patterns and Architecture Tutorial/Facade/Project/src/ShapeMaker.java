package pattern;


public class ShapeMaker {
    private interfejs deutscheWelcome;
    private interfejs polishWelcome;
    private interfejs spanishWelcome;

    public ShapeMaker() {

        deutscheWelcome = new DeutscheWelcome();
        polishWelcome = new PolishWelcome();
        spanishWelcome = new SpanishWelcome();
    }


    public void welcomeMessageDeutscheWelcome(){
        deutscheWelcome.welcomeMessage();}

    public void welcomeMessagePolishWelcome(){
        polishWelcome.welcomeMessage();}

    public void welcomeMessageSpanishWelcome(){
        spanishWelcome.welcomeMessage();}

}

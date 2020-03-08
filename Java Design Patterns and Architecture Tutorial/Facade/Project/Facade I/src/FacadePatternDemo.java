package pattern;


public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.welcomeMessageDeutscheWelcome();
        shapeMaker.welcomeMessagePolishWelcome();
        shapeMaker.welcomeMessageSpanishWelcome();
    }
}

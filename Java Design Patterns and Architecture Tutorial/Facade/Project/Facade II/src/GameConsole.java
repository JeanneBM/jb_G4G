package pattern;
public class GameConsole {
    public void Clearscreen() {
        System.out.println("Clearing screen ....");
    }

    public void draw(DeutscheWelcome objectsDeutsche) {
        System.out.println("Deutsche Drawing");
    }
    public void draw(PolishWelcome objectsPolish) {
        System.out.println("Polish Drawing");
    }
    public void draw(SpanishWelcome objectsSpanish) {
        System.out.println("Spanish Drawing");
    }
}

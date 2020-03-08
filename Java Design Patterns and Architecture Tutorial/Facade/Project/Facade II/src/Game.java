package pattern;

public class Game {

    private DeutscheWelcome objectsDeutsche = new DeutscheWelcome();
    private PolishWelcome objectsPolish = new PolishWelcome();
    private SpanishWelcome objectsSpanish = new SpanishWelcome();
    private InputSystem input = new InputSystem();
    private GameConsole screen = new GameConsole();

    public void update() {
        // Input
        input.getInput();

        screen.draw(objectsDeutsche);
        objectsDeutsche.update(input);

        screen.draw(objectsPolish);
        objectsPolish.update(input);

        screen.draw(objectsSpanish);
        objectsSpanish.update(input);




    }

}

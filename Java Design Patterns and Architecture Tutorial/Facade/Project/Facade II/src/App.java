package pattern;
public class App {
    public static void main(String[] args) {

        Game game = new Game();
        int x = 0;
        // Game loop
        while (x < 2) {
            game.update();
            x++;
        }
    }
}

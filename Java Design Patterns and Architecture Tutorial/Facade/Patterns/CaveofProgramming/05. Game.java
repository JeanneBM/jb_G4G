public class Game {
	private InputSystem input = new InputSystem();
	private GameObjects objects = new GameObjects();
	private GameConsole screen = new GameConsole();

	public void update() {
		// Input
		input.getInput();

		// Update game objects (player, bad guys, etc)
		objects.update(input);

		// Draw
		screen.draw(objects);
	}
}

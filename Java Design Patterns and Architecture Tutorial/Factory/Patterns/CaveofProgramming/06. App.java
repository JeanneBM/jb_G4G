public class App {

	
	public static void main(String[] args) {
		
		Animal animal = AnimalFactory.createAnimal(AnimalFactory.CAT);
		
		animal.speak();
		animal.eat();

	}

}

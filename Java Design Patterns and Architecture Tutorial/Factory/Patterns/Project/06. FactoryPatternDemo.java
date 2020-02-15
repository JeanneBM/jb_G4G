public class FactoryPatternDemo {
    public static void main(String[] args) {
        WelcomeFactory welcomeFactory = new WelcomeFactory();


        Welcome deutsch_welcome = welcomeFactory.getWelcome("Deutsch");
        deutsch_welcome.execute();

        Welcome polish_welcome = welcomeFactory.getWelcome("Polish");
        polish_welcome.execute();

        Welcome spanish_welcome = welcomeFactory.getWelcome("Spanish");
        spanish_welcome.execute();
    }
}

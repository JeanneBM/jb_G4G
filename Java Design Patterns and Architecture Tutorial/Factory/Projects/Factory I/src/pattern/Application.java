public class Application {

    public static void main(String[] args) {

        Welcome deutsch_welcome = AbstractWelcome.createWelcome(AbstractWelcome.DeutschWelcome);
        Welcome polish_welcome = AbstractWelcome.createWelcome(AbstractWelcome.PolishWelcome);
        Welcome spanish_welcome = AbstractWelcome.createWelcome(AbstractWelcome.SpanishWelcome);

        deutsch_welcome.createHead();
        deutsch_welcome.createBody();
        deutsch_welcome.createFooter();
       // deutsch_welcome.execute();

        polish_welcome.createHead();
        polish_welcome.createBody();
        polish_welcome.createFooter();

        spanish_welcome.createHead();
        spanish_welcome.createBody();
        spanish_welcome.createFooter();

        System.out.println(" ");

        deutsch_welcome.execute();
        polish_welcome.execute();
        spanish_welcome.execute();

    }
}

public class SpanishWelcome implements Welcome{
    @Override
    public String createHead() {
        System.out.print ("Hola! ");
        return "Hola! ";
    }

    @Override
    public String createBody() {

        System.out.print("Mi nombre es Asia. ");
        return "Mi nombre es Asia. ";
    }

    @Override
    public String createFooter() {

        System.out.println("Hasta La Vista!");
        return "Hasta La Vista!";
    }
    @Override
    public String execute()
    {
        System.out.println (createHead() + createBody() + createFooter());
        return createHead() + createBody() + createFooter();
    }
}

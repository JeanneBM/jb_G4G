public class DeutschWelcome implements Welcome {

    @Override
    public String createHead()
    {
        System.out.print("Guten Tag! ");
        return "Guten Tag! ";

    }
    @Override
    public String createBody()
    {
        System.out.print("Ich heiße Asia. ");
        return "Ich heiße Asia. ";
    }
    @Override
    public String createFooter()
    {
        System.out.println("Auf Wiedersehen!");
        return "Auf Wiedersehen!";
    }
    @Override
    public String execute()
    {
        return createHead() + createBody() + createFooter();
    }
}

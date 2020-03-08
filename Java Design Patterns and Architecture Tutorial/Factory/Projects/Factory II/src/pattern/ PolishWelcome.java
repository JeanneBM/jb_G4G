public class PolishWelcome implements Welcome {
    @Override
    public String createHead() {       System.out.print ("Czesc! "); return "Czesc! "; }


    @Override
    public String createBody() {       System.out.print("Mam na imie Asia. "); return "Mam na imie Asia. "; }

    @Override
    public String createFooter() {     System.out.println("Do zobaczenia!"); return "Do zobaczenia!";    }
    @Override
    public String execute()
    {
        return createHead() + createBody() + createFooter();
    }
}

package strategyPattern;

public class strategyRunner {
    private interfejs strategy;

    public void setStrategy (interfejs strategy)
    {
        this.strategy = strategy;
    }

    public final String execute() {
        //public void execute()

        //strategy.createHead();
        //strategy.createBody();
        //strategy.createFooter();
        System.out.print(  strategy.createHead()
                + strategy.createBody()
                + strategy.createFooter());

        return  strategy.createHead()
                + strategy.createBody()
                + strategy.createFooter();




    }
}

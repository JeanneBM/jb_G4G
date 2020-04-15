public class CommandPatternDemo {
    public static void main(String[] args) {
        DeutschWelcome abcdWelcome = new DeutschWelcome();
        PolishWelcome abcpWelcome = new PolishWelcome();
        SpanishWelcome abcsWelcome = new SpanishWelcome();

        WelcomeD welcomingD = new WelcomeD(abcdWelcome);
        WelcomeP welcomingP = new WelcomeP(abcpWelcome);
        WelcomeS welcomingS = new WelcomeS(abcsWelcome);

        CommandInvoker invoker = new CommandInvoker();
        invoker.takeOrder(welcomingD);
        invoker.takeOrder(welcomingP);
        invoker.takeOrder(welcomingS);

        invoker.placeOrders();
    }
}

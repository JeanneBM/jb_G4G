public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        DeutschWelcome german_object = DeutschWelcome.getInstance();
        PolishWelcome polish_object = PolishWelcome.getInstance();
        SpanishWelcome spanish_object = SpanishWelcome.getInstance();

        //show the message
        german_object.showMessage();
        polish_object.showMessage();
        spanish_object.showMessage();
    }
}

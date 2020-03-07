public class SingletonPatternDemo {
    public static void main(String[] args) {

        DeutschWelcome german_object = DeutschWelcome.getInstance();
        PolishWelcome polish_object = PolishWelcome.getInstance();
        SpanishWelcome spanish_object = SpanishWelcome.getInstance();

        german_object.showMessage();
        polish_object.showMessage();
        spanish_object.showMessage();
    }
}

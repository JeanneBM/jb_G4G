public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject1 = new Subject();

        new DeutschWelcome(subject1);
        Subject subject2 = new Subject();
        new PolishWelcome(subject2);
        Subject subject3 = new Subject();
        new SpanishWelcome(subject3);

        System.out.println("First statement:");
        subject1.setState("Guten Tag! Ich heiße Asia. Auf Wiedersehen!");
        System.out.println("Second statement:");
        subject2.setState("Czesc! Mam na imie Asia. Do zobaczenia!");
        System.out.println("Third statement:");
        subject3.setState("Hola! Mi nombre es Asia. Hasta La Vista!");
    }
}

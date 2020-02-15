public class AbstractWelcome {
    public static final int DeutschWelcome = 0;
    public static final int PolishWelcome = 1;
    public static final int SpanishWelcome = 2;

    public static Welcome createWelcome(int type) {

        switch(type) {
            case DeutschWelcome:
                return new DeutschWelcome();
            case PolishWelcome:
                return new PolishWelcome();
            case SpanishWelcome:
                return new SpanishWelcome();

        }

        return null;
    }
}

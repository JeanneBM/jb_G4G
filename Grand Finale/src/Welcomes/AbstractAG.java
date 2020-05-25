public abstract class AbstractAG implements Welcomes {
    public static final int Afrikaans = 0;
    public static final int Arabski = 1;
    public static final int Bengalski = 2;

    public static Welcome createWelcome(int type) {

        switch(type) {
            case Afrikaans:
                return new Afrikaans();
            case Arabski:
                return new Arabski();
            case Bengalski:
                return new Bengalski();

        }

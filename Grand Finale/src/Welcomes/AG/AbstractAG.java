
public abstract class AbstractAG implements interfejsWelcomes {
    public static final int Afrikaans = 0;
    public static final int Arabski = 1;
    public static final int Bengalski = 2;
    
    @Override
    public static Welcome getWelcome(int type) {

        switch(type) {
            case Afrikaans:
                return new Afrikaans();
            case Arabski:
                return new Arabski();
            case Bengalski:
                return new Bengalski();
            break;
            default:
                System.out.println("Nie ma takiego jezyka");
        }
        
        

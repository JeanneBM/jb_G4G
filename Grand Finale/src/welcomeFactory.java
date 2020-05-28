import Welcome.*;

public class welcomeFactory {

    public Welcome makeWelcome(String welcomeType) {
        if (welcomeType.equals(null)){
            return null;
        }
        else if(welcomeType.equals("Afrikaans")){
            return new Afrikaans();
        }
        else if(welcomeType.equals("Arabski")){
            return new Arabski();
        }
        else if(welcomeType.equals("Bengalski")){
            return new Bengalski();
        }

        return null;


public class WelcomeFactory {


    public Welcome getWelcome(String welcomeType){
        if(welcomeType == null){
            return null;
        }
        if(welcomeType.equalsIgnoreCase("Deutsch")){
            return new DeutschWelcome();

        } else if(welcomeType.equalsIgnoreCase("Polish")){
            return new PolishWelcome();

        } else if(welcomeType.equalsIgnoreCase("Spanish")){
            return new SpanishWelcome();
        }

        return null;
    }
}

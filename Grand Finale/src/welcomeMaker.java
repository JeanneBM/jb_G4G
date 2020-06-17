public class welcomeMaker {
    public static String WelcomeType="";

    public void getOrder(String factoryType){


        if(factoryType.equalsIgnoreCase(anotherString: "(1) A-G")){

            System.out.println(WelcomeType + " order received.");
            welcomeFactory factory = new welcomeFactory();
            interfejsAG = factory.makeWelcome(WelcomeType);
            interfejsAG.createWelcome();
            System.out.println(interfejsAG.getWelcome() + " order completed.");
        }


	 if(factoryType.equalsIgnoreCase(anotherString: "(2) H-N")){

            System.out.println(WelcomeType + " order received.");
            welcomeFactory factory = new welcomeFactory();
            interfejsAG = factory.makeWelcome(WelcomeType);
            interfejsAG.createWelcome();
            System.out.println(interfejsAG.getWelcome() + " order completed.");
        }

        System.out.println("");
    }


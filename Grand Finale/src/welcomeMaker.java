public class welcomeMaker {
    public static String WelcomeType="";


    interfejsAG InterfejsAG;
    public void getOrder(String factoryType){
           if(factoryType.equalsIgnoreCase("(1) A-G")){

            System.out.println(WelcomeType + " order received.");
            welcomeFactory factory = new welcomeFactory();
            InterfejsAG = factory.makeWelcome(WelcomeType);
            InterfejsAG.createWelcome();
            System.out.println(InterfejsAG.getWelcome() + " order completed.");
        }


	    if(factoryType.equalsIgnoreCase("(2) H-N")){

            System.out.println(WelcomeType + " order received.");
            welcomeFactory factory = new welcomeFactory();
            InterfejsAG = factory.makeWelcome(WelcomeType);
            InterfejsAG.createWelcome();
            System.out.println(InterfejsAG.getWelcome() + " order completed.");
        }

        System.out.println("");
    }
}


	

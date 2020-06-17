import Welcomes.*;

// Receiver
public class welcomeMaker {
        public static String WelcomeType="";
     	interfejsAG InterfejsWelcomes;
        public void getOrder(String factoryType){
	
	
        if(factoryType.equalsIgnoreCase(anotherString: "(1) A-G")){
		        
        	System.out.println(WelcomeType + " order received.");
        	welcomeFactory factory = new welcomeFactory();
        	InterfejsWelcomes = factory.makeWelcome(WelcomeType);
        	InterfejsWelcomes.createWelcome();
       		System.out.println(InterfejsWelcomes.getWelcome() + " order completed.");
	}
	
	
	if(factoryType.equalsIgnoreCase(anotherString: "(2) H-N")){
	
		System.out.println(WelcomeType + " order received.");
        	welcomeFactory factory = new welcomeFactory();
        	InterfejsWelcomes = factory.makeWelcome(WelcomeType);
       		InterfejsWelcomes.createWelcome();
        	System.out.println(InterfejsWelcomes.getWelcome() + " order completed.");
        }
	
        System.out.println("");
}

    

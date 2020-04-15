public class WelcomeD implements Interfejs {
        private DeutschWelcome abcWelcome;

        public WelcomeD(DeutschWelcome abcWelcome){
            this.abcWelcome = abcWelcome;
        }

        public void execute() {
            abcWelcome.greetD();
        }
   

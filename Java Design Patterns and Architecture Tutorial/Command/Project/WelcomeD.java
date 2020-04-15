public class WelcomeD implements interfejs {
        private DeutschWelcome abcdWelcome;

        public WelcomeD(DeutschWelcome abcdWelcome){
            this.abcdWelcome = abcdWelcome;
        }

        public void execute() {
            abcdWelcome.greetD();
        }
    }

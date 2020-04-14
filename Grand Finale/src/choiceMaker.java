public class choiceMaker {
    static String welcomeType="";
    public static void main(String[] args) {
        ChoiceTaker choiceTaker = new ChoiceTaker();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("In what range is the first letter of the language you are looking for?");
            System.out.println("(1) A-G");
            System.out.println("(2) H-N");
            System.out.println("(Other) Libertà");

            int a = scanner.nextInt();
            if(a==1) {

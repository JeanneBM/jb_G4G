import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public abstract class AbstractAG implements interfejsAG {
        public abstract String getWelcome();

        public void createWelcome(){


        if (opcja1()) {
        makingopcja1();
    }
}

    public void makingopcja1() {
        System.out.println("We are making opcja1! ");
    }

    //hook
    public boolean opcja1() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else
            return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like opcja1? (y/n)");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (answer == null) {
            answer = "no";
        }

        return answer;
    }
}


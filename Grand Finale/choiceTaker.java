public class choiceTaker {
    Command command;

    public choiceTaker() {
    }

    public void takeChoice(Command c) {
        this.command = c;
        this.command.choiceUp();
    }
}

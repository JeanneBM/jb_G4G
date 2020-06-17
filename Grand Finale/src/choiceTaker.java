public class choiceTaker {
    interfejsCommand command;

    public void takeChoice(interfejsCommand c) {
        this.command = c;
        this.command.choiceUp();
    }
}

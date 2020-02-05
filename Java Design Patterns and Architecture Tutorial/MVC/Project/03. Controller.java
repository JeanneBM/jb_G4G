package mvc;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model=model;
        this.view=view;
    }

    public void setWelcomeHead(String createHead) {
        model.setCreateHead(createHead);
    }

    public String getWelcomeHead() {
        return model.getCreateHead();
    }

    public void setWelcomeBody(String createBody) {
        model.setCreateBody(createBody);
    }

    public String getWelcomeBody() {
        return model.getCreateBody();
    }

    public void setWelcomeFooter(String createFooter) {
        model.setCreateFooter(createFooter);
    }

    public String getWelcomeFooter() {
        return model.getCreateFooter();
    }

    public void execute() {
        view.printWelcomeDetails(model.getCreateHead(), model.getCreateBody(), model.getCreateFooter());
    }

}


package demo;


import mvc.Model;
import mvc.View;
import mvc.Controller;

public class Application {
    public static void main(String[] args) {

        //record
        Model model  = DeutschWelcome();

        //Create a view : to write details on console
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.execute();

        //update model data
        controller.setWelcomeHead("Czesc! ");
        controller.setWelcomeBody("Mam na imie Asia. ");
        controller.setWelcomeFooter("Do zobaczenia!");
        controller.execute();

        controller.setWelcomeHead("Hola! ");
        controller.setWelcomeBody("Mi nombre es Asia. ");
        controller.setWelcomeFooter("Hasta La Vista!");
        controller.execute();
    }

   private static Model DeutschWelcome(){
        Model model = new Model();
        model.setCreateHead("Guten Tag! ");
        model.setCreateBody("Ich heiße Asia. ");
        model.setCreateFooter("Auf Wiedersehen!");
        return model;
    }


}


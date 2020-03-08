public class DeutschWelcome extends Observer{

    public DeutschWelcome(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Deutsch Welcome: " + subject.getState()  );
    }
}

public class PolishWelcome extends Observer{

    public PolishWelcome(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Polish Welcome: " + subject.getState() );
    }
}

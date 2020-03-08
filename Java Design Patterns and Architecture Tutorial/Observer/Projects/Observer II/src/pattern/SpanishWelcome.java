public class SpanishWelcome extends Observer{

    public SpanishWelcome(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Spanish Welcome: " + subject.getState() );
    }
}

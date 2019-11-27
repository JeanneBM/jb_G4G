import MessagingProtocols.CPRI;
import MessagingProtocols.MSG;
import MessagingProtocols.OBSAI;

public class TemplatePatternDemo {
    public static void main (String[] args){
        MSG msg = new OBSAI();
        msg.execute();
        System.out.println();
        msg = new CPRI();
        msg.execute();
    }
}


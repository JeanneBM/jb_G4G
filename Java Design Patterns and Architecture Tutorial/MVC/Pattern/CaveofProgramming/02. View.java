import javax.swing.JFrame;


public class View extends JFrame {
	
	private Model model;

	public View(Model model) {
		super("MVC Demo");
		
		this.model = model;
	}
	
	

}

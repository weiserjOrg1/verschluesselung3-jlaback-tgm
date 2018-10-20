import java.awt.event.ActionEvent;

/*
 * Diese Klasse ist nach dem MVC-Modell der Controller und führt Actions aus
 * 
 * @author Jakob Laback
 * @version 2018-10-20
 */

public class Controller {
	//Attribute
	private Model m1;
	private View v1;
	
	/**
	 * Konstruktor
	 * 
	 */
	
	public Controller() {
		this.m1 = new Model();
		this.v1 = new View(this.m1, this);
	}
	
	public void ActionPerformed(ActionEvent e) {
		if (this.v1.istVerschiebenT(e)) {
			
		}
		
		if (this.v1.istVerschiebenB(e)) {
			
		}

		if (this.v1.istEntschlüsselnT(e)) {
	
		}
		
		if (this.v1.istEntschlüsselnB(e)) {
			
		}
		
		if (this.v1.istVerschlüsselnT(e)) {
			
		}
		
		if (this.v1.istVerschlüsselnB(e)) {
			
		}
	}
}

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


/*
 * Diese Klasse ist nach dem MVC-Modell die View und erstellt das Fenster
 * 
 * @author Jakob Laback
 * @version 2018-10-20
 */

public class View extends JFrame{
	
	//Attriute
	private Model m1;
	private Controller c1;
	private Panel p1;
	private JTextField verschiebenT;
	private JButton verschiebenB;
	private JTextField entschl�sselnT;
	private JButton entschl�sselnB;
	private JTextField verschl�sselnT;
	private JButton verschl�sselnB;
	private JPanel cont;
	
	//Konstruktor
	public View(Model m, Controller c) {
		this.m1 = m;
		this.c1 = c;
		this.setTitle("Verschl�sselung");
		this.setSize(400, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.p1 = new Panel(this.m1);
		
		
		this.verschiebenT = new JTextField("verschieben");
		this.verschiebenB = new JButton("verschieben");
		
		
		this.entschl�sselnT = new JTextField();
		this.entschl�sselnB = new JButton("entschl�sseln");
		
		this.verschl�sselnT = new JTextField();
		this.verschl�sselnB = new JButton("verschl�sseln");
		
		this.entschl�sselnT.addActionListener(this.c1);
		this.entschl�sselnB.addActionListener(this.c1);
		this.verschl�sselnT.addActionListener(this.c1);
		this.verschl�sselnT.addActionListener(this.c1);
		
		this.cont = new JPanel();
		this.cont.setLayout(new GridLayout(2,6));
		this.cont.add(verschiebenT);
		this.cont.add(verschiebenB);
		this.cont.add(entschl�sselnT);
		this.cont.add(entschl�sselnB);
		this.cont.add(verschl�sselnT);
		this.cont.add(verschl�sselnB);
		JPanel b1 = new JPanel();
		b1.setLayout(new BorderLayout());
		b1.add(this.cont, BorderLayout.CENTER);
		
		this.setVisible(true);
		
	}
	
	public boolean istVerschiebenT(ActionEvent e) {
		if (e.getSource() == this.verschiebenT) return true;
		return false;
	}
	
	public boolean istVerschiebenB(ActionEvent e) {
		if (e.getSource() == this.verschiebenT) return true;
		return false;
	}
	
	public boolean istEntschl�sselnT(ActionEvent e) {
		if (e.getSource() == this.entschl�sselnT) return true;
		return false;
	}
	
	public boolean istEntschl�sselnB(ActionEvent e) {
		if (e.getSource() == this.entschl�sselnB) return true;
		return false;
	}
	
	public boolean istVerschl�sselnT(ActionEvent e) {
		if (e.getSource() == this.verschl�sselnT) return true;
		return false;
	}
	
	public boolean istVerschl�sselnB(ActionEvent e) {
		if (e.getSource() == this.verschl�sselnB) return true;
		return false;
	}

}

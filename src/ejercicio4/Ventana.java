package ejercicio4;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("hola");
		setSize (500,500);
		setLocationRelativeTo(null);
		this.cuadro();
		
		
		
	}
	public void cuadro() {
		
	JPanel login=new JPanel();
	login.setSize(100,100);
	login.setLocation(0,0);
	login.setLayout(null);
	login.setBackground(Color.black);
	this.add(login);
	
	JLabel tittle = new JLabel("bienvenido a mi primer ventanita");
	tittle.setBackground(Color.white);
	
	
}
}

package ventanita;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;




public class Ventana extends JFrame implements ActionListener{
	
	
	JMenuBar menubar;
	JMenu menu1;
	
	JMenuItem menuItem,menuItem1, menuItem2, menuItem3;
	
	public Ventana(){
		setVisible(true);
		setTitle("mi primer ventanita");
		setSize (600,750);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		this.menu();
		this.registro();
		
		this.componentes();
		
	}
	
	public void componentes() {
		JPanel login=new JPanel();
		login.setSize(600,600);
		login.setLocation(0,0);
		login.setLayout(null);
		login.setBackground(Color.gray);
		
		JLabel title= new JLabel ("Bienvendio a la ventana");
		title.setBackground(Color.white);
		title.setLocation(10,10);
		title.setSize(130,40);
		title.setOpaque(true);
		login.add(title);
		
		
		JLabel usuario=new JLabel("Usuario", SwingConstants.CENTER);
		
		usuario.setLocation(10,80);
		usuario.setSize(180,50);
		
		login.add(usuario);
		
		JTextField usuarioField=new JTextField();
		usuarioField.setBounds(10, 130, 180, 30);
		login.add(usuarioField);
		add(login);
		
		JLabel contraseña=new JLabel("contraseña",SwingConstants.CENTER);
		
		contraseña.setLocation(10,180);
		contraseña.setSize(180,50);
	;
		login.add(contraseña);
		
		JPasswordField contraseñaField=new JPasswordField();
		contraseñaField.setBounds(10, 220, 180, 30);
		contraseñaField.setOpaque(true);
		login.add(contraseñaField);

		JButton acceder =new JButton("Acceder");
		
		acceder.setBounds(10,270,180,30);
		login.add(acceder);
	}
		public void registro() {

		JPanel registro= new JPanel();
		registro.setSize(600,600);
		registro.setLocation(300,0);
		registro.setLayout(null);
		registro.setBackground(Color.pink);
		add(registro);
	
		JLabel titulo=new JLabel("Registro",SwingConstants.CENTER);
		titulo.setBackground(Color.black);
		titulo.setLocation(10,10);
		titulo.setSize(180,40);
		titulo.setOpaque(true);
		registro.add(titulo);
		
		
		JLabel name =new JLabel("Nombre completo: ", SwingConstants.CENTER);
		name.setFont(new Font("signPainter",Font.BOLD,15));
		name.setLocation(10,80);
		name.setSize(300,30);
		
		registro.add(name);
		
		JTextField nameField=new JTextField();
		nameField.setBounds(10, 130, 250, 30);
		registro.add(nameField);
		
		JLabel casillas =new JLabel("Marque las casillas porfavor",SwingConstants.CENTER);
		casillas.setFont(new Font("signPainter",Font.BOLD,15));
		casillas.setBounds(10, 170, 300, 40);
		registro.add(casillas);
		
		
		
		JCheckBox eleccion=new JCheckBox("gatos"); 
		eleccion.setBounds(10, 220, 300, 35);
		eleccion.setOpaque(false);
		registro.add(eleccion);
		
		JCheckBox eleccion2=new JCheckBox("perros"); 
		eleccion2.setBounds(80, 220, 100, 35);
		eleccion2.setOpaque(false);
		registro.add(eleccion2);
		
		JRadioButton tipo=new JRadioButton("one piece");
		tipo.setBounds(10, 250, 100, 35);
		tipo.setOpaque(false);
		registro.add(tipo);
		
		JRadioButton tipo2=new JRadioButton("naruto");
		tipo2.setBounds(90, 250, 100, 35);
		tipo2.setOpaque(false);
		registro.add(tipo2);
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(tipo);
		grupo.add(tipo2);
	
		ButtonGroup grupo2=new ButtonGroup();
		
		grupo2.add(eleccion);
		grupo2.add(eleccion2);
		
		JLabel bioTag=new JLabel("describete",SwingConstants.CENTER);
		bioTag.setFont(new Font("Weird Comic",Font.BOLD,15));
		bioTag.setBounds(10, 290, 300, 35);
		registro.add(bioTag);
		
		
		
		JTextArea bio=new JTextArea(10,10);
		bio.setBounds(10, 320, 250, 35);
		registro.add(bio);
		
		this.repaint();
		
		JLabel bioTag1 =new JLabel("En donde vives",SwingConstants.CENTER);
		bioTag1.setFont(new Font("Weird Comic",Font.BOLD,15));
		bioTag1.setBounds(10, 360, 300, 35);
		registro.add(bioTag1);
		
		String locacion[]={"paraiso de sol","camino real","calandrio","santa fe"};
		
		JComboBox colonias=new JComboBox(locacion);
		colonias.setBounds(10, 400, 200, 35);
		registro.add(colonias);
		
		JButton registrar=new JButton("GUARDAR");
		registrar.setBounds(10, 460, 200, 35);
		registro.add(registrar);
	
	
	}
		public void menu() {
			 menubar=new JMenuBar();
		        setJMenuBar(menubar);
		
		 menubar = new JMenuBar(); 
	        setJMenuBar(menubar);

	        menu1 = new JMenu("Opción");
	        menubar.add(menu1);

	        menuItem1 = new JMenuItem("Configuración");
	        menuItem1.addActionListener(this);
	        menu1.add(menuItem1);

	        menuItem2 = new JMenuItem("Salir");
	        menuItem2.addActionListener(this);
	        menu1.add(menuItem2);

	        menuItem3 = new JMenuItem("Cerrar sesión");
	        menuItem3.addActionListener(this);
	        menu1.add(menuItem3);
	    }
			public void actionPerformed (ActionEvent e) {
				Container fondo = getContentPane(); 				
				if (e.getSource()==menuItem1) {
					fondo.setBackground(new Color(255,0,0));
				}if (e.getSource()==menuItem2) {
					fondo.setBackground(new Color(0,255,0));
				}if (e.getSource()==menuItem3) {
					fondo.setBackground(new Color(0,0,255));
				}
				
				
		}

		
	}
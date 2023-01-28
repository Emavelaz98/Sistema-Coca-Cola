import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

	private JTextField textfield1;
	private JLabel label1,label2,label3,label4;
	private JButton boton1;
	//public static String texto = "";//Con este codigo pudeo usar la variable texto con otras Intrefaz

	public Bienvenida(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//al cerra el programa no quede en segundo plano y cierre AUTOMATICAMENTE
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());//Para poner imagenes en el icono del programa
		
		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		label1 = new JLabel(imagen);
		label1.setBounds(25,15,300,150);
		add(label1);

		label2 = new JLabel("Sistema de Control Vacacional");
		label2.setBounds(35,135,300,30);
		label2.setFont(new Font("Andale Mono", 3, 18));//Para cambiar fuente de la letra, si queres que la letra se vea nolmal colocas 0, en negrita 1, cursiva 2 o si queres que la letra este en negrita y crusiva vas a colocar 3; el 18 es el tamaño de la letra, igual lo podes cambiar.
		label2.setForeground(new Color(255,255,255));//cambiar colo a la fuente
		add(label2);

		label3 = new JLabel("Ingrese su Nombre");
		label3.setBounds(45,212,200,30);
		label3.setFont(new Font("Andale Mono", 1, 12));
		label3.setForeground(new Color(255,255,255));
		add(label3);

		label4 = new JLabel("©2023 The Coca-Cola Company");//para el simbolo de copyright alt+184
		label4.setBounds(85,375,300,30);
		label4.setFont(new Font("Andale Mono", 1, 12));
		label4.setForeground(new Color(255,255,255));
		add(label4);

		textfield1 = new JTextField();
		textfield1.setBounds(45,240,255,25);
		textfield1.setBackground(new Color(224,224,224));//para cambiar el fondo del textfield
		textfield1.setFont(new Font("Andale Mono", 1, 14));
		textfield1.setForeground(new Color(255,0,0));
		add(textfield1);

		boton1 = new JButton("Ingresar");
		boton1.setBounds(125,280,100,30);
		boton1.setBackground(new Color(255,255,255));
		boton1.setFont(new Font("Andale Mono", 1, 14));
		boton1.setForeground(new Color(255,0,0));
		add(boton1);
		boton1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boton1){
			/*texto = textfield1.getText().trim();//trim()->es para centar el texto que el usuario escribe con espacios, osea, borra los espacios y centra la palabra
			if(texto.equals("")){
				JOptionPane.showMessageDialog(null, "       Campo Incompleto\n"   +
													"Debes Ingresar tu Nombre");
			} else {
				Licencia ventlicencia = new Licencia();
				ventlicencia.setBounds(0,0,600,358);
				ventlicencia.setVisible(true);
				ventlicencia.setLocationRelativeTo(null);
				ventlicencia.setResizable(false);
				this.setVisible(false);//para ocultar la pantalla de Bienvenida(Otras interfacez)
			}*/
		}
	}

	public static void main(String args[]){
		Bienvenida ventbienvenida = new Bienvenida();
		ventbienvenida.setBounds(0,0,350,450);
		ventbienvenida.setVisible(true);
		ventbienvenida.setLocationRelativeTo(null);
		ventbienvenida.setResizable(false);
	}
}
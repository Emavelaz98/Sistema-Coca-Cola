import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

	private JLabel label1, label2;
	private JCheckBox check1;
	private JButton boton1, boton2;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	String nombre = "";
 
	public Licencia(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de Uso");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenida ventanaBienvenida = new Bienvenida(); //Codigo para visitar otra interfaz y agarrar variables para poder usar en esta interfaz
		nombre = ventanaBienvenida.texto;

		label1 = new JLabel("TERMINOS Y CONDICIONES");
		label1.setBounds(210,5,200,30);
		label1.setFont(new Font("Andale Mono", 1, 14));
		label1.setForeground(new Color(0,0,0));
		add(label1);

		textarea1=new JTextArea();
		textarea1.setEditable(false);// Codigo para que el usuario no pueda midificar nada adentro de textArea
		textarea1.setFont(new Font("Andale Mono", 0, 9));
		textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                    "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE");
		scrollpane1=new JScrollPane(textarea1);
		scrollpane1.setBounds(10,40,570,215);
		add(scrollpane1);

		check1=new JCheckBox("Yo " + nombre + " Acepto");
		check1.setBounds(10,250,300,30);
		check1.addChangeListener(this);
		add(check1);

		boton1=new JButton("Continuar");
		boton1.setBounds(10,280,100,30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);

		boton2=new JButton("No Acepto");
		boton2.setBounds(120,280,100,30);
		boton2.addActionListener(this);
		boton2.setEnabled(true);
		add(boton2);

		ImageIcon imagen = new ImageIcon("image/coca-cola.png");
		label2=new JLabel(imagen);
		label2.setBounds(315,135,300,300);
		add(label2);
	}

	public void stateChanged(ChangeEvent e){
		if(check1.isSelected()==true){
			boton1.setEnabled(true);
			boton2.setEnabled(false);
		}else{
			boton1.setEnabled(false);
			boton2.setEnabled(true);
		}
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boton1){
			Principal ventprincipal = new Principal();
			ventprincipal.setBounds(0,0,640,535);
			ventprincipal.setVisible(true);
			ventprincipal.setLocationRelativeTo(null);
			ventprincipal.setResizable(false);
			this.setVisible(false);
		} else if(e.getSource()==boton2){
			Bienvenida ventbienvenida = new Bienvenida();
			ventbienvenida.setBounds(0,0,350,450);
			ventbienvenida.setVisible(true);
			ventbienvenida.setLocationRelativeTo(null);
			ventbienvenida.setResizable(false);
			this.setVisible(false);
		}
	}

	public static void main(String args[]) {
		Licencia ventlicencia = new Licencia();
		ventlicencia.setBounds(0,0,600,358);
		ventlicencia.setVisible(true);
		ventlicencia.setLocationRelativeTo(null);
		ventlicencia.setResizable(false);
	}
}
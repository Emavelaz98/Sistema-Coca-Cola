import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener{
	private JMenuBar mb;
	private JMenu menuOpciones, menuAcercaDe, menuColorFondo;
	private JMenuItem miRojo,miNegro,miMorado,miElCreador,miSalir,miNuevo;
	private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelApellido,
	               labelDepartamento,labelAntiguedad,labelResultado,labelfooter;
	private JTextField txtNombreTrabajador,txtApellidoTrabajador;
	private JComboBox comboDepartamento,comboAntiguedad;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	private JButton boton1;
	String nombreAdministrador = "";

	public Principal(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenida ventbienvenida = new Bienvenida();
		nombreAdministrador = ventbienvenida.texto;

		//Menu
		mb=new JMenuBar();
		mb.setBackground(new Color(255,0,0));
		setJMenuBar(mb);

		//Menu Desplegable
		menuOpciones=new JMenu("Opciones");
		menuOpciones.setBackground(new Color(255,0,0));
		menuOpciones.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.setForeground(new Color(255,255,255));
		mb.add(menuOpciones);


		menuAcercaDe=new JMenu("Acerca De");
		menuAcercaDe.setBackground(new Color(255,0,0));
		menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
		menuAcercaDe.setForeground(new Color(255,255,255));
		mb.add(menuAcercaDe);

		//Sub-Menu-Color
		menuColorFondo=new JMenu("Color de Fondo");
		menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.setForeground(new Color(255,0,0));
		menuOpciones.add(menuColorFondo);

		miRojo=new JMenuItem("Rojo");
		miRojo.setFont(new Font("Andale Mono", 1, 14));
		miRojo.setForeground(new Color(255,0,0));
		menuColorFondo.add(miRojo);
		miRojo.addActionListener(this);

		miNegro=new JMenuItem("Negro");
		miNegro.setFont(new Font("Andale Mono", 1,14));
		miNegro.setForeground(new Color(255,0,0));
		menuColorFondo.add(miNegro);
		miNegro.addActionListener(this);

		miMorado=new JMenuItem("Morado");
		miMorado.setFont(new Font("Andale Mono", 1, 14));
		miMorado.setForeground(new Color(255,0,0));
		menuColorFondo.add(miMorado);
		miMorado.addActionListener(this);

		//Otros Sub-Menu
		miNuevo= new JMenuItem("Nuevo");
		miNuevo.setFont(new Font("Andale Mono", 1, 14));
		miNuevo.setForeground(new Color(255,0,0));
		menuOpciones.add(miNuevo);
		miNuevo.addActionListener(this);


		miSalir=new JMenuItem("Salir");
		miSalir.setFont(new Font("Andale Mono", 1, 14));
		miSalir.setForeground(new Color(255,0,0));
		menuOpciones.add(miSalir);
		miSalir.addActionListener(this);


		miElCreador=new JMenuItem("El Creador");
		miElCreador.setFont(new Font("Andale Mono", 1 , 14));
		miElCreador.setForeground(new Color(255,0,0));
		menuAcercaDe.add(miElCreador);
		miElCreador.addActionListener(this);

		
		//Agregar Contenido a la Interfaz Grafica
		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		labelLogo=new JLabel(imagen);
		labelLogo.setBounds(5,5,250,100);
		add(labelLogo);

		labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador);
		labelBienvenido.setBounds(280,30,300,50);
		labelBienvenido.setFont(new Font("Adale Mono", 1,32));
		labelBienvenido.setForeground(new Color(255,255,255));
		add(labelBienvenido);

		labelTitle = new JLabel("Datos del Trabajador para el Calculo de Vacaciones");
		labelTitle.setBounds(45,140,900,25);
		labelTitle.setFont(new Font("Andale Mono", 0, 24));
		labelTitle.setForeground(new Color(255,255,255));
		add(labelTitle);

		labelNombre = new JLabel("Nombre Completo: ");
		labelNombre.setBounds(25,188,180,25);
		labelNombre.setFont(new Font("Andale Mono", 1, 12));
		labelNombre.setForeground(new Color(255,255,255));
		add(labelNombre);

		txtNombreTrabajador = new JTextField();
		txtNombreTrabajador.setBounds(25,213,150,25);
		txtNombreTrabajador.setBackground(new java.awt.Color(224,224,224));
		txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
		txtNombreTrabajador.setForeground(new java.awt.Color(255,0,0));
		add(txtNombreTrabajador);

		labelApellido = new JLabel("Ingrese Apellido: ");
		labelApellido.setBounds(25,248,180,25);
		labelApellido.setFont(new Font("Andale Mono", 1, 12));
		labelApellido.setForeground(new Color(255,255,255));
		add(labelApellido);

		txtApellidoTrabajador = new JTextField();
		txtApellidoTrabajador.setBounds(25,273,150,25);
		txtApellidoTrabajador.setBackground(new java.awt.Color(224,224,224));
		txtApellidoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
		txtApellidoTrabajador.setForeground(new java.awt.Color(255,0,0));
		add(txtApellidoTrabajador);

		labelDepartamento = new JLabel("Selecciona el Departamento:");
		labelDepartamento.setBounds(220,188,180,25);
		labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
		labelDepartamento.setForeground(new Color(255,255,255));
		add(labelDepartamento);

		comboDepartamento = new JComboBox();
		comboDepartamento.setBounds(220,213,220,25);
		comboDepartamento.setBackground(new java.awt.Color(224,224,224));
		comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
		comboDepartamento.setForeground(new java.awt.Color(255,0,0));
		add(comboDepartamento);
		comboDepartamento.addItem("");
		comboDepartamento.addItem("Atenci??n al Cliente");
		comboDepartamento.addItem("Departamento de Log??stica");
		comboDepartamento.addItem("Departamento de Gerencia");


		labelAntiguedad = new JLabel("Selecciona el Departamento:");
		labelAntiguedad.setBounds(220,248,180,25);
		labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
		labelAntiguedad.setForeground(new Color(255,255,255));
		add(labelAntiguedad);

		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(220,273,220,25);
		comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
		comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
		comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
		add(comboAntiguedad);
		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 a??o de servicio");
		comboAntiguedad.addItem("2 a 6 a??os de servicio");
		comboAntiguedad.addItem("7 a??os o m??s de servicio");


		labelResultado = new JLabel("Resultado de Calculo:");
		labelResultado.setBounds(220,307,180,25);
		labelResultado.setFont(new Font("Andale Mono", 1, 12));
		labelResultado.setForeground(new Color(255,255,255));
		add(labelResultado);

		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setBackground(new Color(224,224,224));
		textarea1.setFont(new Font("Andale Mono", 1, 11));
		textarea1.setForeground(new Color(255,0,0));
		textarea1.setText("\n    Aqui aparece el Resultado del Calculo de las Vacaciones.");
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(220,333,385,90);
		add(scrollpane1);

		labelfooter = new JLabel("??2023 The Coca-Cola Companu | Todos los Derechos Reservados");
		labelfooter.setBounds(135,445,500,30);
		labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
		labelfooter.setForeground(new java.awt.Color(255,255,255));
		add(labelfooter);


		boton1 = new JButton("Calcular");
		boton1.setBounds(35,350,135,45);
		boton1.setBackground(new Color(255,255,255));
		boton1.setFont(new Font("Andale Mono", 1, 17));
		boton1.setForeground(new Color(255,0,0));
		boton1.addActionListener(this);
		add(boton1);
	}

	public void actionPerformed(ActionEvent e){

		if(e.getSource()==boton1){

			String nombreTrabajador = txtNombreTrabajador.getText();
			String apellido = txtApellidoTrabajador.getText();
			String Departamento = comboDepartamento.getSelectedItem().toString();
			String Antiguedad = comboAntiguedad.getSelectedItem().toString();

			if(nombreTrabajador.equals("") || apellido.equals("") || 
				Departamento.equals("") || Antiguedad.equals("")){

				JOptionPane.showMessageDialog(null, "Debes de Llenar todos los Campos");

			} else {
				if(Departamento.equals("Atenci??n al Cliente")){

                	if(Antiguedad.equals("1 a??o de servicio")){
						textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + apellido + 
                        				  "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                          "\n   recibe 6 d??as de vacaciones.");
					}
				
					if(Antiguedad.equals("2 a 6 a??os de servicio")){
						textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + apellido + 
                        				  "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                          "\n   recibe 14 d??as de vacaciones.");
					}
				
					if(Antiguedad.equals("7 a??os o m??s de servicio")){
						textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + apellido + 
                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                          "\n   recibe 20 d??as de vacaciones.");
					}
                     
                }
	        
	        if(Departamento.equals("Departamento de Log??stica")){

					if(Antiguedad.equals("1 a??o de servicio")){
						textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + apellido +
                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                          "\n   recibe 7 d??as de vacaciones.");
					}
				
					if(Antiguedad.equals("2 a 6 a??os de servicio")){
						textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + apellido + 
                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                          "\n   recibe 15 d??as de vacaciones.");
					}
				
					if(Antiguedad.equals("7 a??os o m??s de servicio")){
						textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + apellido + 
                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                          "\n   recibe 22 d??as de vacaciones.");
					}
	    	}
	    	
	    	if(Departamento.equals("Departamento de Gerencia")){

					if(Antiguedad.equals("1 a??o de servicio")){
						textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + apellido + 
                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                          "\n   recibe 10 d??as de vacaciones.");
					}
				
					if(Antiguedad.equals("2 a 6 a??os de servicio")){
						textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + apellido + 
                                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                                          "\n   recibe 20 d??as de vacaciones.");
					}
				
					if(Antiguedad.equals("7 a??os o m??s de servicio")){
						textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + apellido + 
                                          "\n   quien labora en " + Departamento + " con " + Antiguedad + 
                                          "\n   recibe 30 d??as de vacaciones.");
					}
	    		}
			}

		}
		if(e.getSource()==miRojo){
			getContentPane().setBackground(new Color(255,0,0));
		}
		if(e.getSource()==miNegro){
			getContentPane().setBackground(new Color(0,0,0));
		}
		if(e.getSource()==miMorado){
			getContentPane().setBackground(new Color(51,0,51));	
		}
		if(e.getSource()==miNuevo){
			txtNombreTrabajador.setText("");
			txtApellidoTrabajador.setText("");
			comboDepartamento.setSelectedIndex(0);
			comboAntiguedad.setSelectedIndex(0);
			textarea1.setText("\n   Aqu?? aparece el resultado del c??lculo de las vacaciones.");
		}
		if(e.getSource()==miSalir){
			Bienvenida ventbienvenida = new Bienvenida();
			ventbienvenida.setBounds(0,0,350,450);
			ventbienvenida.setVisible(true);
			ventbienvenida.setLocationRelativeTo(null);
			ventbienvenida.setResizable(false);
			this.setVisible(false);
		}
		if(e.getSource()==miElCreador){
			JOptionPane.showMessageDialog(null, "  Este Software Fue creador por " + 
												"\nLic.Emanuel Alejandro Velazquez " + 
												"\n       @HolaMundoReview");
		}
	}


	public static void main(String args[]){
		Principal ventprincipal = new Principal();
		ventprincipal.setBounds(0,0,640,535);
		ventprincipal.setVisible(true);
		ventprincipal.setLocationRelativeTo(null);
		ventprincipal.setResizable(false);
	}
}
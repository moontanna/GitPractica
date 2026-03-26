import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui_practica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldEscribe;
	MANEJA_PALABRAS traductor = new MANEJA_PALABRAS();
	private JLabel lbl_ingles;
	private JLabel lbl_imagen;

	//bts
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui_practica frame = new Gui_practica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui_practica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Traductor");
		lblTitulo.setForeground(new Color(0, 64, 128));
		lblTitulo.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblTitulo.setBounds(154, 10, 144, 26);
		contentPane.add(lblTitulo);
		
		JLabel lblEspañol = new JLabel("Español");
		lblEspañol.setBackground(new Color(0, 64, 128));
		lblEspañol.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblEspañol.setBounds(61, 78, 92, 12);
		contentPane.add(lblEspañol);
		
		JLabel lblPalabratraducida = new JLabel(".");
		lblPalabratraducida.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblPalabratraducida.setBounds(61, 118, 92, 12);
		contentPane.add(lblPalabratraducida);
		
		textFieldEscribe = new JTextField();
		textFieldEscribe.setBounds(132, 76, 96, 18);
		contentPane.add(textFieldEscribe);
		textFieldEscribe.setColumns(10);
		
		JButton btnTraducir = new JButton("Traducir");
		btnTraducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String palabra = textFieldEscribe.getText();
		        String resultado = traductor.traducir(palabra);
		        lblPalabratraducida.setText(resultado);
				
			}
		});
		btnTraducir.setBackground(new Color(221, 192, 222));
		btnTraducir.setBounds(265, 115, 144, 20);
		contentPane.add(btnTraducir);
		JLabel lblNewLabel = new JLabel(".");
		lblNewLabel.setBounds(61, 140, 135, 113);
		contentPane.add(lblNewLabel);
		
		JButton btnponerImagen = new JButton("Imagen relacionada");
		btnponerImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palabra = textFieldEscribe.getText().toLowerCase();
				
				if (palabra.equals("perro")) {
					lblNewLabel.setIcon(new ImageIcon("src/imagenes/PERRO80.jpg"));
		        } 
		        else if (palabra.equals("gato")) {
		        	lblNewLabel.setIcon(new ImageIcon("src/imagenes/GATO80.jpg"));
		        } 
		        else if (palabra.equals("elefante")) {
		        	lblNewLabel.setIcon(new ImageIcon("src/imagenes/ELEFANTE80.jpg"));
		        } 
		        else {
		        	lblNewLabel.setText("IMAGEN NO ENCONTRADA");
		        }
			}
		});
			
				
				
				
			
		btnponerImagen.setBackground(new Color(221, 192, 222));
		btnponerImagen.setBounds(265, 172, 144, 20);
		contentPane.add(btnponerImagen);
		
		

	}
}

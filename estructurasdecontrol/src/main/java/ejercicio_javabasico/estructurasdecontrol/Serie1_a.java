package ejercicio_javabasico.estructurasdecontrol;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Serie1_a extends JApplet implements ActionListener {
	// Declaración de variables globales
	// CRTL + shift + O
	JButton btnProcesar, btnBorrar;
	JTextArea txtS;
	JLabel lblNumero;
	JTextField txtNumero;
	JScrollPane scpScroll;

	// -----------------------------------------------------------------------
	// Crea la interfaz gráfica de usuario GUI
	public void init() {
		getContentPane().setLayout(null);
		txtNumero = new JTextField();
		txtNumero.setBounds(76, 15, 92, 23);
		getContentPane().add(txtNumero);
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(308, 15, 101, 23);
		btnBorrar.addActionListener(this);
		getContentPane().add(btnBorrar);
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(205, 15, 101, 23);
		btnProcesar.addActionListener(this);
		getContentPane().add(btnProcesar);
		lblNumero = new JLabel("Número");
		lblNumero.setBounds(15, 15, 56, 23);
		getContentPane().add(lblNumero);
		txtS = new JTextArea();
		txtS.setFont(new Font("monospaced", 0, 12));
		scpScroll = new JScrollPane(txtS);
		scpScroll.setBounds(15, 53, 394, 143);
		getContentPane().add(scpScroll);
	}

	// -----------------------------------------------------------------------
	// Procesa eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar)
			procesar();
		if (e.getSource() == btnBorrar)
			borrar();

	}

	// -----------------------------------------------------------------------
	// Método del botón Borrar
	void borrar() {
		txtNumero.setText("");
		txtS.setText("");
		txtNumero.requestFocus();
	}

	// -----------------------------------------------------------------------
	// Método del botón Procesar
	void procesar() {
		// Declaración e inicialización de variables locales
		int n, termino = 1;
		// Lee el número n
		n = Integer.parseInt(txtNumero.getText());
		// Borra la pantalla
		txtS.setText("");
		// Bucle while
		/*while (termino <= n) {
			// Imprime el término actual
			txtS.append(termino + "\n");
			// Genera el siguiente término
			termino++;
		}*/

		do {
			// Imprime el término actual
			txtS.append(termino + "\n");
			// Genera el siguiente término
			termino++;
		} while (termino <= n);
	}
}

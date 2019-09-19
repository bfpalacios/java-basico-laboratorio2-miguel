package pe.gob.cenepred.estructura;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Serie1_a extends JApplet implements ActionListener {

	// Declaraci�n de variables globales
	JButton btnProcesar, btnBorrar;
	JTextArea txtS;
	JLabel lblNumero;
	JTextField txtNumero;
	JScrollPane scpScroll;

	// -----------------------------------------------------------------------
	// Crea la interfaz gr�fica de usuario GUI
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
		lblNumero = new JLabel("N�mero");
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
	// M�todo del bot�n Borrar
	void borrar() {
		txtNumero.setText("");
		txtS.setText("");
		txtNumero.requestFocus();
	}

	// -----------------------------------------------------------------------
	// M�todo del bot�n Procesar
	void procesar() {
		// Declaraci�n e inicializaci�n de variables locales
		int n, termino = 1;
		// Lee el n�mero n
		n = Integer.parseInt(txtNumero.getText());
		// Borra la pantalla
		txtS.setText("");
		// Bucle while
		while (termino <= n) {
			// Imprime el t�rmino actual
			txtS.append(termino + "\n");
			// Genera el siguiente t�rmino
			termino++;
		}
	}

}

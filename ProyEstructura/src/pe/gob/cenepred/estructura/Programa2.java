package pe.gob.cenepred.estructura;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Programa2 extends JApplet implements ActionListener {
	// Declaración de variables
	JButton btnProcesar, btnBorrar;
	JTextArea txtS;
	JLabel lblUnidades;
	JTextField txtUnidades;
	JScrollPane scpScroll;

	// Crea la interfaz gráfica de usuario
	public void init() {
		getContentPane().setLayout(null);
		lblUnidades = new JLabel("Unidades");
		lblUnidades.setBounds(15, 15, 90, 23);
		getContentPane().add(lblUnidades);
		txtUnidades = new JTextField();
		txtUnidades.setBounds(105, 15, 100, 23);
		getContentPane().add(txtUnidades);
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(365, 15, 100, 23);
		btnProcesar.addActionListener(this);
		getContentPane().add(btnProcesar);
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(265, 15, 100, 23);
		btnBorrar.addActionListener(this);
		getContentPane().add(btnBorrar);
		txtS = new JTextArea();
		txtS.setFont(new Font("monospaced", 0, 12));
		scpScroll = new JScrollPane(txtS);
		scpScroll.setBounds(15, 53, 450, 100);
		getContentPane().add(scpScroll);
	}

	// Procesa eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent e) {
		// Si se hizo clic en Procesar
		if (e.getSource() == btnProcesar) {
			// Declaración de variables
			int unidades;
			double impcom = 0, impdes = 0, imppag;
			// Entrada de datos
			unidades = Integer.parseInt(txtUnidades.getText());
			// Cálculo del importe de la compra
			if (unidades >= 1 && unidades <= 25)
				impcom = unidades * 27.5;
			if (unidades >= 26 && unidades <= 50)
				impcom = unidades * 25.5;
			if (unidades >= 51 && unidades <= 75)
				impcom = unidades * 27.5;
			if (unidades >= 76)
				impcom = unidades * 27.5;
			// Cálculo del importe del descuento
			if (unidades > 50)
				impdes = 0.15 * impcom;
			if (unidades <= 50)
				impdes = 0.05 * impcom;
			// Calcula el importe a pagar
			imppag = impcom - impdes;
			// Salida de resultados
			txtS.setText("Importe de la compra : " + impcom + "\n");
			txtS.append("Importe del descuento : " + impdes + "\n");
			txtS.append("Importe a pagar : " + imppag);
		}
		// Si se hizo clic en Borrar
		if (e.getSource() == btnBorrar) {
			txtUnidades.setText("");
			txtS.setText("");
			txtUnidades.requestFocus();
		}
	}

}

package pe.gob.cenepred.estructura;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Programa3 extends JApplet implements ActionListener {
	// Declaración de variables
	JButton btnBorrar, btnProcesar;
	JLabel lblGrados, lblMinutos, lblSegundos;
	JTextField txtGrados, txtMinutos, txtSegundos;
	JTextArea txtS;
	JScrollPane scpScroll;

	// Crea la interfaz gráfica de usuario GUI
	public void init() {
		getContentPane().setLayout(null);
		lblGrados = new JLabel("Grados");
		lblGrados.setBounds(15, 15, 90, 23);
		getContentPane().add(lblGrados);
		lblMinutos = new JLabel("Minutos");
		lblMinutos.setBounds(15, 39, 90, 23);
		getContentPane().add(lblMinutos);
		lblSegundos = new JLabel("Segundos");
		lblSegundos.setBounds(15, 63, 90, 23);
		getContentPane().add(lblSegundos);
		txtGrados = new JTextField();
		txtGrados.setBounds(105, 15, 127, 23);
		getContentPane().add(txtGrados);
		txtMinutos = new JTextField();
		txtMinutos.setBounds(105, 39, 127, 23);
		getContentPane().add(txtMinutos);
		txtSegundos = new JTextField();
		txtSegundos.setBounds(105, 63, 127, 23);
		getContentPane().add(txtSegundos);
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(365, 15, 101, 23);
		btnProcesar.addActionListener(this);
		getContentPane().add(btnProcesar);
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(365, 39, 101, 23);
		btnBorrar.addActionListener(this);
		getContentPane().add(btnBorrar);
		txtS = new JTextArea();
		txtS.setFont(new Font("monospaced", Font.PLAIN, 12));
		scpScroll = new JScrollPane(txtS);
		scpScroll.setBounds(15, 102, 450, 100);
		getContentPane().add(scpScroll);
	}

	// Procesa eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent e) {
		// Si se hizo clic en Procesar
		if (e.getSource() == btnProcesar) {
			// Declaración de variables
			int grados, minutos, segundos;
			double beta;
			String tipo = "";
			// Entrada de datos
			grados = Integer.parseInt(txtGrados.getText());
			minutos = Integer.parseInt(txtMinutos.getText());
			segundos = Integer.parseInt(txtSegundos.getText());
			// Determina el ángulo en grados
			beta = grados + minutos / 60.0 + segundos / 3600.0;
			// Determina el tipo de ángulo
			if (beta == 0)
				tipo = "Nulo";
			if (beta > 0 && beta < 90)
				tipo = "Agudo";
			if (beta == 90)
				tipo = "Recto";

			if (beta > 90 && beta < 180)
				tipo = "Obtuso";
			if (beta == 180)
				tipo = "Llano";
			if (beta > 180 && beta < 360)
				tipo = "Cóncavo";
			if (beta == 360)
				tipo = "Completo";
			// Salida de resultados
			txtS.setText("El ángulo se clasifica como : " + tipo);
		}
		
		// Si se hizo clic en Borrar
		if (e.getSource() == btnBorrar) {
			txtGrados.setText("");
			txtMinutos.setText("");
			txtSegundos.setText("");
			txtS.setText("");
			txtGrados.requestFocus();
		}
	}

}

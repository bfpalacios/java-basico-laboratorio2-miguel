package pe.gob.cenepred.estructura;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Tabla_a extends JApplet implements ActionListener {
	// Declaración de variables globales
	JButton btnProcesar;
	JTextArea txtS;
	JScrollPane scpScroll;

	// -----------------------------------------------------------------------
	// Crea la interfaz gráfica de usuario GUI
	public void init() {
		getContentPane().setLayout(null);
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(162, 15, 101, 23);
		btnProcesar.addActionListener(this);
		getContentPane().add(btnProcesar);
		txtS = new JTextArea();
		txtS.setFont(new java.awt.Font("monospaced", 0, 12));
		scpScroll = new JScrollPane(txtS);
		scpScroll.setBounds(15, 53, 394, 143);
		getContentPane().add(scpScroll);
	}

	// -----------------------------------------------------------------------
	// Procesa eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar)
			procesar();
	}

	// -----------------------------------------------------------------------
	// Método del botón Procesar
	void procesar() {
		// Declaración e inicialización de variables
		double x = 0, y;
		// Imprime la cabecera
		txtS.append(String.format(Locale.US, "%-15.2s%-15.2s\n", "x", "y"));
		// Imprime la tabla
		while (x <= 10) {
			// Calcula el valor de y para el valor actual de x
			y = (x * x * x + 3 * x + 1) / (x * x + 2);
			// Imprime la pareja de valores x e y
			txtS.append(String.format(Locale.US, "%-15.2f%-15.2f\n", x, y));
			// Incrementa x en 0.25
			x += 0.25;
		}
	}

}

package pe.gob.cenepred.estructura;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Programa1 extends JApplet implements ActionListener {
	JButton btnProcesar;
	JTextArea txtS;
	JLabel lblHoras;
	JLabel lblTarifa;
	JTextField txtHoras;
	JTextField txtTarifa;
	JScrollPane scpScroll;

	// Crea la interfaz gráfica de usuario GUI
	public void init() {
		getContentPane().setLayout(null);
		lblHoras = new JLabel("Horas");
		lblHoras.setBounds(15, 15, 42, 23);
		getContentPane().add(lblHoras);
		lblTarifa = new JLabel("Tarifa");
		lblTarifa.setBounds(15, 39, 42, 23);
		getContentPane().add(lblTarifa);
		txtHoras = new JTextField();
		txtHoras.setBounds(61, 15, 107, 23);
		getContentPane().add(txtHoras);
		txtTarifa = new JTextField();
		txtTarifa.setBounds(61, 39, 107, 23);
		getContentPane().add(txtTarifa);
		btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(305, 15, 101, 23);
		btnProcesar.addActionListener(this);
		getContentPane().add(btnProcesar);
		txtS = new JTextArea();
		txtS.setFont(new Font("monospaced", 0, 12));
		scpScroll = new JScrollPane(txtS);
		scpScroll.setBounds(15, 75, 394, 130);
		getContentPane().add(scpScroll);
	}

	// Procesa eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent e) {
		// Declaración de variables
		double horasTrab, tarifaHor;
		double sueldoBas, montoBoni, sueldoBru, montoDesc, sueldoNet;
		// Entrada de datos
		horasTrab = Double.parseDouble(txtHoras.getText());
		tarifaHor = Double.parseDouble(txtTarifa.getText());
		// Cálculo de montos
		sueldoBas = horasTrab * tarifaHor;
		montoBoni = 0.20 * sueldoBas;
		sueldoBru = sueldoBas + montoBoni;
		montoDesc = 0.10 * sueldoBru;
		sueldoNet = sueldoBru - montoDesc;
		// Salida de resultados
		txtS.setText("Sueldo básico : S/. " + sueldoBas + "\n");
		txtS.append("Bonificación : S/. " + montoBoni + "\n");
		txtS.append("Sueldo bruto : S/. " + sueldoBru + "\n");
		txtS.append("Descuentos : S/. " + montoDesc + "\n");
		txtS.append("Sueldo neto : S/. " + sueldoNet);
	}
}

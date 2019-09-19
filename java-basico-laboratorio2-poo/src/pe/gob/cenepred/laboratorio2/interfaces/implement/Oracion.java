package pe.gob.cenepred.laboratorio2.interfaces.implement;

import pe.gob.cenepred.laboratorio2.interfaces.Capitalizable;

public class Oracion implements Capitalizable {

	String texto;

	Oracion(String n) {
		texto = n;
	}

	public String agregaPalabra(String t) {
		texto = texto.concat(" " + t);
		return texto;
	}

	// metodos de Interfase
	public String cambiaMayuscula() {
		return texto.toUpperCase();
	}

	public String cambiaMinuscula() {
		return texto.toLowerCase();
	}

}

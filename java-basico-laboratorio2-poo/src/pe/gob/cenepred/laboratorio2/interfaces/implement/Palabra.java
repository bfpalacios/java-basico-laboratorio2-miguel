package pe.gob.cenepred.laboratorio2.interfaces.implement;

import pe.gob.cenepred.laboratorio2.interfaces.Capitalizable;

public class Palabra implements Capitalizable{
	String texto;

	Palabra(String n) {
		texto = n.replaceAll(" ", "");
	}

	// metodos de Interfase
	public String cambiaMayuscula() {
		return texto.toUpperCase();
	}

	public String cambiaMinuscula() {
		return texto.toLowerCase();
	}
}

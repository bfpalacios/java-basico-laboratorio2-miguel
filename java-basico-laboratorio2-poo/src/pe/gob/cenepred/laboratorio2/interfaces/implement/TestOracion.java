package pe.gob.cenepred.laboratorio2.interfaces.implement;

import pe.gob.cenepred.laboratorio2.interfaces.Capitalizable;

public class TestOracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vas a instanciar una clase que implementa una interfase
		Capitalizable[] obj1 = new Capitalizable[4];
		
		obj1[0] = new Palabra("Programacion en Java");
		obj1[1] = new Palabra("Ceups");
		obj1[2] = new Oracion("Curso Java Basico - Ceups");
		obj1[3] = new Oracion("Curso Java Me gusta programar");
		for (int i = 0; i < obj1.length; i++) {
			System.out.println("Texto " + i + ": " + obj1[i].cambiaMayuscula());
		}
	}

}

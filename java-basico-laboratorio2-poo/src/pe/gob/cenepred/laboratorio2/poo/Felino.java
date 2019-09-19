package pe.gob.cenepred.laboratorio2.poo;

public class Felino extends Animal{

	//definir unconstructor personaliszadpo
	public Felino(String figura, String comida, boolean hambre, int limites, String ubicacion) {
		super(figura, comida, hambre, limites, ubicacion);
		// TODO Auto-generated constructor stub
	}
	
	public void caminar () {
		System.out.println("Caminando con felino");
	}
	
	
}

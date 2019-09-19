package pe.gob.cenepred.laboratorio2.poo;

public class Hipopotamo extends Animal{

	public Hipopotamo(String figura, String comida, boolean hambre, int limites, String ubicacion) {
		super(figura, comida, hambre, limites, ubicacion);
		// TODO Auto-generated constructor stub
	}
	
	//@Override
	public void hacerRuido() {
		// TODO Auto-generated method stub
		//super.hacerRuido();
		System.out.println("hacer ruido hipopotamo");
	}
	
	//@Override
	public void comer() {
		// TODO Auto-generated method stub
		//super.comer();
		System.out.println("come hipopotamos ahora");
	}
	
}

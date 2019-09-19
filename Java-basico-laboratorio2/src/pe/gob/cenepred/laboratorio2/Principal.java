package pe.gob.cenepred.laboratorio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instancia rlas clases
		BicicletaCarrera bikerRacer = new BicicletaCarrera();
		
		//accediento al metodo de la clase padre Bicicleta
		bikerRacer.frenar();
		
		bikerRacer.cambiarVelocidad(10);

	}

}

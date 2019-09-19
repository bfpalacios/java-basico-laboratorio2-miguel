package pe.gob.cenepred.laboratorio2;

public class Bicicleta {

	//declaracion de variables de clases
	int velocidadActual;
	int velocidadMaxima;
	int engranajeActual;
	String nroAro;
	String marca;
	String modelo;
	
	//Declaracion de metodos de instancia o clase
	//void es una declaracion pero no devuelve mensajes
	void cambiarLlantas(){
		System.out.println("Cambiando llantas");
	}
	void frenar() {
		System.out.println("Frenando");
	}
	void cambiarVelocidad(int engranajeActual){
		
		System.out.println("Cambiando velocidad inicial " + this.engranajeActual);
		this.engranajeActual = engranajeActual;
		System.out.println("Cambiando velocidad a " + engranajeActual);
		
	}	

}

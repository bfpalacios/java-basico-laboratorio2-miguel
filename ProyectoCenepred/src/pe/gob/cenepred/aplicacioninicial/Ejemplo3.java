package pe.gob.cenepred.aplicacioninicial;

public class Ejemplo3 {

	public double alturadPersona;
	public float alturaPersonaCentimetros;
	public byte DNI, Edad;
	public char Sexo;
	public String CanalesAtencion;
	
	
	private int aNumero;
	private int bNumero;
	
	public int obtenerSuma(int aNumero1, int bNumero){
		this.aNumero = aNumero1;
		this.bNumero = bNumero;
		
		return this.aNumero + this.bNumero;
	}
	
	//este es un comentario
	public static void main(String[] args) {
		//INSTANCIANDO EL METODO CREADO DE LA CLASE ejemplo3
		//ej es un on¿bjeto de tipo Ejemplo3
		Ejemplo3 ej = new Ejemplo3();
		
		// TODO Auto-generated method stub
		System.out.println("el resultado x "+ej.obtenerSuma(30, 20));

	}	
	
}

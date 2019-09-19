package pe.gob.cenepred.laboratorio2;

public class Persona {
	
	//delcaracion de la svariables
	public String nombre;
	public String apellidos;
	public byte edad;

	public Persona(String n, String a, byte e) {
		this.nombre = n;
		this.apellidos = a;
		this.edad = e;
	}

	//Declracion de metodos de instacia
	public String ObtenerNombre() {
		return nombre;
	}
	
	public String ObtenerApellidos() {
		return apellidos;
	}
	public byte ObtenerEdad() {
		return edad;
	}
}

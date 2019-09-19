package pe.gob.cenepred.laboratorio2;

public class TestPersona {

	public static void main(String args[]) {
		byte edad = 60;
		Persona p = new Persona("James", "Gosling", edad);
		System.out.println("Accediendo a sus atributos:");
		System.out.println("Nombre: " + p.nombre);
		System.out.println("Apellido: " + p.apellidos);
		System.out.println("Edad: " + p.edad);

		System.out.println("ObtenerNombre: " + p.ObtenerNombre());
	}

}

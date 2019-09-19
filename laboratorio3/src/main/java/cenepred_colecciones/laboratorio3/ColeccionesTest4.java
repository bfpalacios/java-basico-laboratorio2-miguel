package cenepred_colecciones.laboratorio3;

import java.util.Collection;
import java.util.HashMap;

public class ColeccionesTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instacia de onjetos
		Estudiante eEstudiante1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
		Estudiante eEstudiante2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
		Estudiante eEstudiante3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);

		// HashMap
		HashMap<Integer, Estudiante> mapa = new HashMap<Integer, Estudiante>();
		mapa.put(100525, eEstudiante1);
		mapa.put(100526, eEstudiante2);
		mapa.put(100527, eEstudiante3);

		Estudiante e = mapa.get(100526);
		System.out.println(e.getNombres());

		Collection<Estudiante> co = mapa.values();
		for (Estudiante es : co) {
			System.out.println(es.getNombres());
		}

	}

}

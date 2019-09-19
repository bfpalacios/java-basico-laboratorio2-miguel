package cenepred_colecciones.laboratorio3;

import java.util.HashSet;

public class ColeccionesTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instacia de onjetos
		Estudiante eEstudiante1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante eEstudiante2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante eEstudiante3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);


        // HashSet
        HashSet<Estudiante> set = new HashSet<Estudiante>();
        set.add(eEstudiante1);
        set.add(eEstudiante2);
        set.add(eEstudiante3);
        set.add(eEstudiante1);
        
        for (Estudiante e : set) {
		System.out.println(e.getNombres() + " " + e.getApellidos());

        }
	}
}

package cenepred_colecciones.laboratorio3;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instacia de onjetos
		Estudiante eEstudiante1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante eEstudiante2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante eEstudiante3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // ArrayList
    	ArrayList<Estudiante> collecionEstudiante = new ArrayList<Estudiante>();
    	collecionEstudiante.add(eEstudiante1);
    	collecionEstudiante.add(eEstudiante2);
    	collecionEstudiante.add(eEstudiante3);
        
        Collections.sort(collecionEstudiante);
        
        //metodo foreach
        for (Estudiante e : collecionEstudiante) {
        	System.out.println(e.getNombres() + " " + e.getApellidos());
    	
        }
	}

}

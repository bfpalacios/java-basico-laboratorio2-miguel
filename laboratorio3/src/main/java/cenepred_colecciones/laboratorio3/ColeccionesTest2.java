package cenepred_colecciones.laboratorio3;

import java.util.LinkedList;
import java.util.ListIterator;

public class ColeccionesTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instacia de onjetos
		Estudiante eEstudiante1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante eEstudiante2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante eEstudiante3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
    	
        // LinkedList
        LinkedList<Estudiante> pila = new LinkedList<Estudiante>();
        pila.addFirst(eEstudiante1);
        pila.addFirst(eEstudiante2);
        pila.addFirst(eEstudiante3);
        
        //clase de tipo de iterador
        ListIterator<Estudiante> ite = pila.listIterator();
        while(ite.hasNext()){
            Estudiante e = (Estudiante) pila.poll();
            System.out.println(e.getNombres());
        }
        System.out.println(pila.size());
	}

}

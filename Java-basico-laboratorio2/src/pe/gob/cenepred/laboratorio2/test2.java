package pe.gob.cenepred.laboratorio2;

public class test2 {

	public static void main(String args[]){
		 OperacionesAritmeticas operacionesAritmeticas = new OperacionesAritmeticas();
		 operacionesAritmeticas.suma(13.3, 15.2);
		 operacionesAritmeticas.resta(28.3, 20);
		
		 double res = operacionesAritmeticas.suma(13.3, 15.2);
		 System.out.println(res);
		 System.out.println("Resultado " + operacionesAritmeticas.suma(13.3, 15.2));
		
		 System.out.println("sum entero " + operacionesAritmeticas.max(12, 16));
		 System.out.println("sum float " + operacionesAritmeticas.max(12.4f, 15.9f));
	}

}

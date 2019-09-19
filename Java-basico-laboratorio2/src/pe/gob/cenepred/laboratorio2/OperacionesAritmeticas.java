package pe.gob.cenepred.laboratorio2;

public class OperacionesAritmeticas {
	
	//constructor sin parametros
	public OperacionesAritmeticas() {
		
	}

	public double suma(double a, double b) {
		double resultado = a + b;
		return resultado;
	}

	public double resta(double a, double b) {
		double resultado = a - b;
		return resultado;
	}

	public int max(int a, int b) {
		int mayor = a;
		if (a > b) {
			mayor = a;
		} else if (a == b) {
			mayor = 0; // por ser iguales
		} else {
			mayor = b;
		}
		return mayor;
	}

	public float max(float a, float b) {
		float mayor = a;
		if (a > b) {
			mayor = a;
		} else if (a == b) {
			mayor = 0; // por ser iguales
		} else {
			mayor = b;
		}

		return mayor;
	}

}

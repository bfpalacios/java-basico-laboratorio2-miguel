package pe.gob.cenepred.labpratorio.abstracta;

public abstract class Figura {
	//definir las variables de instancias
	private int x, y;

	//definir un constructor personalizado
	public Figura(int nx, int ny) {
		this.x = nx;
		this.y = ny;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public abstract double getArea();
	/*
	 * cada figura debería tener un método getArea() para obtener el area de la
	 * figura
	 */
}

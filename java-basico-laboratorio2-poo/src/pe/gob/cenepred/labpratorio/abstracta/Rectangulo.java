package pe.gob.cenepred.labpratorio.abstracta;

public class Rectangulo extends Figura{
	private int w, h;

	public Rectangulo(int x, int y, int w, int h) {
		//con super se instancia el padre
		super(x, y);
		this.w = w;
		this.h = h;
	}

	// implementando el método abstracto
	public double getArea() {
		return w * h;
	}
}

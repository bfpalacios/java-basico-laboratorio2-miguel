package pe.gob.cenepred.laboratorio2;

public class Debug {

	private boolean debuggingOn = false;
	public final int LEVEL = 1;

	//debug de tipo construcctor
	public Debug(boolean estado) {
		this.debuggingOn = estado;
	}
	//click derecho source format
	public void print(String msg) {
		if (this.debuggingOn) {
			System.out.print(msg);
		}
	}
	
	public boolean obtenerDebugin() {
		return this.debuggingOn;
		
	}
}

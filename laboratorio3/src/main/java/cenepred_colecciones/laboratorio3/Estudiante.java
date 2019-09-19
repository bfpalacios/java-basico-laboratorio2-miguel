package cenepred_colecciones.laboratorio3;

public class Estudiante implements Comparable<Estudiante> {
	//declaracion de variabkesdn e¿de instNCIAS
	
	private String nombres;
	private String apellidos;
	private String direccion;
	private int codMatricula;
	
	//declarara contructor personalizado
	public Estudiante(String nombres, String apellidos, String direccion, int codMatricula) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.codMatricula = codMatricula;
	}

	//ordena por nombres y apellidos
	public int compareTo(Estudiante oEstudiante) {
		// TODO Auto-generated method stub
		//String apellidos = oEstudiante.getApellidos().toLowerCase();
		//String apellidosLocal = this.getApellidos().toLowerCase(); 	
		
		//return apellidosLocal.compareTo(apellidos);
		
		String nombre = oEstudiante.getNombres().toLowerCase();
		String nombresLocal = this.getNombres().toLowerCase(); 	
		
		return nombresLocal.compareTo(nombres);		

	}
	
	//metodos get and setters

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodMatricula() {
		return codMatricula;
	}

	public void setCodMatricula(int codMatricula) {
		this.codMatricula = codMatricula;
	}
	
	
	

	
	
	
}

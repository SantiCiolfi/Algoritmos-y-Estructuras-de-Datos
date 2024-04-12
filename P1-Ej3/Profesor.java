
public class Profesor {
	private String nombre;
	private String apellido;
	private String facultad;
	private String email;
	private String catedra;
	
	public Profesor(String nombre, String apellido,String facultad, String email, String catedra) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.facultad=facultad;
		this.catedra=catedra;
		this.email=email;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getFacultad() {
		return facultad;
	}

	public String getEmail() {
		return email;
	}

	public String getCatedra() {
		return catedra;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}
	
	public String tusDatos(){
		return "nombre: " + this.getNombre() + ", apellido: " + this.getApellido() + ", facultad:" + this.getFacultad() + ", email: " + this.getEmail() + ", catedra: " + this.getCatedra();
	}
}

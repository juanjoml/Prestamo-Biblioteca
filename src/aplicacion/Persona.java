package aplicacion;

public class Persona {
	
	private String dni;
	
	private String nombrePersona;
	
	private String apellido1;
	
	private String apellido2;
	
	public Persona (String dni, String nombrePersona, String apellido1, String apellido2)
	{
		this.dni = dni;
		
		this.nombrePersona = nombrePersona;
		
		this.apellido1 = apellido1;
		
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombrePersona=" + nombrePersona + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + "]";
	}	
}
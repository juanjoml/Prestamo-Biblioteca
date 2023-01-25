package aplicacion;

public class Prestamo {
	
	private Material materialPrestado;
	
	private Persona personaPrestada;
	
	public  Prestamo (Material materialPrestado, Persona personaPrestada)
	{
		this.materialPrestado = materialPrestado;
		
		this.personaPrestada = personaPrestada; 
	}

	public Material getMaterialPrestado() {
		return materialPrestado;
	}

	public void setMaterialPrestado(Material materialPrestado) {
		this.materialPrestado = materialPrestado;
	}

	public Persona getPersonaPrestada() {
		return personaPrestada;
	}

	public void setPersonaPrestada(Persona personaPrestada) {
		this.personaPrestada = personaPrestada;
	}

	@Override
	public String toString() {
		return "Prestamo [materialPrestado=" + materialPrestado + ", personaPrestada=" + personaPrestada + "]\n";
	}
}


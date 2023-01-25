package aplicacion;

public class Material {
	
	private String nombre;
	
	private int id;
	
	public Material (String nombre, int id)
	{
		this.nombre = nombre;
		
		this.id = id;
	}
	
	public Material()
	{
		this.nombre = "";
		
		this.id = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Material [nombre=" + nombre + ", id=" + id + "]";
	}

	
	
}
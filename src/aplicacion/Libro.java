package aplicacion;

public class Libro extends Material {
	
	protected String editorial;
	
	protected String genero;
	
	protected String autor;
	
	protected String isbn;
	
	protected int anoPublicacion;
	
	public Libro (String nombre, int id, String editorial, String genero, String autor, String isbn, int anoPublicacion)
	{
		super (nombre, id); 
		
		this.editorial = editorial;
		
		this.genero = genero;
		
		this.autor = autor;
		
		this.isbn = isbn;
		
		this.anoPublicacion = 1950;
	}
	
	public Libro ()
	{
		this.editorial = "";
		
		this.genero = "";
		
		this.autor = "";
		
		this.isbn = "";
		
		this.anoPublicacion = 0;
	}
	
	public Libro (String editorial, String genero, String autor, String isbn, int anoPublicacion)
	{
		this.editorial = editorial;
		
		this.genero = genero;
		
		this.autor = autor;
		
		this.isbn = isbn;
		
		this.anoPublicacion = anoPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + getNombre() + ", id=" + getId() + ", editorial=" + editorial + ", genero=" + genero + ", autor=" + autor + ", isbn=" + isbn
				+ ", anoPublicacion=" + anoPublicacion + "]";
	}	

}


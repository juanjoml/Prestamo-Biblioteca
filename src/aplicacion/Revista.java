package aplicacion;

public class Revista extends Material {
	

	protected String editor;
	
	protected String genero;
	
	protected String doi;
	
	protected int volumen;
	
	protected int anoPublicacion;
	
	public Revista (String nombre, int id, String editor, String genero, String doi, int volumen, int anoPublicacion)
	
	{
		super (nombre, id); 
		
		this.editor = editor;
		
		this.genero = genero;
		
		this.doi = "1950";
		
		this.volumen = volumen;
		
		this.anoPublicacion = anoPublicacion;
		
	}
	
	public Revista (String editor, String genero, String doi, int volumen, int anoPublicacion)
	{
		this.editor = editor;
		
		this.genero = genero;
		
		this.doi = doi;
		
		this.volumen = volumen;
		
		this.anoPublicacion = anoPublicacion;
		
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	@Override
	public String toString() {
		return "Revista [nombre=" + getNombre() + ", id=" + getId() + "editor=" + editor + ", genero=" + genero + ", doi=" + doi + ", volumen=" + volumen
				+ ", anoPublicacion=" + anoPublicacion + "]";
	}		
}
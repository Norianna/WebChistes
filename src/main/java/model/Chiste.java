package model;

public class Chiste {

	private int id;
	private String apodo;
	private String descripcion;
	private String titulo;

	public Chiste() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		return "Chiste [id=" + id + ", apodo=" + apodo + ", descripcion=" + descripcion + ", titulo=" + titulo + "]";
	}

	
}

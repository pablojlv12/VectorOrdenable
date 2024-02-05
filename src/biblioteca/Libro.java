package biblioteca;

public class Libro {

	private String titulo;
	private int ISBN;
	private int fechaPublicacion;
	private double precio;
	private Actor actor;

	public Libro(String titulo, int iSBN, int fechaPublicacion, double precio, Actor actor) {
		this.titulo = titulo;
		this.ISBN = iSBN;
		this.fechaPublicacion = fechaPublicacion;
		this.precio = precio;
		this.actor = actor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(int fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "[título=" + titulo + ", ISBN=" + ISBN + ", fecha de publicacion=" + fechaPublicacion
				+ ", precio=" + precio + ", actor(" + actor + ")]";
	}

}

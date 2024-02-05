package biblioteca;

public class Actor {

	private String nombre;
	private int fechaNacimiento;

	public Actor(String nombre, int fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento ;
	}

	

}

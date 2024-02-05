package biblioteca;

public class Start {

	public static void main(String[] args) {

		Actor actor = new Actor("Pepe",1999);
		Libro libro = new Libro("mi libro", 1234, 2013, 19.99, actor);

		
		System.out.println(libro);
	}
}

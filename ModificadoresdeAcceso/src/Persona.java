
public class Persona {
	
	//constructor
	public Persona() {
		System.out.println("Se creó un objeto de tipo Persona");
		// acá si puedo modificar el nombre porque está dentro de la clase.
		nombre = "Juan";
		System.out.println(nombre);
		
	}
	
	
	// atributos
	private String nombre = "";
	int edad = 0;
	
	// métodos
	
	public void crecer() {
		
	}
	
	// al colocar private nadie podrá acceder a este método de otro lugar
	private void vestirse() {
		
	}
}

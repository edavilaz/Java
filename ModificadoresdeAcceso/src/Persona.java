
public class Persona {
	
	//constructor
	public Persona() {
		System.out.println("Se cre� un objeto de tipo Persona");
		// ac� si puedo modificar el nombre porque est� dentro de la clase.
		nombre = "Juan";
		System.out.println(nombre);
		
	}
	
	
	// atributos
	private String nombre = "";
	int edad = 0;
	
	// m�todos
	
	public void crecer() {
		
	}
	
	// al colocar private nadie podr� acceder a este m�todo de otro lugar
	private void vestirse() {
		
	}
}

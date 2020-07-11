
public class Secundaria {

	String nombre;
	int edad;
	double estatura;
	
	// creamos el constructor
	// y ponemos con dos parámetros, que serán recibidos al momento de crear el objeto
	// y el dato de estatura iría directamente con 1.80
	public Secundaria(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		// colocará 1.80 si no se entrega el parámetro de estatura
		this.estatura = 1.80;
	}
	
	// la segunda opción del constructor con los 3 parámetros
	public Secundaria(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}
	
	public void mostrarDatos() {
		System.out.println("Tu nombre es: "+nombre);
		System.out.println("Tu edad es: "+edad);
		System.out.println("Tu estatura es: "+estatura);
	}
	
	
	
}

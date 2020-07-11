
public class Secundaria {

	String nombre;
	int edad;
	double estatura;
	
	// creamos el constructor
	// y ponemos con dos par�metros, que ser�n recibidos al momento de crear el objeto
	// y el dato de estatura ir�a directamente con 1.80
	public Secundaria(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		// colocar� 1.80 si no se entrega el par�metro de estatura
		this.estatura = 1.80;
	}
	
	// la segunda opci�n del constructor con los 3 par�metros
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

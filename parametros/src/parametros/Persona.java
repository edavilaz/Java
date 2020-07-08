package parametros;

public class Persona {

	String nombre = "";
	int edad = 0;
	
	public Persona(String nom) {
		// pasar un valor por parámetro
		this.nombre = nom; 
		
		System.out.println("El objeto " + nombre +" se creo");
	}
}

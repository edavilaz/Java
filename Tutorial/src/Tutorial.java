
public class Tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creamos un objeto con la clase publico y luego privado
		
		Publico pub = new Publico();
		Privado priv = new Privado();
		
		
		// usamos el método creado en publico
		
		pub.mostrar_datos();
		
		// no se puede acceder a los métodos ni atributos en privado, no son visibles
		
		//priv.mostrar_datos();
		
	}

}

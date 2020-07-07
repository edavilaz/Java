
public class Automovil {

	// Atributos o caracter�sticas
	
		String marca;
		int modelo;
		int precio;
		boolean estado = false;
		
	// Definici�n de constructor
		
		public Automovil() {
			System.out.println("Se cre� un objeto de tipo Autom�vil");
		}
		
	// M�todos y acciones
		public void encender() {
			if(estado == true) {
				System.out.println("El automovil y est� encendido");
			}else {
				System.out.println("Encender");
				estado = true;
			}
		}
	
		public void apagar() {
			if(estado == true) {
				System.out.println("Apagado");
				estado = false;
			}else {
				System.out.println("Ya est� apagado");
			}
		}
		
		public void avanzar() {
			if (estado == true) {
				System.out.println("Avanzar");
			}else {
				System.out.println("El automovil est� apagado");
			}
				
			
			
			
		}
}
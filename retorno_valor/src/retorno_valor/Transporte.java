package retorno_valor;

	
	
public class Transporte {

	int precio = 0;
	
	public Transporte(int precio) {
		System.out.println("Se creo un Objeto Transporte");
		this.precio = precio;
	}
	
	public int precio() {
		return this.precio;
	}
}

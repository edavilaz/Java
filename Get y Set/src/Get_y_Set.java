
public class Get_y_Set {

	public static void main(String[] args) {
		// creamos el objeto privado
		
		Privado p = new Privado();
		
		// asignamos valores con set
		
		p.setedad(45);
		p.setnombre("Enrique");
		
		// ahora podemos mostrar con get, pero nos ayudamos
		//con println para imprimir en pantalla
		
		System.out.println("Tu nombre es: " +p.getnombre()+" y tu edad: "+p.getedad());
		

	}

}

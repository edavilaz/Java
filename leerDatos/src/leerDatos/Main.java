package leerDatos;

// para manejar scannerr debemos importar su libreria, para leer datos
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner sería como el tipo de variable
		
		// leer el dato
		Scanner leer = new Scanner(System.in);
		// mensaje para pedir el dato
		System.out.println("Ingresa tu nombre: ");
		// Se asigna el valor ingresado a una variable
		String nombre = leer.nextLine(); // leer string
		// Para capturar numeros enteros y dobles
		System.out.println("Ingresa tu edad: ");
		int edad = leer.nextInt(); // leer enteros
		//captura con decimales
		System.out.println("Ingresa tu peso: ");
		double peso = leer.nextDouble(); // leer dobles
		
		// IMpresión de los datos en pantalla
		System.out.println("Tu nombre es: "+ nombre + " tu edad: "+edad+" tu peso: "+peso);
	}

}

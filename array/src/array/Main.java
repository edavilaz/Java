package array;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Iniciamos el Scanner para leer datos
		Scanner leer = new Scanner(System.in);
		// Declarar el array
		int edad[] = new int [10];
		// otra forma de declarar un vecttor de 7 espacios
		//int edad[] = {0,1,2,3,4,5,6,7}
		
		// para llenar el array mediante teclado (con for)
		
		for(int i=0; i<edad.length;i++) {
			System.out.println("Ingresa edad del sujeto "+(i+1));
			// leer edad numero entero
			edad[i]=leer.nextInt();
		}
		
		// para mostrar en pantalla
		for(int i=0; i<edad.length;i++) {
			System.out.println("La edad del sujeto "+(i+1)+" es: "+edad[i]);
	
		}
	}
}

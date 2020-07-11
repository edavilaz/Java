
import java.util.Scanner; // sirve para leer datos
import java.io.File; // sirve para manipular archivos

public class Archivo {

	public void leerarchivo(){
		
		// creamos la variable para leer datos del teclado
		
		Scanner leer = new Scanner(System.in);
		
		Scanner archivo = null;
		
		// creamos variable para leer archivos
		try {
		archivo = new Scanner(new File("D:\\programas\\java\\Lectura\\src\\letras.txt"));
		}
		catch(Exception o)
		{
			System.out.println("Archivo no encontrado");
		}
		
		String linea= "";
		
		// leer el contenido el archivo  mientras exista algo adelante hasNext
		
		while (archivo.hasNext()) {
			
			linea = archivo.nextLine();
			// imprimir lo que lee
			
			System.out.println(linea);
			
		}
		
	}
}

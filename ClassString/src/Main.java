
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "Enrique";
		String apellido = "Davila";
		String nombre2 = "Enrique";
		// para sacar un caracter determinado
		System.out.println(nombre.charAt(3));
		// concatenar
		System.out.println(nombre.concat(apellido));
		// empieza con?, sale true o false
		System.out.println(nombre.startsWith("E"));
		// finaliza con?
		System.out.println(nombre.endsWith("a"));
		// igual a?
		System.out.println(nombre.equals("Enrique"));
		System.out.println(nombre.equals(nombre2));
		// primera Posición de un caracter o número (del primero que encuentre)
		System.out.println(nombre.indexOf("e"));
		// última posición (dará -1 si no existe)
		System.out.println(nombre.lastIndexOf("d"));
		// reemplazar caracter
		System.out.println(nombre.replace("e", "*"));
		// mostra determinado rango
		System.out.println(nombre.subSequence(2,4));
		// a minúsculas
		System.out.println(nombre.toLowerCase());
		// a MAYUSCULAS
		System.out.println(nombre.toUpperCase());
		// eliminar espacios existentes al inicio y al final
		System.out.println(nombre.trim());
		
		
	}

}

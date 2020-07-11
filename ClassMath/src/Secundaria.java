
public class Secundaria {
	double num,nota,numero,potencia,min,max,raiz;
	
	public void aleatorio() {
		num = Math.random();
		System.out.println(num);
	}
	public void redondeo(double nota) {
		this.nota = Math.round(nota);
		System.out.println("Tu calificación es: "+this.nota);
	}
	public void potencias(double NUMERO, double POTENCIA) {
		numero = Math.pow(NUMERO, POTENCIA);
		System.out.println("La potencia es: "+numero);
	}
	
	public void minimo(double MIN, double MAX) {
		min = Math.min(MIN, MAX);
		System.out.println(min);
	}
	public void raiz(double RAIZ) {
		raiz = Math.sqrt(RAIZ);
	System.out.println("La raiz es: "+raiz);
	}
}

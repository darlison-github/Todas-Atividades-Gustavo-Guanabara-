package operadores;

public class Gerador_de_Numeros {

	public static void main(String[] args) {
		double aleatorio = Math.random(); // random � um gerador de n�meros aleat�rios entre 0 e 1
		int n = (int) (15 + aleatorio * (15-5));
		System.out.println(n);
		
		
	}

}

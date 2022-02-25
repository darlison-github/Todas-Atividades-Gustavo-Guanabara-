package EstruturasCondicionais;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		
		int n, s=0;
		String resp;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Digite um Número: ");
			n = teclado.nextInt();
			s = s + n; // ou S += n; dá no mesmo.
			System.out.print("Quer Continuar? [S/N] ");
			resp = teclado.next();
		} while (resp.equals("S"));
		System.out.println("A soma de todos os valores é: " + s);
	}

}

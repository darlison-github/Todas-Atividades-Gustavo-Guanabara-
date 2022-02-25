package EstruturasCondicionais;

import java.util.Scanner;

public class QuantidadeDePatas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a quantidade de pernas");
		
		int pernas = teclado.nextInt();	
		String tipo;
		switch (pernas) {
		case 1:
			tipo = "Saci";
			System.out.println(tipo);
			break;
		case 2:
			tipo = "Bípede";
			System.out.println(tipo);
			break;
		case 4:
			tipo = "Quadrúpede";
			System.out.println(tipo);
			break;
		case 6,8:
			tipo = "Aranha";
			System.out.println(tipo);
			break;
		default:
			tipo = "ET";
			System.out.println(tipo);
			break;
		}
		
	}

}

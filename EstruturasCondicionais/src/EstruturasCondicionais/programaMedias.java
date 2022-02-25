package EstruturasCondicionais;

import java.util.Scanner;

class programaMedias {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite as duas primeiras notas");
		float n1 = teclado.nextFloat();
		float n2 = teclado.nextFloat();
		
		float m = (n1 + n2 ) /2;
		System.out.println("Sua média foi: " + m);
		if (m > 9 ) {
		System.out.println("Parabéns!!!!");
		} else {
		if	(m < 7)	
		System.out.println("Você está na final.");
		}
		
	}

}

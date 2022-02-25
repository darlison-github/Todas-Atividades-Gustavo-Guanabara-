package EstruturasCondicionais;

import java.util.Scanner;

public class nascimentoMaiorMenos {
	public static void main(String[] main) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Em que ano você nasceu?");
		
		int nasc = teclado.nextInt();
		int i = 2022 - nasc;
		System.out.println("Sua idade é: " + i);
		if (i>=18) {
		System.out.println("Maior de idade");
		} else {
		System.out.println("Menor de idade");
		}
		
	}
}

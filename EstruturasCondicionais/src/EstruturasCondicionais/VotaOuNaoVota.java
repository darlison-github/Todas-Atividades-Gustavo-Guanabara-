package EstruturasCondicionais;

import java.util.Scanner;

public class VotaOuNaoVota {
	public static void main(String[] main) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Em qual ano voc� nasceu?");

		int nasc = teclado.nextInt();
		int i = (2021 - nasc);
		System.out.println("Sua idade �: " + i);
		if (i < 16) {
			System.out.println("N�o pode votar!");
		} else {
			if ((i >= 16 && i < 18) || (i > 70)) {
				System.out.println("O voto � opcional!");
			} else {
				System.out.println("O voto � obrigat�rio!");
			}

		}
	}
}

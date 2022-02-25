package EstruturasCondicionais;

import java.util.Scanner;

public class VotaOuNaoVota {
	public static void main(String[] main) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Em qual ano você nasceu?");

		int nasc = teclado.nextInt();
		int i = (2021 - nasc);
		System.out.println("Sua idade é: " + i);
		if (i < 16) {
			System.out.println("Não pode votar!");
		} else {
			if ((i >= 16 && i < 18) || (i > 70)) {
				System.out.println("O voto é opcional!");
			} else {
				System.out.println("O voto é obrigatório!");
			}

		}
	}
}

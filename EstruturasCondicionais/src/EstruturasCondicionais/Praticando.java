package EstruturasCondicionais;

import java.util.Scanner;

public class Praticando {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual jogo você prefere?");
		System.out.println("1 - League of Legends");
		System.out.println("2 - Lineage II");
		System.out.println("3 - Call of Duty");
		System.out.println("-------------------");
		System.out.print("Digite o número do game:");
		
		int jogos = teclado.nextInt();
		String tipo;
		switch (jogos) {
		case 1:
			tipo = "League of Legends";
			System.out.println("Você fez uma ótima escolha: " + tipo);
			break;
			
		case 2: 
			tipo = "Lineage II";
			System.out.println("Claramente preferimos os clássicos : "+ tipo);
			break;
			
		case 3:
			tipo = "Call of Duty";
			System.out.println("Quem não prefere uma adrenalina dos FPS: " +tipo);
			break;
			
			
		}
	}

}

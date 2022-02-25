package Vetores;

import java.util.Arrays;

public class Vetor5 {

	public static void main(String[] args) {

		int v[] = new int[20];
		Arrays.fill(v, 3);
		for(int valor: v) {    // o Arrays.fill(v, 0); serve para encher o vetor em todas as posições com 0
			System.out.print(valor + " ");
		}

	}

}

package Vetores;

import java.util.Arrays;

public class Vetor4 {

	public static void main(String[] args) {
		int vet[] = { 3, 7, 6, 1, 9, 4, 2 };
		for (int v: vet) {
			System.out.println(v + " ");
		}
			int p = Arrays.binarySearch(vet, 1);
			System.out.println("Encontrei o valor na posi��o " + p);
		}

	}


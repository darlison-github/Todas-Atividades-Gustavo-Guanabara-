package Vetores;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetores3 {

	public static void main(String[] args) {
		float v[] = { 4, 5, 2, 3, 7, 9, 6, 10 };
		Arrays.sort(v);	// Com esse comando coloca os numeros do vetor em ondem...
		for (float valor : v) {
			System.out.print(valor + " ");

		}
	}

}

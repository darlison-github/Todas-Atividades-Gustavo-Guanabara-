package atividades;

import java.util.Date;
import java.util.Locale;

public class PrimeiroPrograma {
	public static void main(String[] args) {

		Date relogio = new Date();
		System.out.println("A data do meu sistema é: ");
		System.out.println(relogio.toString());
		System.out.println("------------------------------------------------");
		Locale loc = Locale.getDefault();
		System.out.println("A linguagem do meu sistema é: ");
		System.out.println(loc.getDisplayLanguage());		

	}
}

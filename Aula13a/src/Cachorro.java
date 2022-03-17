public class Cachorro extends Lobo {
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}

	public void reagir(String frase) {
		if (frase.equals("Toma Comida") || frase.equals("Olá")) {
			System.out.println("Abanar rabo e latir");
		} else {
			System.out.println("Rosnar");
		}
	}

	public void reagir(int hora, int minuto) {
		if (hora < 12) {
		System.out.println("Abanar");
		} else if (hora >= 18){	
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}
	}

	public void reagir(boolean dono) {
		if (dono == true) {
			System.out.println("Abanar rabo");
		} else {
			System.out.println("Rosnar e latir");
			//this.emitirSom();
		}
	}

	public void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		} else {
			if (peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}

		}
	}
}

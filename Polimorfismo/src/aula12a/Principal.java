package aula12a;

public class Principal {
	public static void main(String[] args) {

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra cob = new Cobra();
		Arara arara = new Arara();
		Tartaruga tart = new Tartaruga();
		GoldFish peix = new GoldFish();
		
		
		
		/*m.setPeso(35.3f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.emitirSom();
		m.locomover();*/
		
		System.out.println("------ O canguru ------");
		c.locomover();
		System.out.println("------ O cachorro ------");
		k.locomover();
		k.emitirSom();
		System.out.println("------ A cobra ------");
		cob.locomover();
		cob.emitirSom();
		arara.locomover();
		tart.locomover();
		peix.locomover();
		
		
	}

}

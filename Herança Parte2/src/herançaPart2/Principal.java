package herançaPart2;

public class Principal {

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa();
		Visitante v1 = new Visitante();
		v1.setNome("Darlison");
		v1.setIdade(26);
		v1.setSexo("M");
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Ana Luiza");
		a1.setMatricula(1212);
		a1.setCurso("Fisioterapia");
		a1.setIdade(21);
		a1.setSexo("F");
		System.out.println(a1.toString());
		a1.pagarMensalidade(); 
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Pedro Ferreira");
		b1.setMatricula(2424);
		b1.setCurso("Advocacia");
		b1.setIdade(24);
		b1.setSexo("M");
		b1.setBolsa(12.5f);
		b1.PagarMensalidade();
		System.out.println(b1.toString());
	
		Aluno a2 = new Aluno();
		a2.setNome("Waldilene");
		a2.setMatricula(1313);
		a2.setCurso("Tecnica em Enfermagem");
		a2.setIdade(56);
		a2.setSexo("F");
		System.out.println(a2.toString());
		a2.pagarMensalidade(); 
	
	}

}

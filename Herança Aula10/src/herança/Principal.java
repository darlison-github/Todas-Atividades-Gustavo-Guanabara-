package herança;
public class Principal {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Darlison");
		p2.setNome("Ana Luiza");
		p3.setNome("Pedro");
		p4.setNome("Deda");
		
		p1.setSexo("M");
		p1.setIdade(26);
		
		p2.setSexo("F");
		p2.setMatr(11527943);
		p2.setIdade(18);
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		p3.ReceberAumento(550.50f);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}

}

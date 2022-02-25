package ProjetinhoLivro;
public class ProjetoLivro {
	public static void main(String[] args) {

		Pessoa[] p = new Pessoa[3];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", 26, "Masculino");
		p[1] = new Pessoa("Ana", 20, "Feminina");
		p[2] = new Pessoa("Wal", 56, "Feminina");
		
		l[0] = new Livro("Senhor dos Aneis", "Darlison Henrique", 1000, p[0]);
		l[1] = new Livro("O Robbit", "Ana Luiza", 500, p[1]);
		l[2] = new Livro("Jogador Número 1", "Waldilene Maria", 250, p[0]);
		
		l[0].abrir();
		l[0].folhear(100);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
		
		//l[1].abrir();
		//l[1].folhear(50);
		//l[1].avancarPag();
		//System.out.println(l[1].detalhes());
	
		
	}

}

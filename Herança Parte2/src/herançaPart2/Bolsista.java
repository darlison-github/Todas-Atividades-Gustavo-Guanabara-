package herançaPart2;
public class Bolsista extends Aluno {
	private float bolsa;
	
	public void RenovarMensalidade() {
		System.out.println("Renovando bolsa de " + this.getNome());
	
	}
	
	public void PagarMensalidade() {
		System.out.println(this.nome + " é bolsista! Pagamento facilitado");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
}

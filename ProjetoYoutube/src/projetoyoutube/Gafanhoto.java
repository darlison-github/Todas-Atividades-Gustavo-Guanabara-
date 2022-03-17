package projetoyoutube;
public class Gafanhoto extends Pessoa {
	
	private String login;
	private int toAssistindo;
	
	public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.toAssistindo = 0;
	}
	
	public String getLoguin() {
		return login;
	}
	public void setLoguin(String loguin) {
		this.login = loguin;
	}
	public int getToAssistindo() {
		return toAssistindo;
	}
	public void setToAssistindo(int toAssistindo) {
		this.toAssistindo = toAssistindo;
	}

	@Override
	public String toString() {
		return "Gafanhoto [login=" + login + ", toAssistindo=" + toAssistindo + "]";
	}
	
}

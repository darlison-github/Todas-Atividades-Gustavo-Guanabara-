package aula12a;
public class Ave extends Animal {
	private String corPena;
	@Override
	public void locomover() {
		System.out.println("Voando");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo insetos");
	}
	@Override
	public void emitirSom() {
		System.out.println("Assoviando");
	}
	public void fazerNinho() {
		System.out.println("Construindo um ninho");
	}
	public String getCorPena() {
		return corPena;
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}

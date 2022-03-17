package projetoyoutube;
public class Video implements AcoesVideo {
	private String titulo;
	private int avaliacao;
	private int view;
	private int curtidas;
	private boolean reproduzir;

	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliacao = 1;
		this.view = 0;
		this.curtidas = 0;
		this.reproduzir = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (int) ((this.avaliacao + avaliacao)/this.view);
		this.avaliacao = nova;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}
	
	public int getCurtidas() {
		return curtidas;
	}
	
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzir() {
		return reproduzir;
	}

	public void setReproduzir(boolean reproduzir) {
		this.reproduzir = reproduzir;
	}

	@Override
	public void play() {
		this.reproduzir = true;
	}
	
	@Override
	public void pause() {
	this.reproduzir = false;	
	}
	
	@Override
	public void like() {
	this.curtidas ++ ;
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", view=" + view +
				", curtidas=" + curtidas + ", reproduzir=" + reproduzir + "]";
	}
	
	
	
	
}

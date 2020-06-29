public class Autor {
	
	@Override
	public String toString() {
		return "Autor [nome=" + nome + "]";
	}

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Autor() {}
	
	public Autor(String nome) {
		super();
		this.nome = nome;
	}
	
}

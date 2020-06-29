public class Editora {
	
	@Override
	public String toString() {
		return "Editora [nomeEditora=" + nomeEditora + "]";
	}

	private String nomeEditora;

	public String getNomeEditora() {
		return nomeEditora;
	}

	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	
	public Editora() {}
	
	public Editora(String nomeEditora) {
		super();
		this.nomeEditora = nomeEditora;
	}
}

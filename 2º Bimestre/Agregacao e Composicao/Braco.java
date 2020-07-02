
public class Braco {
	private String lado;
	private int numeroMao;
	
	@Override
	public String toString() {
		return "Braco [lado=" + lado + ", numeroMao=" + numeroMao + "]";
	}

	public Braco() {}
	
	public Braco(String lado, int numeroMao) {
		super();
		this.lado = lado;
		this.numeroMao = numeroMao;
	}

	public String getLado() {
		return lado;
	}

	public void setLado(String lado) {
		this.lado = lado;
	}

	public int getNumeroMao() {
		return numeroMao;
	}

	public void setNumeroMao(int numeroMao) {
		this.numeroMao = numeroMao;
	}

	

	
}

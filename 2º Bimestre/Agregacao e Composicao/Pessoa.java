import java.util.Arrays;

public class Pessoa {
	private String nome;
	private int idade;
	private Braco braco[];
	private Perna perna[];
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade, Braco[] braco, Perna[] perna) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.braco = braco;
		this.perna = perna;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Braco[] getBraco() {
		return braco;
	}

	public void setBraco(Braco[] braco) {
		this.braco = braco;
	}

	public Perna[] getPerna() {
		return perna;
	}

	public void setPerna(Perna[] perna) {
		this.perna = perna;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", braco=" + Arrays.toString(braco) + ", perna="
				+ Arrays.toString(perna) + "]";
	}
	
	
}

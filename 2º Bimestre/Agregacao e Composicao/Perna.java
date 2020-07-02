
public class Perna {
	private int pe;
	private String lado;
	
	public Perna() {}

	public Perna(int pe, String lado) {
		super();
		this.pe = pe;
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Perna [pe=" + pe + ", lado=" + lado + "]";
	}

	public int getPe() {
		return pe;
	}

	public void setPe(int pe) {
		this.pe = pe;
	}

	public String getLado() {
		return lado;
	}

	public void setLado(String lado) {
		this.lado = lado;
	}
	
	
}

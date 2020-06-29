public class Livro {
	private String nome;
	private int paginas;
	private Autor autor;
	private Editora editora;
	
	public Livro() {}
	
	public Livro(String nome, int paginas, Autor autor, Editora editora) {
		super();
		this.nome = nome;
		this.paginas = paginas;
		this.autor = autor;
		this.editora = editora;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	

}

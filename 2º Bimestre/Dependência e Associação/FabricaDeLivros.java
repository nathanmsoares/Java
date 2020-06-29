public class FabricaDeLivros {
	private static FabricaDeLivros instance;
	
	private FabricaDeLivros() {}
	
	public static synchronized FabricaDeLivros getInstance() {
		if(instance == null ) {
			instance = new FabricaDeLivros();
		}
		return instance;
	}
	
	public Livro criarLivro(String nome, int paginas, Autor autor, Editora editora) {
		return new Livro(nome, paginas, autor, editora);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("teste");
		Editora fulana = new Editora("Fulana");
		Autor autor1 = new Autor("Julano de Oliveira");
		
		Livro livro1 = FabricaDeLivros.getInstance().criarLivro("Java para Leigos", 300, autor1, fulana);
		
		ViewLivro view = new ViewLivro();
		view.apresentar(livro1);
		
	}

}

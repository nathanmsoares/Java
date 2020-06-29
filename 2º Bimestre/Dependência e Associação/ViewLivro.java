public class ViewLivro {
	public void apresentar(Livro livro) {
		System.out.println("---------------------\n");
		System.out.println("        Livro\n");
		System.out.println("---------------------\n");
		System.out.println(" Livro: "+livro.getNome());
		System.out.println(livro.getAutor());
		System.out.println(" Numero de Paginas: "+livro.getPaginas());
		System.out.println(livro.getEditora());
	}
}

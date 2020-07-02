
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Braco bracos[] = new Braco[2];
		
		Perna pernas[] = new Perna[2];
		
		Perna perna1 = new Perna(1, "Esquerdo");
		
		Perna perna2 = new Perna(1, "Direito");
		
		Braco braco1 = new Braco("Esquerdo", 1);
		
		Braco braco2 = new Braco("Direto", 1);
		
		bracos[0] = braco1;
		bracos[1] = braco2;
		
		pernas[0] = perna1;
		pernas[1] = perna2;
		
		Pessoa novaPessoa = new Pessoa("Joao", 30, bracos, pernas);
		
		System.out.println(novaPessoa.getNome());
		System.out.println(novaPessoa.getIdade());
		for(int i = 0; i < novaPessoa.getBraco().length; i++) {
			Braco x[] = novaPessoa.getBraco(); 
			System.out.println(x[i]);
		}
		for(int i = 0; i < novaPessoa.getBraco().length; i++) {
			Perna y[] = novaPessoa.getPerna();
			System.out.println(y[i]);
		}
		
		
		
		

	}

}

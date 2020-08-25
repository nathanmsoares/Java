
public class Main {
	
	public static void main(String[] args) {
		
	Soma soma = new SomaAoQuadrado();
	soma.soma(12);
	
	System.out.println("");
	
	SomaAoQuadrado somaquadrado = (SomaAoQuadrado)soma;
	somaquadrado.somaAoQuadrado(15);
	
	System.out.println("");
	
	soma.soma(10);
	System.out.println("");
	
	
	
	
	Soma soma1 = new PG();
	soma1.soma(5);
	System.out.println("");
	
	PG pg = (PG)soma1;
	pg.pG(20);
	
	System.out.println("");
	
	soma1.soma(21);
	
	System.out.println("");
	
	
	
	
	}
}
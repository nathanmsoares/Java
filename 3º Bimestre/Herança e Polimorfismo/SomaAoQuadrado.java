
public class SomaAoQuadrado extends Soma{
	private int valorInicial;
	private double valor;
	

	public void somaAoQuadrado(int valorInicial) {
		System.out.println("Sequencia da soma dos numeros elevados ao quadrado de 0 a " + valorInicial);
		for (int j = 0; j < 2; j++) {
			for(int i = 1; i <= valorInicial; i++) {
					if (i == 1) {
						valor = i;
						System.out.println(valor);
					}
					else {
						double valorAoQuadrado = Math.pow(i,2);
						valor += valorAoQuadrado;
						System.out.println(valor);
				}}
			if (j < 1) {
				System.out.println("resetando contagem");
				valor = 0;
			}
			else {
				System.out.println("Sequencia Terminada");
			}
			}
		}
	public void teste1() {
	System.out.println("somaAoQuadrado");}
	}



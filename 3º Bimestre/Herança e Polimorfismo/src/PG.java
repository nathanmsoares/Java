
public class PG extends SomaAoQuadrado{
		private int valorInicial;
		private double primeiroNumero = 2;
		private double razao = 4;
		private double pg;
		

		public void pG(int valorInicial) {
			System.out.println("Calculando PG de 1 a "+ valorInicial +" usando a razão de 4 e o primeiro número sendo 2");
			for(int o = 1; o <= 2; o++) {
				for(int j = 1; j <= valorInicial; j++) {
					if (j == 1) {
						pg = primeiroNumero;
					}
					else {
						System.out.println("Valor atual "+ pg);
						pg *= razao;
						System.out.println("Valor seguinte "+ pg);
						}
				}
			if (o == 1) {
				System.out.println("");
				System.out.println("Resetando contagem");
				System.out.println("");
			}
			else {
				System.out.println("");
				System.out.println("Sequencia terminada");
			}
			}
		}
}	

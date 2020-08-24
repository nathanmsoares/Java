
public class PG extends SomaAoQuadrado{
		private int valorInicial;
		private double primeiroNumero = 2;
		private double razao = 4;
		private double pg;
		

		public void pG(int valorInicial) {
			System.out.println("Calculando PG de 1 a "+ valorInicial);
			for(int o = 1; o <= 2; o++) {
				for(int j = 1; j <= valorInicial; j++) {
					if (j == 1) {
						pg = primeiroNumero;
						System.out.println(pg);
					}
					else {
						pg *= razao;
						System.out.println(pg);
						}
				}
			if (o == 1) {
				System.out.println("Resetando contagem");
			}
			else {
				System.out.println("Sequencia terminada");
			}
			}
		}
}	


public class Soma {
	
	private int valorInicial;
	private double valor;
	
	public void soma(int valorInicial) {
		System.out.println("Sequencia da soma dos "+ valorInicial +" numeros iniciando em zero");
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < valorInicial+1; i++) {
				if ( i == 0) {
					valor = i;
					}
				else {
					System.out.println("Valor atual: " + valor);
					valor += i;
					System.out.println("Numero Seguinte: " + valor);
				}}
			if (j < 1) {
				System.out.println("");
				System.out.println("Reiniciando Sequencia");
				valor = 0;
				System.out.println("");
				}
			else {
				System.out.println("");
				System.out.println("Sequencia terminada");
			}
		}
	}
}
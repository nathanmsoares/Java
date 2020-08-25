
public class Soma {
	
	private int valorInicial;
	private double valor;
	
	public void soma(int valorInicial) {
		System.out.println("Sequencia da soma dos "+ valorInicial +" numeros iniciando em zero");
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < valorInicial+1; i++) {
				if ( i == 0) {
					valor = i;
					System.out.println(i);
				}
				else {
					valor += i;
					System.out.println(valor);
				}}
			if (j < 1) {
				System.out.println("Reiniciando Sequencia");
				valor = 0;
				}
			else {
				System.out.println("Sequencia terminada");
			}
		}
	}
}

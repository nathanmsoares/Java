import java.util.Scanner;

public class Switch{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int i = leitor.nextInt();
		
		switch(i){
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("Um");
				break;
			default:
				System.out.println("Qualquer número");
			}
		}
}
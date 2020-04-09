import java.util.Scanner;

public class Erros{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		
		try{
			System.out.println("Digite um número: ");
			int i = leitor.nextInt();
			System.out.println("i = " +i);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Erro " +e.getMessage());
		}	

	}
}
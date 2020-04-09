import java.util.Scanner;

public class tipoTriangulo{
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		float i = leitor.nextFloat();
		float a = leitor.nextFloat();
		float b = leitor.nextFloat();
		if(i == a && a == b && b == i){
			System.out.println("triangulo equilatero");
		} else if(i==a || i==b || b==a || b == i || a==b || a==i){
			System.out.println("Triangulo isoceles");
		} else if(i != a && i != b && b != a)
	}
}	
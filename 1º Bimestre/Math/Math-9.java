import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner numeros = new Scanner(System.in);
    double x;
    while (true) {
    System.out.println("Digite o valor de X");
    x = numeros.nextDouble();
    if(x >= -32 && x <= 32) {
      break;
    }else{
      System.out.println("Digite um número entre -32 e 32");
    }}
    System.out.println("Digite o valor de Y");
    double y = numeros.nextDouble();
    while (true) {
      if(y >= -32 && y <= 32){
        break;
      }else{
        System.out.println("Digite um número entre -32 e 32");
      }
    }
    double a = -0.2 * (Math.hypot(x, y));
    double resultado = -200 * (Math.pow(Math.E, a));
    System.out.println(resultado);
  }
}
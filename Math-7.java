import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner numeros = new Scanner(System.in);
    double x;
    while (true) {
    System.out.println("Digite o valor de X");
    x = numeros.nextDouble();
    if(x >= -15 && x <= -5) {
      break;
    }else{
      System.out.println("Digite um número entre -15 e -5");
    }}
    System.out.println("Digite o valor de Y");
    double y = numeros.nextDouble();
    while (true) {
      if(y >= -3 && y <= 3){
        break;
      }else{
        System.out.println("Digite um númeor entre -3 e 3");
      }
    }
    double xAoQuadrado = Math.pow(x,2);
    double a = Math.abs(y - 0.01 * xAoQuadrado);
    double aAoQuadrado = Math.sqrt(a);
    double b = Math.abs(x+10);
    double resultado = (100 * aAoQuadrado) + (0.01 * b);
    System.out.println(resultado);
  }
}
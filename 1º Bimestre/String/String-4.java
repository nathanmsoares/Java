import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner numeros = new Scanner(System.in);
    System.out.println("Digite a palavra");
    String x = numeros.nextLine();
    x = x.replace("a", "1");
    x = x.replace("e", "2");
    x = x.replace("i", "3");
    x = x.replace("o", "4");
    x = x.replace("u", "5");
    System.out.println(x);
  }
}
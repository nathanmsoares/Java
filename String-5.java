import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner numeros = new Scanner(System.in);
    System.out.println("Digite a palavra");
    String x = numeros.nextLine();
    x = x.replace(x, x.toLowerCase());
    x = x.replace("a", "");
    x = x.replace("e", "");
    x = x.replace("i", "");
    x = x.replace("o", "");
    x = x.replace("u", "");
    System.out.println(x);
  }
}
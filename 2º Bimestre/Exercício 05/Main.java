public class Main {
  public static void main(String[] args) {
    Produto produto1 = new Produto();
    Produto produto2 = new Produto();
    Produto produto3 = new Produto();
    produto1.setNome("Maçã");
    produto2.setNome("Banana");
    produto3.setNome("Maçã");
    produto1.setValor("10.10");
    produto2.setValor("11.11");
    produto3.setValor("10.10");
    System.out.println("\n");
    produto1.getNome();
    produto2.getNome();
    produto3.getNome();
    System.out.println("\n");
    produto1.getValor();
    produto2.getValor();
    produto3.getValor();
    System.out.println("\n");
    System.out.println("toString(): "+produto1.toString());
    System.out.println("toString(): "+produto2.toString());
    System.out.println("toString(): "+produto3.toString());
    System.out.println("\n");
    System.out.println("O produto 1 é igual ao produto 2?\n"+(produto1.equals(produto2)));
    System.out.println("O produto 1 é igual ao produto 3?\n"+(produto1.equals(produto3)));
    System.out.println("O produto 2 é igual ao nome do produto 3?\n"+(produto2.equals(produto3)));
  }
}
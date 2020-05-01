import java.util.Scanner;

class Main {

    public static double calcularVolumeparalelepipedo(double parametro1, double parametro2, double parametro3){
        double resultado = parametro1 * parametro2 * parametro3;
        return resultado;
    }
    public static double calcularVolumeCubo(double parametro1){
      double resultado = Math.cbrt(parametro1);
      return resultado;
    }
    public static double calcularVolumePiramide(double largura, double comprimento, double altura){
      double resultado = (1 / 3) * (largura * comprimento * altura);
      return resultado;
    }
    public static double calcularVolumeEsfera(double raio){
      double resultado = (4 * Math.PI * (Math.cbrt(raio))) / 3;
      return resultado;
    }
    public static double calcularVolumeCilindro(double raio, double altura){
      double resultado = Math.PI * Math.sqrt(raio) * altura;
      return resultado;
    }
  public static void main(String[] args) {
    String paralelepipedo = "PARALELEPIPEDO";
    String cubo = "CUBO";
    String piramide = "PIRAMIDE";
    String esfera = "ESFERA";
    String cilindro = "CILINDRO";
    String sair = "SAIR";
      while(true){
      System.out.println("Ola! Qual forma geométrica você deseja calcular o volume?\nDigite sem acento\nCubo\nParalelepipedo\nPiramide\nEsfera\nCilindro\nDigite Sair para sair");
      Scanner leitor = new Scanner(System.in);
      String formaGeometrica = leitor.nextLine();
      String conversaogeometrica = formaGeometrica.toUpperCase();
      if(conversaogeometrica.equals(paralelepipedo)){
        System.out.println("Digite a altura, largura e comprimento e aperte enter a cada vez que você colocar uma medida");
        double parametro1 = leitor.nextDouble();
        double parametro2 = leitor.nextDouble();
        double parametro3 = leitor.nextDouble();
        double resultado = calcularVolumeparalelepipedo(parametro1, parametro2, parametro3);
        System.out.println("O volume do paralelepidade é de " + resultado+" unidades³");
      }
      if(conversaogeometrica.equals(cubo)){
        System.out.println("Digite o valor da altura ou comprimento ou largura do Cubo");
        double parametro = leitor.nextDouble();
        double resultado = calcularVolumeCubo(parametro);
        System.out.println("O volume do cubo é de "+resultado+" unidades³");
      }
      if(conversaogeometrica.equals(piramide)){
        System.out.println("Digite a algura, largura e comprimento da piramide apertando enter a cada vez que digitar o valor");
        double altura = leitor.nextDouble();
        double largura = leitor.nextDouble();
        double comprimento = leitor.nextDouble();
        double resultado = calcularVolumePiramide(altura, largura, comprimento);
        System.out.println("O volume da piramide é de "+resultado+" unidades³");
      }
      if(conversaogeometrica.equals(esfera)){
        System.out.println("Digite o valor do raio");
        double raio = leitor.nextDouble();
        double resultado = calcularVolumeEsfera(raio);
        System.out.println("O volume da esfera é de "+resultado+" unidades³");
      }
      if(conversaogeometrica.equals(cilindro)){
        System.out.println("Digite o raio e a altura do cilindro e aperte enter a cada valor informado");
        double raio = leitor.nextDouble();
        double altura = leitor.nextDouble();
        double resultado = calcularVolumeCilindro(raio, altura);
        System.out.println("O volume do cilindro é de "+resultado+" unidades³");
      }
      if(conversaogeometrica.equals(sair)){
        break;
      }
    }
  }
}
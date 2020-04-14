class Main {
  public static void main(String[] args) {
    double x = 15.5;
    double y = Math.cbrt(x);
    double w = Math.log(x);
    double a = Math.sqrt(x);
    double b = Math.cbrt(x);
    double tana = Math.tan(a);
    double tanhb = Math.tanh(b);
    double resultado = y + w -(Math.min(tana, tanhb));
    System.out.println(resultado);
  }
}

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Meses Janeiro = Meses.Janeiro;
    Meses Fevereiro = Meses.Fevereiro;
    Meses Março = Meses.Março;
    Meses Abril = Meses.Abril;
    Meses Maio = Meses.Maio;
    Meses Junho = Meses.Junho;
    Meses Julho = Meses.Julho;
    Meses Agosto = Meses.Agosto;
    Meses Setembro = Meses.Setembro;
    Meses Outubro = Meses.Outubro;
    Meses Novembro = Meses.Novembro;
    Meses Dezembro = Meses.Dezembro;
    System.out.println("Mês "+Janeiro);
    System.out.println("Mês "+Fevereiro);
    System.out.println("Mês "+Março);
    System.out.println("Mês "+Abril);
    System.out.println("Mês "+Maio);
    System.out.println("Mês "+Junho);
    System.out.println("Mês "+Julho);
    System.out.println("Mês "+Agosto);
    System.out.println("Mês "+Setembro);
    System.out.println("Mês "+Outubro);
    System.out.println("Mês "+Novembro);
    System.out.println("Mês "+Dezembro);

    Camisa c1 = new Camisa("Polo","Polo",TamanhosCamisa.M);
    Camisa c2 = new Camisa("Basica","Renner",TamanhosCamisa.P);
    Camisa c3 = new Camisa("Long","Personal",TamanhosCamisa.G);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
  }
}
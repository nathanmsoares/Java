class Main {

  public static int[] vetor(int... a){
    return a;
  }
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int b[] = vetor(1,2,3,4,5,6);
    for(int linha : b){
      System.out.println(linha);
    }
  }
}

class Main {
  public static void main(String[] args) {
    double a = 0;
    double temp = 0;
    for(int i = 1; i < 1999; i++) {
        temp = Math.sqrt(i);
        a = a + Math.floor(temp);
    }
    System.out.println(a);
  }
}

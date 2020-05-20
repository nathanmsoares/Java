public class Cachorro{
  private String nome;
  private int idade;
  private String corDoPelo;
  private String raca;

  public void getNome(){
    System.out.println("Nome: "+ nome);
  }
  public void getIdade(){
    System.out.println("Idade: "+ idade);
  }
  public void getCorDoPelo(){
    System.out.println("Cor do pelo: "+ corDoPelo);
  }
  public void getRaca(){
    System.out.println("Raça: "+ raca);
  }
  public void setNome(String novoNome){
    nome = novoNome;
  }
  public void setIdade(int novaIdade){
    idade = novaIdade;
  }
  public void setCorDoPelo(String novaCorDoPelo){
    corDoPelo = novaCorDoPelo;
  }
  public void setRaca(String novaRaca){
    raca = novaRaca;
  }
}
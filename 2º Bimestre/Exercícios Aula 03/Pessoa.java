public class Pessoa{
  private String nome;
  private int idade;
  private String endereco;
  private int cep;
  private String nomePai;
  private String nomeMae;

  public void getNome(){
    System.out.println("nome: " + nome);
  }
  public void getIdade(){
    System.out.println("idade: " + idade);
  }
  public void getEndereco(){
    System.out.println("Endereço: " + endereco);
  }
  public void setNome(String novoNome){
    nome = novoNome;
  }
  public void setIdade(int novaIdade){
    idade = novaIdade;
  }
  public void setEndereco(String novoEndereco){
    endereco = novoEndereco;
  }
}
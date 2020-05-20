public class Cargo{
  private String nome;
  private String descricao;
  private float pisoSalarial;
  private int cargaHoraria;

  public void getNome(){
    System.out.println("nome: "+nome);
  }
  public void getDescricao(){
    System.out.println("Descrição: "+descricao);
  }
  public void getPisoSalarial(){
    System.out.println("Piso salarial: "+ pisoSalarial);
  }
  public void getCargaHoraria(){
    System.out.println("Carga horária: "+cargaHoraria);
  }
  public void setNome(String novoNome){
    nome = novoNome;
  }
  public void setDescricao(String novaDescricao){
    descricao = novaDescricao;
  }
  public void setPisoSalarial(float novoPisoSalarial){
    pisoSalarial = novoPisoSalarial;
  }
  public void setCargaHoraria(int novaCargaHoraria){
    cargaHoraria = novaCargaHoraria;
  }
}
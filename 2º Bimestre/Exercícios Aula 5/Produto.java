public class Produto{

  private String nome;
  private String valor;

  public void getNome(){
    System.out.println("Nome: "+nome);
  }
  public void getValor(){
    System.out.println("Valor: "+valor);
  }
  public void setNome(String novoNome){
    nome = novoNome;
  }
  public void setValor(String novoValor){
    valor = novoValor;
  }
  @Override
  public String toString(){
    return "[Produto: nome = "+nome+" valor: "+valor+")]";
  }
  @Override
  public boolean equals(Object product){
    if(this == product) return true;
    if(product == null) return false;
    if(product instanceof Produto){
      Produto a = (Produto)product;
      boolean flag = false;
      if(nome != null) {  
        flag = nome.equals(a.nome);
      }else {
        flag = a.nome == null;
      }
      if(valor != null){
        flag = flag && valor.equals(a.valor);
      }else {
        flag = flag && a.valor == null;
      }
      return flag;
    }
    return false;
  }
}


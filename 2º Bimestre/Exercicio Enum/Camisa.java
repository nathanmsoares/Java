/*public class Camisa{

  private String cor;
  private TamanhosCamisa tamanhosCamisas;
  //private 
  public TamanhosCamisa CamisaGG = TamanhosCamisa.GG;
  public TamanhosCamisa CamisaG = TamanhosCamisa.G;
  public TamanhosCamisa CamisaEXG = TamanhosCamisa.EXG;
  public TamanhosCamisa CamisaP = TamanhosCamisa.P;
  public TamanhosCamisa CamisaM = TamanhosCamisa.M;

  public void setCor(String nomeCor){
    cor = nomeCor;
  }
  public String getCor(){
    return cor;
  }

}*/

public class Camisa {

 

  private String modelo;

  private String marca;

  private TamanhosCamisa tamanho;

 

  public Camisa() {}

 

  public Camisa(String modelo, String marca, TamanhosCamisa tamanho) {

  super();

  this.modelo = modelo;

  this.marca = marca;

  this.tamanho = tamanho;

  }

  public String getModelo() {

  return modelo;

} 

  public void setModelo(String modelo) {

  this.modelo = modelo;

}

  public String getMarca() {

    return marca;

}

  public void setMarca(String marca) {

    this.marca = marca;

  }

  public TamanhosCamisa getTamanho() {

    return tamanho;

  }

  public void setTamanho(TamanhosCamisa tamanho) {

    this.tamanho = tamanho;

  }


 

 @Override

  public String toString() {

    return "Camisa [ modelo = " + modelo + ", Marca = " + marca + ", Tamanho = " + tamanho + " ]";

  }

 

}
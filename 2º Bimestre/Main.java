public class Main {
  public static void main(String[] args) {

    System.out.println("\n");

    Pessoa pessoa = new Pessoa();
    pessoa.setNome("Nathan");
    pessoa.setIdade(26);
    pessoa.setEndereco("Rua teste");
    pessoa.getNome();
    pessoa.getIdade();
    pessoa.getEndereco();

    System.out.println("\n");

    Cargo soldador = new Cargo();
    soldador.setNome("Joao");
    soldador.setDescricao("Soldador");
    soldador.setPisoSalarial(2500);
    soldador.setCargaHoraria(250);
    soldador.getNome();
    soldador.getDescricao();
    soldador.getPisoSalarial();
    soldador.getCargaHoraria();

    System.out.println("\n");

    Cachorro thor = new Cachorro();
    thor.setNome("Thor");
    thor.setIdade(2);
    thor.setCorDoPelo("Marrom");
    thor.setRaca("Pastor Alemão");
    thor.getNome();
    thor.getIdade();
    thor.getCorDoPelo();
    thor.getRaca();
    
    System.out.println("\n");
  }
}
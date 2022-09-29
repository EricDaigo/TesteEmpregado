public class Empregado{
  private String nome;
  private String sobrenome;
  private Data nascimento;
  private Data admissao;

  public Empregado(String nome, String sobrenome, Data nascimento, Data admissao){
    
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.nascimento = nascimento;
    this.admissao = admissao;
    
  }

  public String toString(){
    return String.format("%s, %s; Admissão: %s; Nascimento: %s", sobrenome, nome, admissao, nascimento);
  }
}
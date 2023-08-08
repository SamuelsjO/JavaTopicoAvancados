package NewFeaturesJava14.NullPointExectpion;

class Aluno {
  private String nome;

  public Aluno() {
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String n) {
    this.nome = n;
  }
}
public class NullPointEx{
  public static void main(String[] args) {
    var aluno = new Aluno();


    var re = aluno.getNome().substring(0,5);

    System.out.println(re);
  }
}

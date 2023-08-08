package NewFeaturesJava15.ClassesSeladas;

final class Coelho extends Herbivoro implements Onivoro{
  public void euSou(){
    System.out.print("Eu sou um coelho, ");
    super.euSou();
  }

  @Override
  public void euTambemSou() {
    System.out.print(" e tbm sou onivoro");
  }
}

package NewFeaturesJava15.ClassesSeladas;

abstract sealed class Carnivoro permits Leao {

  public void euSou(){
    System.out.print(" Eu sou carnivoro. \n");
  }
}

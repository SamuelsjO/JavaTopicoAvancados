package NewFeaturesJava15.ClassesSeladas;

abstract sealed class Herbivoro permits Coelho {
  public void euSou(){
    System.out.print(" Eu sou herbivoro. \n");
  }
}

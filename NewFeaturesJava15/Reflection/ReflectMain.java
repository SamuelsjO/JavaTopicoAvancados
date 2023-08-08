package NewFeaturesJava15.Reflection;

import java.lang.reflect.Field;

public class ReflectMain {
  public static void main(String[] args) {
    var geladeira = new Produto();
    System.out.println(geladeira.getCodigo());


    try {
      //Obter o atributo field da classe
      Field atributo = geladeira.getClass().getDeclaredField("codigo");

      //alterar o modificador de acesso
      atributo.setAccessible(true);

      //Atribuir um novo valor ao atributo
      atributo.set(geladeira, 4567);

      //Imprime um novo valor
      System.out.println(geladeira.getCodigo());
    }catch (Exception e){

    }
  }
}

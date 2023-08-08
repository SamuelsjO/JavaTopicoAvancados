package NewFeaturesJava11.ParamentrosLambdas;

import java.util.function.Function;

public class ParamentroLambdasVarMain {
  public static void main(String[] args) {

    var str1 = "Meu teste de ponto";
    Function<String, String> concat = (var s) -> s + ". ";

    System.out.println(concat.apply(str1));
  }
}

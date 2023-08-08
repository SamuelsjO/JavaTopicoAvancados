package NewFeaturesJava10.InferenciaTipoVariaveisLocais;

import java.util.List;

public class InferenciaDeTiposMain {
  public static void main(String[] args) {

    inferenceTypeVar();
    inferenceTypeVarFOr();
  }

  private static void inferenceTypeVarFOr() {
    var listafrutas  = List.of("banana","maça","goiaba","pera");

    System.out.println();
    System.out.println();
    //Enhaced for
    for(var fru : listafrutas){
      System.out.println(fru);
    }

    System.out.println();
    System.out.println();
    //Indice laço for
    for(var i=0; i < listafrutas.size(); i++){
      System.out.println(listafrutas.get(i));
    }
  }

  private static void inferenceTypeVar() {
    var a1 = "Programando em";

    String a2 = " java";

    System.out.println(a1 + a2);
  }
}

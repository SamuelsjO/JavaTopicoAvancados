package NewFeaturesJava11.NewClasseString;

import java.util.stream.Collectors;

public class ClasseStringsmain {
  public static void main(String[] args) {
    var str1 = "";
    var str2 = "";
    var str3 = "Java topico avancado";
    var str4 = "Java\nTopicos\nAvançados";
    var str5 = "Java metodo repeat ";

    System.out.println("isBlank() verifica se a String é vazia, caso sim retorna true, se tiver informacoes retorna false");

    System.out.println(str1.isBlank());
    System.out.println(str2.isBlank());
    System.out.println(str3.isBlank());

    System.out.println("lines() remove as quebras de linhas e devolve um fluxo unico de caracteres");


    System.out.println(str4);
    System.out.println();
    System.out.println(str4.lines().collect(Collectors.toList()));

    System.out.println("repeat(n) ele repete concatenando a String");
    System.out.println();
    System.out.println(str5.repeat(3));

  }
}

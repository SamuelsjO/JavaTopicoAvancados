package NewFeaturesJava12.NewFeatStrings;

public class StringTrasformMain {
  public static void main(String[] args) {

    var texto = "Ola mundo!\nEste é o mudolo java12";

    var textoInvertido = texto.transform(s -> new StringBuilder(s).reverse().toString());

    System.out.println(textoInvertido);


  }
}

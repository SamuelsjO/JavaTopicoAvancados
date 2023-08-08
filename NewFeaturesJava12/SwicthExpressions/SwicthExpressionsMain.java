package NewFeaturesJava12.SwicthExpressions;

import java.util.Scanner;

public class SwicthExpressionsMain {
  public static void main(String[] args) {
    switchTradicional();
    switchExpressions();

  }

  private static void switchExpressions(){
    System.out.println("Digite o dia da Semana: ");
    Scanner input = new Scanner(System.in);

    var dia = input.nextLine();

    var resultado = switch (dia){
      case "segunda","terca", "quarta", "quinta", "sexta"  -> "dia util";
      case "sabado", "domingo" -> "Fim de semana";
      default -> "dia invalido";
    };

    System.out.println(resultado);
  }

  private static void switchTradicional() {
    System.out.println("Digite o dia da Semana: ");
    Scanner input = new Scanner(System.in);

    var dia = input.nextLine();

    input.close();
    var resultado = "";
    switch (dia) {
      case "segunda":
        resultado =  "dia util";
      case "terça":
        resultado =  "dia util";
      case "quarta":
      case "quinta":
        resultado =  "dia util";
        resultado =  "dia util";
      case "sexta":
        resultado =  "dia util";
      case "sabado":
        resultado =  "Fim de semana";
      case "domingo":
        resultado =  "Fim de semana";
        break;
      default:
        resultado = "Dia Invalido";
    }

    System.out.println(resultado);
  }
}

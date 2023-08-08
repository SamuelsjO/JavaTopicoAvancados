package NewFeaturesJava8.lambdaExpression;


interface Figura {
  void desenha();
}

public class Exemplo01 {

  public static void main(String[] args) {

    Figura fig1 = new Figura() {
      @Override
      public void desenha() {
        System.out.println("Desenha a figura 01");
      }
    };

    fig1.desenha();


    //Com lambda expression
    Figura fig2 = () -> System.out.println("Desenha a figura 02");

    fig2.desenha();
  }

}

package NewFeaturesJava8.MethodReference;

interface Figura2D01{
  Retangulo01 desenha(Double largura, Double altura);
}

class Retangulo01 {
  public Retangulo01(Double largura, Double altura){
    System.out.println("Desenha retangulo de largura: " + largura + " e altura: " + altura);
  }

}
public class Exemplo02 {
  public static void main(String[] args){

    Figura2D01 fig01 = Retangulo01::new;
    fig01.desenha(10.0, 2.5);
  }

}

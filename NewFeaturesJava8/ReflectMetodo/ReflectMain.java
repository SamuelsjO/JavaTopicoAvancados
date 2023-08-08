package NewFeaturesJava8.ReflectMetodo;

import java.lang.reflect.Method;

public class ReflectMain {
  public static void main(String[] args) {

    //Instancia da classe productoReflect
    var p = new ProductReflect("Geladeira", 3000.00);

    //Instancia da class Class
    var cl = p.getClass();

    //Todos os metodos declarados na classe produto
    Method[] methods = cl.getDeclaredMethods();

    for(Method m : methods){
      System.out.println(m.getName());

      var parameter = m.getParameters();

      for (var pr : parameter){
        System.out.println(pr);
      }
    }

  }
}

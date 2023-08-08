package NewFeaturesJava8.lambdaExpression;

public class ExemploThread {
  public static void main(String[] args) {


    var t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Thread 1 em execuçao");
      }
    });

    t1.start();


    //Com lambda expression
    Thread t2 = new Thread(() -> System.out.println("Thread 2 em execuçao"));

    t2.start();
  }
}


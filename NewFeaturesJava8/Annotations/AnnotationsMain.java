package NewFeaturesJava8.Annotations;

public class AnnotationsMain {
  public static void main(String[] args) {
    var volts = ProductAnnotatios.class.getAnnotationsByType(Voltagem.class);

    for(var v : volts){
      System.out.println(v.tensao() + " - " + v.litros());
    }
  }
}

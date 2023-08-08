package NewFeaturesJava8.Annotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Voltagens.class)
@interface Voltagem {
  String tensao();
  String litros();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Voltagens{
  Voltagem[] value();
}

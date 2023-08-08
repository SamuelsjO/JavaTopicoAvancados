package NewFeaturesJava8.JavaScriptNashorn;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaScritpMain {
  public static void main(String[] args) {

    ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
    var bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);

    try {

      ee.eval(new FileReader("olamundo.js"));

    } catch (ScriptException e) {
      throw new RuntimeException(e);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}

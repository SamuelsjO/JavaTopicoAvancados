package NewFeaturesJava8.Optional;


public class ExemploMainOptional {
  public static void main(String[] args) {

    Curso cursoAdm = new Curso("Ciencia da Computacao");

    Aluno jose = new Aluno("José");
    jose.setMatricula(new Matricula("11100"));
    cursoAdm.getListaAlunos().add(jose);

    Aluno maria = new Aluno("Maria");
    maria.setMatricula(new Matricula("11200"));
    cursoAdm.getListaAlunos().add(maria);


    Aluno pedro = new Aluno("Pedro");
    pedro.setMatricula(new Matricula("11300"));
    cursoAdm.getListaAlunos().add(pedro);


    Aluno ana = new Aluno("Ana");
    //ana.setMatricula(new Matricula("11400"));
    cursoAdm.getListaAlunos().add(ana);


    Aluno paulo = new Aluno("Paulo");
    paulo.setMatricula(new Matricula("11500"));
    cursoAdm.getListaAlunos().add(paulo);


    cursoAdm.getListaAlunos().stream()
        .filter(a -> a.getMatricula().isPresent())
        .forEach(a -> System.out.println(a.getNome() + " - " + a.getMatricula().get().getNumero()));

  }
}

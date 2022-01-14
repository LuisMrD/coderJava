package Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Match {

    public static void main(String[] args){

        Aluno a1 = new Aluno("Luis", 7);
        Aluno a2 = new Aluno("Felipe", 6);
        Aluno a3 = new Aluno("Ana", 9);
        Aluno a4 = new Aluno("Carolina", 5);
        Aluno a5 = new Aluno("Heitor", 8);
        Aluno a6 = new Aluno("Augusto", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = a -> a.nota >= 1;
        Predicate<Aluno> reprovado = aprovado.negate();

        UnaryOperator<Aluno> getAlunos = a -> a;

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));

        System.out.println(alunos.stream().anyMatch(reprovado));


        Stream<Aluno> alunosReprovados = alunos.stream().anyMatch(reprovado) ? alunos.stream().filter(reprovado) : null;

        //melhor pratica eh n fazer o ternario, tell dont ask ! depois posso checar o size do stream com count

        Stream<Aluno> reprovados = alunos.stream().filter(reprovado);

        System.out.println(reprovados.count());


    }
}

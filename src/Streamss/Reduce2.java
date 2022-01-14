package Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {


    public static void main(String[] args){

        Aluno a1 = new Aluno("Luis", 7);
        Aluno a2 = new Aluno("Felipe", 6);
        Aluno a3 = new Aluno("Ana", 9);
        Aluno a4 = new Aluno("Carolina", 5);
        Aluno a5 = new Aluno("Heitor", 8);
        Aluno a6 = new Aluno("Augusto", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        //Predicate<Aluno> aprovado = a -> a.nota >= 7;

        Function<Aluno, Integer> nota = a -> a.nota;

        BinaryOperator<Integer> soma = (a, n) -> a + n;

        Integer notasSomadas = alunos.stream().filter(a -> a.nota >= 7).map(nota).reduce(soma).get();


        alunos.stream().filter(a -> a.nota >= 7).map(nota).reduce(soma).ifPresent(System.out::println);


    }
}

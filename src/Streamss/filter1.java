package Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class filter1 {

    public static void main(String[] args){

        Aluno a1 = new Aluno("Luis", 7);
        Aluno a2 = new Aluno("Felipe", 6);
        Aluno a3 = new Aluno("Carol", 8);
        Aluno a4 = new Aluno("Ana", 4);
        Aluno a5 = new Aluno("Heitor", 9);
        Aluno a6 = new Aluno("Augusto", 5);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);

        Predicate<Aluno> verificaNota = a -> a.nota >= 7;

        Function<Aluno, String> saudacao = a -> a.nome.equals("Ana") || a.nome.equals("Carol") ? a.nome + ", parabens ! Voce foi aprovada !\n" : a.nome + ", parabens ! Voce foi aprovado !\n";

        alunos.stream().filter(verificaNota).map(saudacao).forEach(System.out::println);





    }
}

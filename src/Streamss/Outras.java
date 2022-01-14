package Streamss;

import java.util.Arrays;
import java.util.List;

public class Outras {

    public static void main(String[] args){

        Aluno a1 = new Aluno("Luis", 7);
        Aluno a1d = new Aluno("Luis", 7);
        Aluno a2 = new Aluno("Felipe", 6);
        Aluno a3 = new Aluno("Ana", 9);
        Aluno a4 = new Aluno("Carolina", 5);
        Aluno a4d = new Aluno("Carolina", 5);
        Aluno a5 = new Aluno("Heitor", 8);
        Aluno a6 = new Aluno("Augusto", 10);
        Aluno a6d= new Aluno("Augusto", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a1d, a4d, a6d);

        //para distinct funcionar eh preciso implementar equals e hashcode
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println();

        //sem o limit, ele faz o skip, mas exibe todos os valores
        alunos.stream().skip(3).limit(3).forEach(System.out::println);

        System.out.println();

        //vai pegando ateh encontrar a condicao
        alunos.stream().takeWhile(a -> a.nota < 9).forEach(System.out::println);
    }
}

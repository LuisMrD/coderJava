package Streamss;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MInMax {

    public static void main(String[] args){

        Aluno a1 = new Aluno("Luis", 7);
        Aluno a2 = new Aluno("Felipe", 6);
        Aluno a3 = new Aluno("Ana", 9);
        Aluno a4 = new Aluno("Carolina", 5);
        Aluno a5 = new Aluno("Heitor", 8);
        Aluno a6 = new Aluno("Augusto", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Comparator<Aluno> maiorNota = (al1, al2) -> {
            if(al1.nota > al2.nota) return 1;
            if(al1.nota < al2.nota) return -1;
            return 0;
        };

        //eh preciso implementar toString na classe
        System.out.println(alunos.stream().max(maiorNota).get());
        System.out.println(alunos.stream().min(maiorNota).get());
    }
}

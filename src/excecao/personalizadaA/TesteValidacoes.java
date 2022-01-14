package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args){

        Aluno aluno = new Aluno("Luis", -1);
        Aluno aluno2 = new Aluno("", -1);

        try {
            Validar.aluno(aluno);
        } catch (StringVaziaException | NumeroNegativoException e) {
            //e.printStackTrace();
            e.getMessage();
        } //posso lancar aqui, outro catch aninhado

        try {
            Validar.aluno(aluno2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Final =D");

    }
}

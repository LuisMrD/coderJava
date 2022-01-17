package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args){

        Aluno aluno = new Aluno("Luis", -1);
        Aluno aluno2 = new Aluno("", -1);

        try {
            Validar.aluno(aluno);
        } catch (NumeroNegativoException e) {
            //e.printStackTrace();
            e.getMessage();
        } //posso lancar aqui, outro catch aninhado
        catch (StringVaziaException e) {
            e.printStackTrace();
        }

        try {
            Validar.aluno(aluno);
        } catch (NumeroNegativoException | StringVaziaException e) {
            e.getMessage();
        }

        System.out.println("Final =D");

    }
}

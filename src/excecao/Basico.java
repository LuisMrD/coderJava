package excecao;

import Streamss.Aluno;

public class Basico {

    public static void main(String[] args){


        //surround with tryCatch, ctrl + alt + t -> 6
        try {
            System.out.println(7/0);
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }

        Aluno a1 = null;

        try {
            imprimirNome(a1);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Erro ao tentar imprimir nome usuario");
        }


        System.out.println("Final :D");

    }

    public static void imprimirNome(Aluno a){
        System.out.println(a.nome);
    }
}

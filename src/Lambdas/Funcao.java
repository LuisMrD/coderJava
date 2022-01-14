package Lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args){

        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "par" : "impar";

        System.out.println(parOuImpar.apply(31));

        Function<String, String> apresentaResultado = res -> "O resultado eh: " + res;

        System.out.println();

        System.out.println(
                parOuImpar.andThen(apresentaResultado).apply(30)
        );

        System.out.println();

        Function<String, String> comExlamacoes = string -> string + " !!!";

        System.out.println(
                parOuImpar
                        .andThen(apresentaResultado)
                        .andThen(comExlamacoes)
                        .apply(61)
        );

    }
}

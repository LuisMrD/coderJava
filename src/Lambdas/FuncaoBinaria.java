package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FuncaoBinaria {

    public static void main(String[] args){

        BinaryOperator<Integer> calcMedia = (n1, n2) -> n1 + n2 / 2;

        BiFunction<Integer, Integer, String> statusMedia = (n1, n2) -> {
            Integer media =  n1 + n2 / 2;
            return media >= 7 ? "Aprovado" : "Reprovado";
        };

        Function<Integer, String> statusAprovacao = media -> media >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(calcMedia.apply(8,7));
        System.out.println();

        System.out.println(statusMedia.apply(5,8));
        System.out.println();

        System.out.println(calcMedia.andThen(statusAprovacao).apply(8,7));

    }
}

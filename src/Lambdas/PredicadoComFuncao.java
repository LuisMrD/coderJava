package Lambdas;

import java.util.function.Predicate;

public class PredicadoComFuncao {

    public static void main(String[] args){

        Predicate<Integer> isPar = num -> num % 2 == 0 ? true : false;

        Predicate<Integer> haveThreeDigits = num -> num > 99 ? true : false;

        System.out.println(isPar.and(haveThreeDigits).test(125));
        System.out.println(isPar.and(haveThreeDigits).test(126));

        System.out.println(isPar.or(haveThreeDigits).test(26));
        System.out.println(isPar.or(haveThreeDigits).test(121));

        System.out.println(isPar.or(haveThreeDigits).negate().test(121));
    }
}

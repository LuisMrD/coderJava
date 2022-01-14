package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args){

        BinaryOperator<Integer> somar = (x, y) -> x + y;

        System.out.println(somar.apply(3,6));








    }
}

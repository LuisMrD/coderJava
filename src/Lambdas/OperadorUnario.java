package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args){

        UnaryOperator<Integer> somaDois = n -> n + 2;
        UnaryOperator<Integer> multiplica = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        System.out.println(
                somaDois
                .andThen(multiplica)
                .andThen(aoQuadrado)
                .apply(0)
        );

        //compose eh o contrario de and then, comeca de tras para a frente

        System.out.println(
                aoQuadrado
                        .compose(multiplica)
                        .compose(somaDois)
                        .apply(0)
        );

    }
}

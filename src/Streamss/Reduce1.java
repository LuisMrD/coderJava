package Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7 ,8 ,9 );

        BinaryOperator<Integer> somar = (acmltr, n) -> acmltr + n;

        int soma = nums.stream().reduce(somar).get();
        Integer somados = nums.stream().reduce(100, somar);


        System.out.println(nums.stream().reduce(somar).get());

        System.out.println();

        System.out.println(soma);
        System.out.println(somados);

        nums.stream().filter(n -> n > 5).reduce(somar).ifPresent(System.out::println);
    }
}

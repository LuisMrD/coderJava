package Streamss;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Desafio {

    public static void main(String[] args){

        /*
        UnaryOperator<String> reverse = (s) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            return sb.reverse().toString();
        };
        */

        UnaryOperator<String> reverse = s -> new StringBuilder(s).reverse().toString();

        Function<String, Integer> toInt = n -> Integer.parseInt(String.valueOf(n), 2);

        Function<Integer, String> toBinary = Integer::toBinaryString;

        List<Integer> nums = Arrays.asList(1 , 2, 3, 4, 5, 6, 7, 8, 9);

        nums.stream().map(toBinary).map(reverse).map(toInt).forEach(System.out::println);

    }
}

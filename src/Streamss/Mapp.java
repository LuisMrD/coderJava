package Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Mapp {

    public static void main(String[] args){

        List<String> pokemons = Arrays.asList("squiRtle", "charMander", "buLbassaur");

        UnaryOperator<String> getName = n -> Character.toString(n.charAt(0)).toUpperCase() + n.substring(1).toLowerCase();

        System.out.println();

        pokemons.stream().map(getName).forEach(System.out::println);

    }
}

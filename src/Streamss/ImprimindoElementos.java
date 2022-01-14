package Streamss;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ImprimindoElementos {

    public static void main(String[] args){

        List<String> nomes = Arrays.asList("Carol", "Heitor", "Luis");

        for(String nome : nomes){
            System.out.println(nome);
        }

        Consumer<String> listarNomes = (n) -> System.out.println(n);

        System.out.println();

        nomes.forEach(listarNomes);

        System.out.println();

        Iterator<String> it = nomes.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

        Stream<String> stream = nomes.stream();
        stream.forEach(System.out::println);
    }
}

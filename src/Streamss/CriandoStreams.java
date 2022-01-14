package Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static  void main(String[] args){

        Consumer<String> print = System.out::println;

        Stream<String> nomes = Stream.of("Heitor ", "Carol ", "Luis \n");
        nomes.forEach(System.out::println);

        String[] nomes2 = { "Augusto ", "Ana ", "Felipe \n"};

        Stream.of(nomes2).forEach(System.out::println);

        Arrays.stream(nomes2).forEach(System.out::println);

        Arrays.stream(nomes2, 1,2).forEach(System.out::println);
        Arrays.stream(nomes2, 0,1).forEach(System.out::println);

        List<String> langs = Arrays.asList("Joao", "Pedro", "Marcos");

        langs.parallelStream().forEach(System.out::println);



    }
}

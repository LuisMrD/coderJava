package Lambdas;

import java.util.Arrays;
import java.util.List;

public class LambdaForEach {

    public static void main(String[] args){

        List<String> nomes = Arrays.asList("Luis", "Carol", "Heitor");

        nomes.forEach( nome -> System.out.println(nome));

        System.out.println("Segunda forma");

        nomes.forEach(System.out::println);

        System.out.println("Chamando metodo statico");

        nomes.forEach( nome -> chamarPeloNome(nome));

        System.out.println("Chamando na versao reduzida");

        nomes.forEach(LambdaForEach::chamarPeloNome);

    }

    static void chamarPeloNome(String nome){
        System.out.println(nome + " ! ");
    }


}

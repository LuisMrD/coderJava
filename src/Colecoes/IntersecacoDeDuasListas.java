package Colecoes;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersecacoDeDuasListas {

    public static void main(String[] args){

        List<String> list = Arrays.asList("red", "blue", "blue", "green", "red");
        List<String> otherList = Arrays.asList("red", "green", "green", "yellow");

        Set<String> result = list.stream()
                .distinct()
                .filter(otherList :: contains)
                .collect(Collectors.toSet());


        for(String res : result){

            System.out.println(res);

        }
    }

}

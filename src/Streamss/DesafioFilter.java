package Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args){

        Predicate<Pokemon> typeFire = p -> p.tipo.equals("fire");
        Predicate<Pokemon> typeWater = p -> p.tipo.equals("water");
        Predicate<Pokemon> typeEletric = p -> p.tipo.equals("eletric");

        Predicate<Pokemon> evolved = p -> p.estagioEvolucao > 1;
        Predicate<Pokemon> notEvolved = p -> p.estagioEvolucao == 1;

        Function<Pokemon, String> avaiablePokemons = p -> p.nome + " esta disponivel !\n";

        Pokemon p1 = new Pokemon("Squirtle", "water", 1);
        Pokemon p2 = new Pokemon("Charmander", "fire", 1);
        Pokemon p3 = new Pokemon("Ponita", "fire", 1);
        Pokemon p4 = new Pokemon("Picachu", "eletric", 1);
        Pokemon p5 = new Pokemon("Raichu", "eletric", 2);
        Pokemon p6 = new Pokemon("Charizard", "fire", 3);
        Pokemon p7 = new Pokemon("Electabuzz", "eletric", 1);
        Pokemon p8 = new Pokemon("Blastoise", "water", 3);
        Pokemon p9 = new Pokemon("Guiarados", "water", 2);
        Pokemon p10 = new Pokemon("Magikarp", "water", 1);

        List<Pokemon> pokemons = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);

        pokemons.stream().filter(typeWater).filter(evolved).map(avaiablePokemons).forEach(System.out::println);
        pokemons.stream().filter(typeFire).filter(notEvolved).map(avaiablePokemons).forEach(System.out::println);


    }
}

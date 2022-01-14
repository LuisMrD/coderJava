package Streamss;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio2 {

    public static void main(String[] args){

        Predicate<Produto> descontoPromocional = p -> p.desconto > 0.05;

        Predicate<Produto> freteGratis = p -> p.freteGratis;

        Function<Produto, String> produtosDestaque = p -> "Produto em destaque: " + p.nome;

        Produto p1 = new Produto("jogo de xadrez", 60.90, 0.1, true);
        Produto p2 = new Produto("jogo de domino", 20.90, 0.05, true);
        Produto p3 = new Produto("zombicide", 600.90, 0.15, false);
        Produto p4 = new Produto("terra mystica", 400.90, 0.05, false);
        Produto p5 = new Produto("uno", 10.90, 0.05, true);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);

        produtos.stream().filter(descontoPromocional).filter(freteGratis).map(produtosDestaque).forEach(System.out::println);

    }
}


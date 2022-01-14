package Lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args){

        Predicate<Produto> isCheap = prod -> (prod.preco * ( 1 - prod.desconto)) <= 2700;

        Produto produto = new Produto(2500.99, .05, "Notebook");

        System.out.println(isCheap.test(produto));



    }
}

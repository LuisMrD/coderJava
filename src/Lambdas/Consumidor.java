package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> showName = p -> System.out.println(p.nome);

        Produto prod1 = new Produto(150, .10, "Caneta");
        Produto prod2 = new Produto(150, .10, "Caderno");
        Produto prod3 = new Produto(150, .10, "Lapis");
        Produto prod4 = new Produto(150, .10, "Borracha");

        List<Produto> produtos = Arrays.asList(prod1, prod2, prod3, prod4);

        produtos.forEach(showName);
    }
}


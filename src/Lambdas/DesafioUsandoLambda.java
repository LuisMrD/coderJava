package Lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioUsandoLambda {

    public static void main(String[] args){


        Function<Produto, Double> precoComDesconto = (p) -> p.preco * (1 - p.desconto);

        UnaryOperator<Double> valorComImposto = (valorProduto) -> valorProduto >= 2500 ? valorProduto * (1 + .085) : valorProduto;

        UnaryOperator<Double> valorComFrete = (valorProduto) -> valorProduto >= 3000 ? valorProduto + 100.0 : valorProduto + 50.0;

        Function<Double, String> formatarValor = (valorFinal) -> String.format("RS %.2f", valorFinal).replace(",",".");

        Produto p = new Produto(3235.89, 0.13, "Ipad");

        // Double.parseDouble(String.format("%.2f", valorProduto))

        System.out.println(
                precoComDesconto
                        .andThen(valorComImposto)
                        .andThen(valorComFrete)
                        .andThen(formatarValor)
                        .apply(p)
        );

    }
}

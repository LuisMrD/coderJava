package Streamss;

public class Produto {

   public final String nome;
   public final double preco;
   public final double desconto;
   public final boolean freteGratis;

    public Produto(String nome, double preco, double desconto, boolean freteGratis) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.freteGratis = freteGratis;
    }
}

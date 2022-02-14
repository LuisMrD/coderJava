package modelo.basico.umpramuitos;

import modelo.basico.Produto;

import javax.persistence.*;

@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private Double preco;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    private Produto produto;

    public ItemPedido(){}

    public ItemPedido(Pedido pedido, Produto produto, Integer quantidade) {
        this.setQuantidade(quantidade);
        this.setProduto(produto);
        this.setPedido(pedido);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;

        if( produto != null && this.preco == null){
            this.setPreco(produto.getPreco());
        }
    }
}

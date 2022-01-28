package modelo.basico;

import javax.persistence.*;

@Entity
@Table(name = "tb_prod")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    Long id;

    @Column(name = "prod_nome")
    String nome;

    //por padrao o length eh 255
    @Column(name = "prod_descr", length = 500)
    String descricao;

    //precision eh o numero de digitos
    //scale acho que sao os numeros antes da virgula ?
    @Column(name = "prod_preco", precision = 10, scale = 2)
    Double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}

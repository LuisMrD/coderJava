package modelo.basico.muitospramuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "tb_atores")
public class Ator2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "atores", cascade = CascadeType.PERSIST)
    List<Filme2> filmes;

    public Ator2(){}

    public Ator2(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Filme2> getFilmes() {
        if( filmes == null){
            filmes = new ArrayList<>();
        }
        return filmes;
    }

    public void setFilmes(List<Filme2> filmes) {
        this.filmes = filmes;
    }
}

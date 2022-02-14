package modelo.basico.muitospramuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_atores")
public class Filme2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "tb_filmes_atores",
            joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id")
    )
    List<Ator2> atores;

    public Filme2(){}

    public Filme2(String nome) {
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

    public List<Ator2> getAtores() {
        if( atores == null){
            atores = new ArrayList<>();
        }
        return atores;
    }

    public void setAtores(List<Ator2> atores) {
        this.atores = atores;
    }

    public void incluirAtor(Ator2 ator){
        if( ator != null && !getAtores().contains(ator) ){

            getAtores().add(ator);
            if( !ator.getFilmes().contains(this) ){
                ator.getFilmes().add(this);
            }
        }
    }
}

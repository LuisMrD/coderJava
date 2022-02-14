package modelo.basico.muitospramuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "filmes_atores",
            joinColumns = @JoinColumn( name = "filme_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn( name = "ator_id", referencedColumnName = "id")
    )
    List<Ator> atores = new ArrayList<>();

    public Filme(){}

    public Filme(String nome) {
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

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public void adicionarAtor(Ator ator){
        if(ator != null && !getAtores().contains(ator)){
            getAtores().add(ator);

            if(!ator.getFilmes().contains(this)){
                ator.getFilmes().add(this);
            }
        }
    }
}

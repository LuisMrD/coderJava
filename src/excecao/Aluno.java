package excecao;

import java.util.Objects;

public class Aluno {

    public final String nome;
    public final int nota;

    public Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String toString(){
        return this.nome + ", nota:" + this.nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return nota == aluno.nota && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }
}

package teste.basico.muitospramuitos;

import infra.DAO;
import infra.DAO2;
import modelo.basico.muitospramuitos.Ator;
import modelo.basico.muitospramuitos.Filme;

import java.util.Objects;

public class NovoFilmeAtor {

    public static void main(String[] args) {

        Filme filmeA = new Filme("Star Wars: O retorno do Jedi");
        Filme filmeB = new Filme ("Indiana Jones: A arca perdida");

        Ator atorA = new Ator("Harrison Ford");
        Ator atorB = new Ator("Carry Fisher");

        filmeA.getAtores().add(atorA);
        filmeA.getAtores().add(atorB);

        filmeB.getAtores().add(atorA);

        DAO<Filme> dao = new DAO<>();
        dao.incluirAtomico(filmeA);

    }
}

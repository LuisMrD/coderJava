package teste.basico.muitospramuitos;

import infra.DAO;
import modelo.basico.muitospramuitos.Ator2;
import modelo.basico.muitospramuitos.Filme2;

public class NovoFilmeAtor2 {

    public static void main(String[] args) {

        Filme2 filmeA = new Filme2("Star wars");
        Filme2 filmeB = new Filme2("Indiana Jones");

        Ator2 atorA = new Ator2("Harrison Ford");
        Ator2 atorB = new Ator2("Carry Fisher");

        filmeA.getAtores().add(atorA);
        filmeA.getAtores().add(atorB);

        filmeB.getAtores().add(atorB);

        DAO<Filme2> dao = new DAO<>();

        dao.incluirAtomico(filmeA);


    }
}

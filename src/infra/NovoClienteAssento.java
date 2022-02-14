package infra;

import modelo.basico.umpraum.Assento;
import modelo.basico.umpraum.Cliente;

public class NovoClienteAssento {

    public static void main(String[] args) {

        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Luis", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(cliente);

    }
}

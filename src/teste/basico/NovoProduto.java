package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

    public static void main(String[] args) {

        Produto prod1 = new Produto();
        prod1.setNome("Mouse Razer");
        prod1.setDescricao(("Mouse Gamer"));
        prod1.setPreco(300.00);

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.abrirT().incluir(prod1).fecharT().fecharConn();

    }
}

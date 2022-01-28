package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

import java.util.List;


public class NovoProdutoDAO {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();

        List<Produto> produtos = dao.obterUsuarios(10,0);

        for(Produto prod : produtos){
            System.out.println(prod);
        }

        double precoTotal = produtos
                .stream()
                .map( p -> p.getPreco())
                .reduce(0.0, (t, p) -> t + p)
                .doubleValue();

        System.out.println("Valor total: "+ precoTotal);

        dao.fecharConn();

    }

}

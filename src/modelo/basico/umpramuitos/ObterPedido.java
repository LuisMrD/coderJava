package modelo.basico.umpramuitos;

import infra.DAO;

public class ObterPedido {

    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);

        for(ItemPedido item: pedido.getItems()){
            System.out.println(item.getQuantidade());
        }

        dao.fecharConn();
    }

}

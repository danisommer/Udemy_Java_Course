package teste.basico;

import java.util.List;
import course.infra.ProdutoDAO;
import course.infra.basico.Produto;

public class ObterProdutos {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for(Produto produto: produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
        }

        double total = produtos.stream().map(p -> p.getPreco()).reduce(0.0, (t, p)  -> t + p).doubleValue();

        System.out.println("Total: R$" + total);

        dao.fechar();

    }

}

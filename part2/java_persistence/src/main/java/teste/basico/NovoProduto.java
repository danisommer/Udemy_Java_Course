package teste.basico;

import course.infra.DAO;
import course.infra.basico.Produto;

public class NovoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 7.45);

        DAO<Produto> dao = new DAO<>(Produto.class);

        dao.incluirAtomico(produto).fechar();

        System.out.println("ID do produto: " + produto.getId());

    }
}

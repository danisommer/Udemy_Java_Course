package teste.basico;

import course.infra.DAO;
import course.infra.basico.Assento;
import course.infra.basico.Cliente;

public class NovoClienteAssento {
    public static void main(String[] args) {
        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Julia", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(cliente);
    }
}

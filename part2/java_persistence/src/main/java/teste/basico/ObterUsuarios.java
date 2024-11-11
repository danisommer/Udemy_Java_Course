package teste.basico;

import modelo.basico.Usuario;
import org.hibernate.tool.hbm2ddl.UniqueConstraintSchemaUpdateStrategy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("java_persistence");
        EntityManager em = emf.createEntityManager();

        List<Usuario> usuarios = em
                .createQuery("select u from Usuario u", Usuario.class)
                .setMaxResults(5)
                .getResultList();

        for(Usuario usuario: usuarios) {
            System.out.println("ID: " + usuario.getId()
            + " Email: " + usuario.getEmail());
        }

        em.close();
        emf.close();
    }
}

package teste.basico;

import course.infra.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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

package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import course.infra.basico.Usuario;

public class ObterUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("java_persistence");
        EntityManager em = emf.createEntityManager();

        try {
            Usuario usuario = em.find(Usuario.class, 3L);
            System.out.println(usuario.getNome());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        em.close();
        emf.close();
    }
}

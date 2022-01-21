package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1P {

    public static void main(String[]args){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario user = em.find(Usuario.class, 4L);

        user.setNome("CharliePlay");
        user.setEmail("charlie@mail.com");

        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}

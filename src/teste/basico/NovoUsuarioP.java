package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuarioP {

    public static void main(String[]args){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario newUser = new Usuario("Carol", "carol@mail.com");

        em.getTransaction().begin();
        em.persist(newUser);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}

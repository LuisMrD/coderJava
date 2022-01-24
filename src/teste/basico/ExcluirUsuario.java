package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExcluirUsuario {

    public static void main(String[] args){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usr = em.find(Usuario.class, 1L);

        em.getTransaction().begin();
        em.remove(usr);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}

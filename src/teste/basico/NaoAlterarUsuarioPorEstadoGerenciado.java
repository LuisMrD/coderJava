package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NaoAlterarUsuarioPorEstadoGerenciado {

    public static void main(String[] args){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usr = em.find(Usuario.class, 1L);
        usr.setNome("Luis");

        em.detach(usr);

        //se nao fosse o detach, o commit abaixo funcionaria, mesmo sem o merge
        //em.merge(usr);

        em.getTransaction().commit();

        em.close();
        emf.close();




    }
}

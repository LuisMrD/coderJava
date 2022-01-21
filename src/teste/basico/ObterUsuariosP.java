package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuariosP {

    public static void main(String[] args){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");

        EntityManager em = emf.createEntityManager();

        String jpql = "select u from Usuario u";

        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);

        List<Usuario> usuarios = query.getResultList();

        usuarios.forEach( u -> System.out.println(u.getId() + ":" + u.getNome()));

        em.close();
        emf.close();


    }
}

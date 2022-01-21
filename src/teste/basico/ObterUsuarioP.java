package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuarioP {

    public static void main(String[]args){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");

        EntityManager em = emf.createEntityManager();

        Usuario user = em.find(Usuario.class, 5L);

        System.out.println(user);

        em.close();
        emf.close();
    }
}

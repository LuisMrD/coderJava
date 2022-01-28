package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO2<E> {

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public DAO2(){
        this(null);
    }

    public DAO2(Class<E> classe) {
        em = emf.createEntityManager();
        this.classe = classe;
    }

    public DAO2<E> startTransaction(){
        em.getTransaction().begin();
        return this;
    }

    public DAO2<E> endTransaction(){
        em.getTransaction().commit();
        return this;
    }

    public DAO2<E> persist(Class<E> entidade){
        em.persist(entidade);
        return this;
    }

    public void closeTrsc(){
        em.close();
    }

    public List<E> getMoreThanOne(){
        String jpql = "select u from " + classe.getName() + " as u";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        return query.getResultList();
    }

    public E getOneById(Long id){
        return em.find(classe, id);
    }





}

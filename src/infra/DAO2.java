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

    public DAO2(Class<E> classe){
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO2(){
        this(null);
    }

    public DAO2<E> startTransaction(){
        em.getTransaction().begin();
        return this;
    }

    public DAO2<E> finishTransaction(){
        em.getTransaction().commit();
        return this;
    }

    public DAO2<E> persistData(E entidade){
        em.persist(entidade);
        return this;
    }

    public List<E> getMoreThanOneResult(int limit, int offset){
        String jpql = "select u from "+ classe +" as u";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(limit);
        query.setFirstResult(offset);
        return query.getResultList();
    }

    public E getDataById(Long id){
        return em.find(classe, id);
    }


}

package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO<E> {

    private static EntityManagerFactory emf;
    private final EntityManager em;
    private final Class<E> classe;

    static{
        try {
            emf = Persistence.createEntityManagerFactory("exericicios-jpa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public DAO(){
        this(null);
        //emf = Persistence.createEntityManagerFactory("exericicios-jpa");
    }

    public DAO(Class<E> classe){
        this.classe = classe;
        //emf = Persistence.createEntityManagerFactory("exericicios-jpa");
        em = emf.createEntityManager();
    }

    public DAO<E> abrirT(){
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> fecharT(){
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> incluir(E entidade){
        em.persist(entidade);
        return this;
    }

    public DAO<E> incluirAtomico(E entidade){
        return this.abrirT().incluir(entidade).fecharT();
    }

    public List<E> obterUsuarios(int limit, int offset){
        String jpql = "select u from "+ classe.getName() +" as u";
        TypedQuery<E> query = em.createQuery(jpql, classe);
        query.setMaxResults(limit);
        query.setFirstResult(offset);
        return query.getResultList();
    }

    public E obterPorID(Long id){
        return em.find(classe, id);
    }

    public void fecharConn(){
        em.close();
    }


}

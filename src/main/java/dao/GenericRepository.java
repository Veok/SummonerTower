package dao;

import dao.repositories.IGenericRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author Lelental on 26.02.2017.
 */
@SuppressWarnings("unchecked")
@Repository
public abstract class GenericRepository<T, K extends Serializable> implements IGenericRepository<T, K> {


    private Class<T> entityClass;

    @PersistenceContext
    private EntityManager entityManager;

    public GenericRepository() {

        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        entityClass = (Class) pt.getActualTypeArguments()[0];
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public List<T> findAll() {
        return getEntityManager().createQuery("from" + entityClass.getName()).getResultList();
    }

    public void update(T entity) {
        getEntityManager().merge(entity);
    }


    public void delete(T entity) {
        getEntityManager().remove(entity);
    }

    public void add(T entity) {
        getEntityManager().persist(entity);
    }

    public T find(K key) {
        return getEntityManager().find(entityClass, key);
    }
}

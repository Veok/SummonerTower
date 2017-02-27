package dao.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

/**
 * @author Lelental on 26.02.2017.
 */
public abstract class AbstractDao<T extends Serializable> {


    private Class<T> entityClass;

    @PersistenceContext
    private EntityManager entityManager;

    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public T findOne(long id) {
        return entityManager.find(entityClass, id);
    }

    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return entityManager.createQuery("from" + entityClass.getName())
                .getResultList();
    }

    public void save(T entity) {
        entityManager.persist(entity);
    }

    public T update(T entity) {
        return entityManager.merge(entity);
    }

    public void delete(T entity) {
        entityManager.remove(entity);
    }

    public void deleteById(long id) {
        T entity = findOne(id);
        delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<T> findByText(String text, String columnName) {
        return entityManager.createQuery("from" + entityClass.getName() + "where" + columnName + "=" + text).getResultList();
    }


}

package dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.List;

/**
 * @author Lelental on 26.02.2017.
 */
@Repository
@Transactional
public class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {

    private Class<T> type;

    @PersistenceContext
    private EntityManager entityManager;

    public GenericDaoImpl() {
    }

    public GenericDaoImpl(Class<T> type) {
        this.type = type;
    }

    public PK create(T newInstance) {
        entityManager.persist(newInstance);
        return (PK) entityManager.merge(newInstance);
    }

    public T read(PK id) {
        return entityManager.find(type, id);
    }

    public void update(T transientObject) {
        entityManager.merge(transientObject);
    }

    public void delete(T persistentObject) {
        entityManager.remove(persistentObject);
    }

    public List<T> getAll() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(type);
        Root<T> root = criteriaQuery.from(type);
        CriteriaQuery<T> all = criteriaQuery.select(root);
        TypedQuery<T> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }
}

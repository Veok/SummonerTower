package dao.repositories;

import java.util.List;

/**
 * @author Lelental on 27.02.2017.
 */
public interface IGenericRepository<T, K> {

    List<T> findAll();

    void update(T entity);

    void delete(T entity);

    void add(T entity);

    T find(K key);


}

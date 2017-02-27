package dao.repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author Lelental on 27.02.2017.
 */
public interface IGenericDao<T extends Serializable> {

    T findOne(final long id);

    List<T> findAll();

    void save(final T entity);

    T update(final T entity);

    void delete(final T entity);

    void deleteById(final long id);

    List<T> findByText(String text, String columnName);
}

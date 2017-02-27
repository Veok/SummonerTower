package dao.repository;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author Lelental on 27.02.2017.
 */
@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class GenericJpaDao<T extends Serializable> extends AbstractDao<T> implements IGenericDao<T> {


    public GenericJpaDao(Class<T> entityClass) {
        super(entityClass);
    }
}

package summonerTower.service;

import summonerTower.dao.repositories.IGenericRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import summonerTower.service.services.IGenericService;

import java.util.List;

/**
 * @author Lelental on 27.02.2017.
 */
@Service
public class GenericService<T, K> implements IGenericService<T, K> {

    private IGenericRepository<T, K> genericDao;

    public GenericService(IGenericRepository<T, K> genericDao) {
        this.genericDao = genericDao;
    }

    public GenericService() {
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<T> findAll() {
        return genericDao.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void update(T entity) {
        genericDao.update(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(T entity) {
        genericDao.delete(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void add(T entity) {
        genericDao.add(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public T find(K key) {
        return genericDao.find(key);
    }
}

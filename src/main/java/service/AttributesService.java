package service;

import dao.AttributesRepository;
import dao.repositories.IGenericRepository;
import domain.model.Attributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Lelental on 02.03.2017.
 */
@Service
public class AttributesService extends GenericService<Attributes, Long> {

    private AttributesRepository attributesRepository;

    @Autowired
    public AttributesService(@Qualifier("attributesDao") IGenericRepository<Attributes, Long> genericDao) {
        super(genericDao);
        this.attributesRepository = (AttributesRepository) genericDao;
    }
}

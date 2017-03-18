package summonerTower.service;

import summonerTower.dao.AttributesRepository;
import summonerTower.dao.repositories.IGenericRepository;
import summonerTower.model.Attributes;
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
    public AttributesService(@Qualifier("attributesRepository") IGenericRepository<Attributes, Long> genericDao) {
        super(genericDao);
        this.attributesRepository = (AttributesRepository) genericDao;
    }
}

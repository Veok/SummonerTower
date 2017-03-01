package service;

import dao.ChampionRepository;
import dao.repositories.IGenericRepository;
import domain.model.Champion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.services.IChampionService;

/**
 * @author Lelental on 01.03.2017.
 */
@Service
public class ChampionService extends GenericService<Champion, Long> implements IChampionService {

    private ChampionRepository championRepository;


    @Autowired
    public ChampionService(@Qualifier("championDao") IGenericRepository<Champion, Long> genericDao) {
        super(genericDao);
        this.championRepository = (ChampionRepository) genericDao;
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public Champion findByName(String name) {
        return championRepository.findByName(name);
    }
}

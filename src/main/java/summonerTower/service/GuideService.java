package summonerTower.service;

import summonerTower.dao.GuideRepository;
import summonerTower.dao.repositories.IGenericRepository;
import summonerTower.model.Guide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import summonerTower.service.services.IGuideService;


import java.util.List;

/**
 * @author Lelental on 27.02.2017.
 */
@Service
public class GuideService extends GenericService<Guide, Long> implements IGuideService {

    private GuideRepository guideDao;

    @Autowired
    public GuideService(@Qualifier("guideRepository") IGenericRepository<Guide, Long> genericDao) {
        super(genericDao);
        this.guideDao = (GuideRepository) genericDao;
    }

    @Transactional
    public List<Guide> findByGuideName(String guideName) {
        return guideDao.findByGuideName(guideName);
    }

    @Transactional
    public List<Guide> findByChampionName(String championName) {
        return guideDao.findByChampionName(championName);
    }
}

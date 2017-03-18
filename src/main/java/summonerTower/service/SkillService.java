package summonerTower.service;

import summonerTower.dao.SkillRepository;
import summonerTower.dao.repositories.IGenericRepository;
import summonerTower.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import summonerTower.service.services.ISkillService;

/**
 * @author Lelental on 02.03.2017.
 */
@Service
public class SkillService extends GenericService<Skill, Long> implements ISkillService {

    private SkillRepository skillRepository;

    @Autowired
    public SkillService(@Qualifier("skillRepository") IGenericRepository<Skill, Long> genericDao) {
        super(genericDao);
        this.skillRepository = (SkillRepository) genericDao;
    }

    @Transactional
    public Skill findByName(String name) {
        return skillRepository.findByName(name);
    }
}

package service;

import dao.SkillRepository;
import dao.repositories.IGenericRepository;
import domain.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.services.ISkillService;

/**
 * @author Lelental on 02.03.2017.
 */
@Service
public class SkillService extends GenericService<Skill, Long> implements ISkillService {

    private SkillRepository skillRepository;

    @Autowired
    public SkillService(@Qualifier("skillDao") IGenericRepository<Skill, Long> genericDao) {
        super(genericDao);
        this.skillRepository = (SkillRepository) genericDao;
    }

    @Transactional
    public Skill findByName(String name) {
        return skillRepository.findByName(name);
    }
}

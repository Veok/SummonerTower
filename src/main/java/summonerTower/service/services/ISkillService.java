package summonerTower.service.services;

import summonerTower.dao.repositories.IGenericRepository;
import summonerTower.model.Skill;

/**
 * @author Lelental on 02.03.2017.
 */
public interface ISkillService extends IGenericRepository<Skill, Long> {

    Skill findByName(String name);
}

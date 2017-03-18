package summonerTower.dao.repositories;

import summonerTower.model.Skill;

/**
 * @author Lelental on 02.03.2017.
 */
public interface ISkillRepository extends IGenericRepository<Skill, Long> {

    Skill findByName(String name);
}

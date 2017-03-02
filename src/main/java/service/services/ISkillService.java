package service.services;

import dao.repositories.IGenericRepository;
import domain.model.Skill;

/**
 * @author Lelental on 02.03.2017.
 */
public interface ISkillService extends IGenericRepository<Skill, Long> {

    Skill findByName(String name);
}

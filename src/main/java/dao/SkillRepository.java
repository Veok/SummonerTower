package dao;

import dao.repositories.ISkillRepository;
import domain.model.Skill;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author Lelental on 02.03.2017.
 */
@Repository
@SuppressWarnings("JpaQlInspection")
public class SkillRepository extends GenericRepository<Skill, Long> implements ISkillRepository {

    public Skill findByName(String name) {
        Query query = (Query) getEntityManager()
                .createQuery("from domain.model.Skill where name=:name")
                .setParameter("name", name)
                .getSingleResult();

        return (Skill) query;
    }
}

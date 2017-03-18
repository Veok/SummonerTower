package summonerTower.dao;

import summonerTower.dao.repositories.ISpellRepository;
import summonerTower.model.Spell;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author Lelental on 02.03.2017.
 */
@Repository
@SuppressWarnings("JpaQlInspection")
public class SpellRepository extends GenericRepository<Spell, Long> implements ISpellRepository {

    public Spell findByName(String name) {
        Query query = (Query) getEntityManager()
                .createQuery("from domain.model.Spell where name=:name")
                .setParameter("name", name)
                .getSingleResult();

        return (Spell) query;
    }
}

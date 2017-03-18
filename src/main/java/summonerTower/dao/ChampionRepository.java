package summonerTower.dao;

import summonerTower.dao.repositories.IChampionRepository;
import summonerTower.model.Champion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


/**
 * @author Lelental on 28.02.2017.
 */
@Repository
@SuppressWarnings("JpaQlInspection")
public class ChampionRepository extends GenericRepository<Champion, Long> implements IChampionRepository {

    public Champion findByName(String name) {
        Query query = (Query) getEntityManager()
                .createQuery("from summonerTower.model.Champion where name=:name")
                .setParameter("name", name)
                .getSingleResult();
        return (Champion) query;
    }
}

package dao;

import dao.repositories.IChampionRepository;
import domain.model.Champion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


/**
 * @author Lelental on 28.02.2017.
 */
@Repository
public class ChampionRepository extends GenericRepository<Champion, Long> implements IChampionRepository {

    @SuppressWarnings("JpaQlInspection")
    public Champion findByName(String name) {
        Query query = (Query) getEntityManager()
                .createQuery("from domain.model.Champion where name=:name")
                .setParameter("name", name)
                .getSingleResult();
        return (Champion) query;
    }
}

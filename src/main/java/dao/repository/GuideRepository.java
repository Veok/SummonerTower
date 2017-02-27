package dao.repository;

import domain.model.Guide;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Lelental on 27.02.2017.
 */
@Repository
@SuppressWarnings("unchecked")
public class GuideRepository extends GenericRepository<Guide, Long> implements IGuideRepository {

    @SuppressWarnings("JpaQlInspection")
    public List<Guide> findByGuideName(String guideName) {
        Query query = (Query) getEntityManager()
                .createQuery("from domain.model.Guide " + "where nameOfGuide=:nameOfGuide")
                .setParameter("nameOfGuide", guideName)
                .getResultList();
        return (List<Guide>) query;
    }

    public List<Guide> findByChampionName(String championName) {
        Query query = (Query) getEntityManager()
                .createQuery("from domain.model.Guide " + "where championName.name=:championName")
                .setParameter("championName", championName)
                .getResultList();
        return (List<Guide>) query;
    }
}

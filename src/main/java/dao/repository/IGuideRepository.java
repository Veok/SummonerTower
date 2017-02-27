package dao.repository;

import domain.model.Guide;

import java.util.List;

/**
 * @author Lelental on 27.02.2017.
 */
public interface IGuideRepository extends IGenericRepository<Guide, Long> {


    List<Guide> findByGuideName(String guideName);

    List<Guide> findByChampionName(String championName);
}

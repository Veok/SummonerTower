package summonerTower.service.services;

import summonerTower.dao.repositories.IGenericRepository;
import summonerTower.model.Guide;

import java.util.List;

/**
 * @author Lelental on 27.02.2017.
 */
public interface IGuideService extends IGenericRepository<Guide, Long> {

    List<Guide> findByGuideName(String guideName);

    List<Guide> findByChampionName(String championName);
}

package summonerTower.service.services;

import summonerTower.dao.repositories.IGenericRepository;
import summonerTower.model.Champion;

/**
 * @author Lelental on 01.03.2017.
 */
public interface IChampionService extends IGenericRepository<Champion, Long> {

    Champion findByName(String name);

}

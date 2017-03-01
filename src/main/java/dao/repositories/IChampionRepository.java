package dao.repositories;

import domain.model.Champion;

/**
 * @author Lelental on 28.02.2017.
 */
public interface IChampionRepository extends IGenericRepository<Champion, Long> {

    Champion findByName(String name);
}

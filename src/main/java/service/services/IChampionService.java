package service.services;

import dao.repositories.IGenericRepository;
import domain.model.Champion;

/**
 * @author Lelental on 01.03.2017.
 */
public interface IChampionService extends IGenericRepository<Champion, Long> {

    Champion findByName(String name);

}

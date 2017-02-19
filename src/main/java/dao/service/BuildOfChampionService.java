package dao.service;

import domain.model.champion.Champion;
import domain.model.guide.BuildOfChampion;

import java.util.List;

/**
 * @author Lelental on 19.02.2017.
 */
public interface BuildOfChampionService {
    List<BuildOfChampion> findByChampion(Champion champion);

    BuildOfChampion findByName(String name);

    List<BuildOfChampion> findRecent();
}

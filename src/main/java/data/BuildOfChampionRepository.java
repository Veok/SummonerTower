package data;

import domain.model.guide.BuildOfChampion;

import java.util.List;

/**
 * @author Lelental on 13.02.2017.
 */
public interface BuildOfChampionRepository {
    List<BuildOfChampion> findBuild();
}

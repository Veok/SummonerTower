package data;

import domain.model.Guide;

import java.util.List;

/**
 * @author Lelental on 13.02.2017.
 */
public interface BuildOfChampionRepository {
    List<Guide> findBuild();

    Guide findOneById();
}

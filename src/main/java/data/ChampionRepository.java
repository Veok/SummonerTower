package data;

import domain.model.Champion;

import java.util.List;

/**
 * @author Lelental on 16.02.2017.
 */
public interface ChampionRepository {

    List<Champion> championList();
}

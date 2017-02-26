package dao;

import domain.model.Champion;
import domain.model.Guide;

import java.util.List;


/**
 * @author Lelental on 26.02.2017.
 */
public interface GuideRepository extends GenericDao<Guide, Long> {

    List<Guide> getGuideByChampionName(Champion champion);

    List<Guide> getGuideByName(String name);
}

package dao.service;

import domain.model.Guide;

/**
 * @author Lelental on 27.02.2017.
 */
public interface IGuideService {

    Guide findByGuideName(String guideName);

    Guide findBChampionName();
}

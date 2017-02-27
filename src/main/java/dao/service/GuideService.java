package dao.service;

import dao.repository.IGenericDao;
import domain.model.Guide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lelental on 27.02.2017.
 */
@Service
public class GuideService implements IGuideService {

    private IGenericDao<Guide> dao;

    @Autowired
    public void setDao(IGenericDao<Guide> dao) {
        this.dao = dao;
    }

    //TODO poprawić ten shit code//
    public Guide findByGuideName(String guideName) {
        return (Guide) dao.findByText("name", guideName);
    }

    public Guide findBChampionName() {
        return null;
    }
}

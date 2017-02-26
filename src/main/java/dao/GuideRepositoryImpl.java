package dao;

import domain.model.Champion;
import domain.model.Guide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.activation.DataSource;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lelental on 26.02.2017.
 */
@Repository
@Transactional
public class GuideRepositoryImpl extends GenericDaoImpl<Guide, Long> implements GuideRepository {

    @Inject
    private DataSource dataSource;

    public GuideRepositoryImpl() {
        super(Guide.class);
    }

    public List<Guide> getGuideByChampionName(Champion champion) {

        return null;
    }

    public List<Guide> getGuideByName(String name) {
        return null;
    }
}

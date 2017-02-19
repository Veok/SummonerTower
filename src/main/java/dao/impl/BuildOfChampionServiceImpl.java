package dao.impl;

import dao.BuildOfChampionRepository;
import dao.service.BuildOfChampionService;
import domain.model.champion.Champion;
import domain.model.guide.BuildOfChampion;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @author Lelental on 19.02.2017.
 */
public class BuildOfChampionServiceImpl implements BuildOfChampionService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<BuildOfChampion> findByChampion(Champion champion) {
        return null;
    }

    public BuildOfChampion findByName(String name) {
        return null;
    }

    public List<BuildOfChampion> findRecent() {
        return null;
    }
}

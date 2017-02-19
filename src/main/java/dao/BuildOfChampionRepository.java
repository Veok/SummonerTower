package dao;

import domain.model.champion.Champion;
import domain.model.guide.BuildOfChampion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Lelental on 19.02.2017.
 */
public interface BuildOfChampionRepository extends JpaRepository<BuildOfChampion, Long> {
}

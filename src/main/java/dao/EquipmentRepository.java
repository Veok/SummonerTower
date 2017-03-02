package dao;

import dao.repositories.IEquipmentRepository;
import domain.model.Equipment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Lelental on 02.03.2017.
 */
@Repository
@SuppressWarnings("JpaQlInspection")
public class EquipmentRepository extends GenericRepository<Equipment, Long> implements IEquipmentRepository {

    public Equipment findByName(String name) {
        Query query = (Query) getEntityManager()
                .createQuery("from domain.model.Equipment where name=:name")
                .setParameter("name", name)
                .getSingleResult();
        return (Equipment) query;
    }

    public List<Equipment> findByCost(int cost) {
        Query query = (Query) getEntityManager()
                .createQuery("from domain.model.Equipment where cost=:cost")
                .setParameter("cost", cost)
                .getResultList();
        return (List<Equipment>) query;
    }
}

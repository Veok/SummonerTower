package summonerTower.dao.repositories;

import summonerTower.model.Equipment;

import java.util.List;

/**
 * @author Lelental on 02.03.2017.
 */
public interface IEquipmentRepository extends IGenericRepository<Equipment, Long> {

    Equipment findByName(String name);

    List<Equipment> findByCost(int cost);
}

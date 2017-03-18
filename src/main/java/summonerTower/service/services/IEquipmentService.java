package summonerTower.service.services;

import summonerTower.model.Equipment;

import java.util.List;

/**
 * @author Lelental on 02.03.2017.
 */
public interface IEquipmentService extends IGenericService<Equipment, Long> {

    Equipment findByName(String name);

    List<Equipment> findByCost(int cost);
}

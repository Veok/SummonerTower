package service;

import dao.EquipmentRepository;
import dao.repositories.IGenericRepository;
import domain.model.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.services.IEquipmentService;

import java.util.List;

/**
 * @author Lelental on 02.03.2017.
 */
@Service
public class EquipmentService extends GenericService<Equipment, Long> implements IEquipmentService {

    private EquipmentRepository equipmentRepository;

    @Autowired
    public EquipmentService(@Qualifier("equipmentDao") IGenericRepository<Equipment, Long> genericDao) {
        super(genericDao);
        this.equipmentRepository = (EquipmentRepository) genericDao;
    }

    @Transactional
    public Equipment findByName(String name) {
        return equipmentRepository.findByName(name);
    }

    @Transactional
    public List<Equipment> findByCost(int cost) {
        return equipmentRepository.findByCost(cost);
    }
}

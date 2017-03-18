package summonerTower.service;

import summonerTower.dao.repositories.IGenericRepository;
import summonerTower.dao.SpellRepository;
import summonerTower.model.Spell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import summonerTower.service.services.ISpellService;

/**
 * @author Lelental on 02.03.2017.
 */
@Service
public class SpellService extends GenericService<Spell, Long> implements ISpellService {

    private SpellRepository spellRepository;

    @Autowired
    public SpellService(@Qualifier("spellRepository") IGenericRepository<Spell, Long> genericDao) {
        super(genericDao);
        this.spellRepository = (SpellRepository) genericDao;
    }

    @Transactional
    public Spell findByName(String name) {
        return spellRepository.findByName(name);
    }
}

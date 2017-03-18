package summonerTower.service.services;

import summonerTower.dao.repositories.IGenericRepository;
import summonerTower.model.Spell;

/**
 * @author Lelental on 02.03.2017.
 */
public interface ISpellService extends IGenericRepository<Spell, Long> {

    Spell findByName(String name);
}

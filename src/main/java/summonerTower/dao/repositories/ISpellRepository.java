package summonerTower.dao.repositories;

import summonerTower.model.Spell;

/**
 * @author Lelental on 02.03.2017.
 */
public interface ISpellRepository extends IGenericRepository<Spell, Long> {

    Spell findByName(String name);
}

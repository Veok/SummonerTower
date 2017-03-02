package service.services;

import dao.repositories.IGenericRepository;
import domain.model.Spell;

/**
 * @author Lelental on 02.03.2017.
 */
public interface ISpellService extends IGenericRepository<Spell, Long> {

    Spell findByName(String name);
}

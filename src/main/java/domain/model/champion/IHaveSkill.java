package domain.model.champion;

/**
 * @author: Lelental on 07.02.2017
 */
public interface IHaveSkill {

    PassiveSkill passiveSkill(String skillName, String description);
    ActiveSkill firstActiveSkill(String skillName, String description);
    ActiveSkill secondActiveSkill(String skillName, String description);
    ActiveSkill thirdActiveSkill(String skillName, String description);
    ActiveSkill ultimateSkill(String skillName, String description);
}

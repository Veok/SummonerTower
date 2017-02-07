package domain.model.champion;

/**
 * @author: Lelental on 07.02.2017
 */
public class Champion implements IHaveSkill {

    private String name;
    private String info;
    private Role role;
    private Position position;
    private AttributesOfChampion attributesOfChampion;


    public Champion() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public AttributesOfChampion getAttributesOfChampion() {
        return attributesOfChampion;
    }

    public void setAttributesOfChampion(AttributesOfChampion attributesOfChampion) {
        this.attributesOfChampion = attributesOfChampion;
    }

    public PassiveSkill passiveSkill(String skillName, String description) {
        return new PassiveSkill(skillName, description);
    }

    public ActiveSkill firstActiveSkill(String skillName, String description) {
        return new ActiveSkill(skillName, description);
    }

    public ActiveSkill secondActiveSkill(String skillName, String description) {
        return new ActiveSkill(skillName, description);
    }

    public ActiveSkill thirdActiveSkill(String skillName, String description) {
        return new ActiveSkill(skillName, description);
    }

    public ActiveSkill ultimateSkill(String skillName, String description) {
        return new ActiveSkill(skillName, description);
    }

}

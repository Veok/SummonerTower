package domain.model.champion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author : Lelental on 07.02.2017
 */
@Component
public class Champion {

    private String name;
    private String info;

    private Role role;
    private Position position;

    private AttributesOfChampion attributesOfChampion;
    private ActiveSkill firstActiveSkill;
    private ActiveSkill secondActiveSkill;
    private ActiveSkill thirdActiveSkill;
    private ActiveSkill ultimateSkill;
    private Skill passiveSkill;


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

    @Autowired
    public void setRole(Role role) {
        this.role = role;
    }

    public Position getPosition() {
        return position;
    }

    @Autowired
    public void setPosition(Position position) {
        this.position = position;
    }

    public AttributesOfChampion getAttributesOfChampion() {
        return attributesOfChampion;
    }

    @Autowired
    public void setAttributesOfChampion(AttributesOfChampion attributesOfChampion) {
        this.attributesOfChampion = attributesOfChampion;
    }

    public ActiveSkill getFirstActiveSkill() {
        return firstActiveSkill;
    }

    public void setFirstActiveSkill(ActiveSkill firstActiveSkill) {
        this.firstActiveSkill = firstActiveSkill;
    }

    public ActiveSkill getSecondActiveSkill() {
        return secondActiveSkill;
    }
    @Autowired
    public void setSecondActiveSkill(ActiveSkill secondActiveSkill) {
        this.secondActiveSkill = secondActiveSkill;
    }

    public ActiveSkill getThirdActiveSkill() {
        return thirdActiveSkill;
    }
    @Autowired
    public void setThirdActiveSkill(ActiveSkill thirdActiveSkill) {
        this.thirdActiveSkill = thirdActiveSkill;
    }

    public ActiveSkill getUltimateSkill() {
        return ultimateSkill;
    }
    @Autowired
    public void setUltimateSkill(ActiveSkill ultimateSkill) {
        this.ultimateSkill = ultimateSkill;
    }

    public Skill getPassiveSkill() {
        return passiveSkill;
    }
    @Autowired
    public void setPassiveSkill(Skill passiveSkill) {
        this.passiveSkill = passiveSkill;
    }
}

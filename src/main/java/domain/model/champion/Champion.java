package domain.model.champion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * @author : Lelental on 07.02.2017
 */
@Component
@Entity
public class Champion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String info;


    private Role role;
    private Position position;

    @OneToOne
    private AttributesOfChampion attributesOfChampion;
    @OneToOne
    private ActiveSkill firstActiveSkill;
    @OneToOne
    private ActiveSkill secondActiveSkill;
    @OneToOne
    private ActiveSkill thirdActiveSkill;
    @OneToOne
    private ActiveSkill ultimateSkill;
    @OneToOne
    private Skill passiveSkill;


    public Champion() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Enumerated(EnumType.STRING)
    public Role getRole() {
        return role;
    }

    @Autowired
    public void setRole(Role role) {
        this.role = role;
    }

    @Enumerated(EnumType.STRING)
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

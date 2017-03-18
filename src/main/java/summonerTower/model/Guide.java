package summonerTower.model;

import javax.persistence.*;
import java.util.List;

/**
 * @author : Lelental on 07.02.2017
 */

@Entity
public class Guide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nameOfGuide;
    @OneToMany
    private Champion championName;
    @OneToMany
    private Champion skills;
    @OneToOne
    private Role role;
    @OneToOne
    private Spell firstSpell;
    @OneToOne
    private Spell secondSpell;
    private List<Equipment> beginGameEquipments;
    private List<Equipment> middleGameEquipments;
    private List<Equipment> endGameEquipments;


    public Guide() {
    }

    public String getNameOfGuide() {
        return nameOfGuide;
    }

    public void setNameOfGuide(String nameOfGuide) {
        this.nameOfGuide = nameOfGuide;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Champion getChampionName() {
        return championName;
    }

    public void setChampionName(Champion championName) {
        this.championName = championName;
    }

    public Champion getSkills() {
        return skills;
    }

    public void setSkills(Champion skills) {
        this.skills = skills;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Spell getFirstSpell() {
        return firstSpell;
    }

    public void setFirstSpell(Spell firstSpell) {
        this.firstSpell = firstSpell;
    }

    public Spell getSecondSpell() {
        return secondSpell;
    }

    public void setSecondSpell(Spell secondSpell) {
        this.secondSpell = secondSpell;
    }

    public List<Equipment> getBeginGameEquipments() {
        return beginGameEquipments;
    }

    public void setBeginGameEquipments(List<Equipment> beginGameEquipments) {
        this.beginGameEquipments = beginGameEquipments;
    }

    public List<Equipment> getMiddleGameEquipments() {
        return middleGameEquipments;
    }

    public void setMiddleGameEquipments(List<Equipment> middleGameEquipments) {
        this.middleGameEquipments = middleGameEquipments;
    }

    public List<Equipment> getEndGameEquipments() {
        return endGameEquipments;
    }

    public void setEndGameEquipments(List<Equipment> endGameEquipments) {
        this.endGameEquipments = endGameEquipments;
    }
}

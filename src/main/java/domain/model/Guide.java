package domain.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * @author : Lelental on 07.02.2017
 */
@Component
@Entity
public class Guide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nameOfGuide;
    private Champion championName;
    private Champion skills;
    private Role role;
    private Spell firstSpell;
    private Spell secondSpell;
    private List<Item> beginGameItems;
    private List<Item> middleGameItems;
    private List<Item> endGameItems;


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

    @Autowired
    public void setChampionName(Champion championName) {
        this.championName = championName;
    }

    public Champion getSkills() {
        return skills;
    }

    @Autowired
    public void setSkills(Champion skills) {
        this.skills = skills;
    }

    @Autowired
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Spell getFirstSpell() {
        return firstSpell;
    }

    @Autowired
    public void setFirstSpell(Spell firstSpell) {
        this.firstSpell = firstSpell;
    }

    public Spell getSecondSpell() {
        return secondSpell;
    }

    @Autowired
    public void setSecondSpell(Spell secondSpell) {
        this.secondSpell = secondSpell;
    }

    public List<Item> getBeginGameItems() {
        return beginGameItems;
    }

    @Autowired
    public void setBeginGameItems(List<Item> beginGameItems) {
        this.beginGameItems = beginGameItems;
    }

    public List<Item> getMiddleGameItems() {
        return middleGameItems;
    }

    @Autowired
    public void setMiddleGameItems(List<Item> middleGameItems) {
        this.middleGameItems = middleGameItems;
    }

    public List<Item> getEndGameItems() {
        return endGameItems;
    }

    @Autowired
    public void setEndGameItems(List<Item> endGameItems) {
        this.endGameItems = endGameItems;
    }
}

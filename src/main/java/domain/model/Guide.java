package domain.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
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

    public List<Item> getBeginGameItems() {
        return beginGameItems;
    }

    public void setBeginGameItems(List<Item> beginGameItems) {
        this.beginGameItems = beginGameItems;
    }

    public List<Item> getMiddleGameItems() {
        return middleGameItems;
    }

    public void setMiddleGameItems(List<Item> middleGameItems) {
        this.middleGameItems = middleGameItems;
    }

    public List<Item> getEndGameItems() {
        return endGameItems;
    }

    public void setEndGameItems(List<Item> endGameItems) {
        this.endGameItems = endGameItems;
    }
}

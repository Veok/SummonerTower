package domain.model.guide;

import domain.model.champion.Champion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: Lelental on 07.02.2017
 */
@Component
public class BuildOfChampion implements IHaveItem {

    private Champion champion;
    private Spell firstSpell;
    private Spell secondSpell;
    private String author;
    private int points;

    public BuildOfChampion() {
    }
    @Autowired
    public List<Item> startItems() {
        return null;
    }
    @Autowired
    public List<Item> middleItems() {
        return null;
    }
    @Autowired
    public List<Item> finalItems() {
        return null;
    }

    public Champion getChampion() {
        return champion;
    }
    @Autowired
    public void setChampion(Champion champion) {
        this.champion = champion;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

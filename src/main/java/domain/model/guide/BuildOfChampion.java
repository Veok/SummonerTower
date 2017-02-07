package domain.model.guide;

import domain.model.champion.Champion;

import java.util.List;

/**
 * @author: Lelental on 07.02.2017
 */
public class BuildOfChampion implements IHaveItems{

    private Champion champion;
    private Spell firstSpell;
    private Spell secondSpell;
    private String author;
    private int points;

    public BuildOfChampion() {
    }

    public List<Item> startItems() {
        return null;
    }

    public List<Item> middleItems() {
        return null;
    }

    public List<Item> finalItems() {
        return null;
    }

    public Champion getChampion() {
        return champion;
    }

    public void setChampion(Champion champion) {
        this.champion = champion;
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

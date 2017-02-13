package domain.model.guide;

import domain.model.champion.Champion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : Lelental on 07.02.2017
 */
@Component
public class BuildOfChampion  {

    private String buildName;
    private Champion champion;
    private Spell firstSpell;
    private Spell secondSpell;
    private String author;
    private int points;
    private List<Item> startItems;
    private List<Item> middleItems;
    private List<Item> finalItems;

    public BuildOfChampion() {
    }


    public List<Item> getStartItems() {
        return startItems;
    }
    @Autowired
    public void setStartItems(List<Item> startItems) {
        this.startItems = startItems;
    }

    public List<Item> getMiddleItems() {
        return middleItems;
    }
    @Autowired
    public void setMiddleItems(List<Item> middleItems) {
        this.middleItems = middleItems;
    }

    public List<Item> getFinalItems() {
        return finalItems;
    }
    @Autowired
    public void setFinalItems(List<Item> finalItems) {
        this.finalItems = finalItems;
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

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }
}

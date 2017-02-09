package domain.model.champion;

import org.springframework.stereotype.Component;

/**
 * @author: Lelental on 07.02.2017
 */
@Component
public class ActiveSkill extends Skill {


    private int range;
    private int speed;
    private String manaCost;
    private String cooldown;

    public ActiveSkill(String name, String description) {
        super(name, description);
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getCooldown() {
        return cooldown;
    }

    public void setCooldown(String cooldown) {
        this.cooldown = cooldown;
    }
}

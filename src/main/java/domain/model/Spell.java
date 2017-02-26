package domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author : Lelental on 07.02.2017
 */
@Entity
public class Spell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int timeOfCooldown;
    private String description;

    public Spell() {
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

    public int getTimeOfCooldown() {
        return timeOfCooldown;
    }

    public void setTimeOfCooldown(int timeOfCooldown) {
        this.timeOfCooldown = timeOfCooldown;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

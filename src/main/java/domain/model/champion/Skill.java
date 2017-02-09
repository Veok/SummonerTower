package domain.model.champion;

import org.springframework.stereotype.Component;

/**
 * @author Lelental on 07.02.2017
 */
public class Skill {

    private String name;
    private String description;

    public Skill() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

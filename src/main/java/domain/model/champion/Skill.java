package domain.model.champion;

/**
 * @author Lelental on 07.02.2017
 */

public abstract class Skill {

    private String name;
    private String description;

    public Skill(String name, String description) {
        this.name = name;
        this.description = description;
    }

}

package summonerTower.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Lelental on 07.02.2017
 */
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private char skillKey;
    private TypeOfSkill typeOfSkill;

    public Skill() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public char getSkillKey() {
        return skillKey;
    }

    public void setSkillKey(char skillKey) {
        this.skillKey = skillKey;
    }

    public TypeOfSkill getTypeOfSkill() {
        return typeOfSkill;
    }

    public void setTypeOfSkill(TypeOfSkill typeOfSkill) {
        this.typeOfSkill = typeOfSkill;
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

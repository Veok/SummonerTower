package domain.model.champion;

import org.springframework.stereotype.Component;

/**
 * @author Lelental on 07.02.2017
 */
public class AttributesOfChampion {

    private double health;
    private double armor;
    private double healthRegeneration;
    private double magicResist;
    private double attackDamage;
    private double attackRange;
    private double attackSpeed;
    private double movementSpeed;

    public AttributesOfChampion(double health, double armor, double healthRegeneration, double magicResist, double attackDamage, double attackRange, double attackSpeed, double movementSpeed) {
        this.health = health;
        this.armor = armor;
        this.healthRegeneration = healthRegeneration;
        this.magicResist = magicResist;
        this.attackDamage = attackDamage;
        this.attackRange = attackRange;
        this.attackSpeed = attackSpeed;
        this.movementSpeed = movementSpeed;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getHealthRegeneration() {
        return healthRegeneration;
    }

    public void setHealthRegeneration(double healthRegeneration) {
        this.healthRegeneration = healthRegeneration;
    }

    public double getMagicResist() {
        return magicResist;
    }

    public void setMagicResist(double magicResist) {
        this.magicResist = magicResist;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(double attackRange) {
        this.attackRange = attackRange;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = movementSpeed;
    }
}

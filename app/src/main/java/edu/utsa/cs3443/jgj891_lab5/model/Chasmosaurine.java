package edu.utsa.cs3443.jgj891_lab5.model;

/**
 * Abstract class Chasmosaurine class.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
public abstract class Chasmosaurine implements Dinosaur {
    private String name;
    private boolean isVegetarian;

    public Chasmosaurine(String dinoName, boolean isVegetarian) {
        this.setName(dinoName);
        this.setVegetarian(isVegetarian);
    }
    public String toString() {
        String carnivoreStatus = (this.isVegetarian()) ? " (not carnivore)" : " (carnivore)";
        return getType() + " named " + getName() + carnivoreStatus;
    }

    /**
     *
     * @return string Chasmosaurine
     */
    public String getType() {
        return "Chasmosaurine: " + getSubType();
    }

    /**
     *
     * @return isVegetarian
     */
    public boolean isVegetarian() {
        return isVegetarian;
    }

    /**
     *
     * @param isVegetarian
     */
    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return subtype
     */
    public abstract String getSubType();
}

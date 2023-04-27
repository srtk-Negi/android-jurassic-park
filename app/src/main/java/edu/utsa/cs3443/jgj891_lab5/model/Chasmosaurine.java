package edu.utsa.cs3443.jgj891_lab5.model;

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
    public String getType() {
        return "* Chasmosaurine: " + getSubType();
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract String getSubType();
}

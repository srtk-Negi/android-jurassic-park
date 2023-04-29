package edu.utsa.cs3443.jgj891_lab5.model;
/**
 * The Gallimius class.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
public class Gallimimus extends Theropod {
    public Gallimimus(String name, boolean isVegetarian) {
        super(name, isVegetarian);
    }

    @Override
    public String getSubType() {
        return null;
    }
}

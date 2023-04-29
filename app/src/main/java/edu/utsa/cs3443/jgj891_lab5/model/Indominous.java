package edu.utsa.cs3443.jgj891_lab5.model;

/**
 * The Indominous class.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
public class Indominous extends Theropod {
    public Indominous(String name, boolean isVegetarian) {
        super(name, isVegetarian);
    }
    @Override
    public String getSubType() {
        return null;
    }
}

package edu.utsa.cs3443.jgj891_lab5.model;
/**
 * The Dilaphosaurus class.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
public class Dilophosaurus extends Theropod {
    public Dilophosaurus(String name, boolean isVegetarian) {
        super(name, isVegetarian);
    }

    /**
     *
     * @return subtype
     */
    @Override
    public String getSubType() {
        return null;
    }
}

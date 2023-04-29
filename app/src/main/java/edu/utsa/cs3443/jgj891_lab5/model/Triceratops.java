package edu.utsa.cs3443.jgj891_lab5.model;
/**
 * The Triceratops class.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
public class Triceratops extends Chasmosaurine {
    public Triceratops(String name, boolean isVegitarian){
        super(name,isVegitarian);
    }
    @Override
    public String getSubType() {
        return "Triceratops";
    }
}

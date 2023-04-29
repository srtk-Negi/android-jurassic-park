package edu.utsa.cs3443.jgj891_lab5.model;
/**
 * The Stegosaurus class.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
public class Stegosaurus extends Stegosaur{
	public Stegosaurus(String name, boolean isVegetarian){
		super(name, isVegetarian);
	}

	public String getSubType() {
		return("Stegosaurus");
	}
}

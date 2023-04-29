package edu.utsa.cs3443.jgj891_lab5.model;

/**
 * The Brachiosaurus class.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
public class Brachiosaurus extends Sauropod{
	public Brachiosaurus(String name, boolean isVegetarian) {
		super(name, isVegetarian);
	}

	/**
	 *
	 * @return string Brachiosaurus
	 */
	public String getSubType() {
		return("Brachiosaurus");
	}

}

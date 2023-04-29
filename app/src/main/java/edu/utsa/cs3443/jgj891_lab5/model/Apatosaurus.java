package edu.utsa.cs3443.jgj891_lab5.model;

/**
 * The Apatosaurus class.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
public class Apatosaurus extends Sauropod{
	public Apatosaurus(String name, boolean isVegetarian){
		super(name, isVegetarian);
	}

	/**
	 *
	 * @return string Apatosaurus
	 */
	public String getSubType() {
		return("Apatosaurus");
	}
}

package edu.utsa.cs3443.jgj891_lab5.model;
/**
 * The Velociraptor class.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
public class Velociraptor extends Theropod{
	public Velociraptor(String name, boolean isVegetarian){
		super(name, isVegetarian);
	}

	public String getSubType() {
		return("Velociraptor");
	}
}

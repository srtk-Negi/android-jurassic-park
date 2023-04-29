package edu.utsa.cs3443.jgj891_lab5.model;
/**
 * Abstract class Stegosaur.
 *
 * @author Sarthak Negi
 * UTSA CS 3443 - Lab 5
 * Spring 2023
 */
public abstract class Stegosaur implements Dinosaur{
	private String name;
	private boolean isVegetarian;

	public Stegosaur(String name, boolean isVegetarian){
		this.setName(name);
		this.setVegetarian(isVegetarian);
	}

	/**
	 *
	 * @return name
	 */
	public String getName() {
		return (name);
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
	 * @param isVegetarian
	 */
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}

	/**
	 *
	 * @return type of dinosaur
	 */
	public String getType() {
		return ("Stegosaur: "+this.getSubType());
	}

	/**
	 *
	 * @return is vegetarian or not
	 */
	public boolean isVegetarian() {
		return this.isVegetarian;
	}

	/**
	 *
	 * @return string representation of the dinosaur
	 */
	public String toString() {
		return(this.getType() +" named "+ this.getName()+" "+(this.isVegetarian()?"(not carnivore)":"(carnivore)"));
	}

	/**
	 *
	 * @return sub type
	 */
	public abstract String getSubType();
}

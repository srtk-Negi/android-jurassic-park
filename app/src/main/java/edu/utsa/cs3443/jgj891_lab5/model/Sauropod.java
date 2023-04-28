package edu.utsa.cs3443.jgj891_lab5.model;

public abstract class Sauropod implements Dinosaur {
	private String name;
	private boolean isVegetarian;

	public Sauropod (String name, boolean isVegetarian){
		this.setName(name);
		this.setVegetarian(isVegetarian);
	}

	public String getName() {
		return (name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}

	public String getType() {
		return ("Sauropod: "+this.getSubType());
	}

	public boolean isVegetarian() {
		return this.isVegetarian;
	}


	public String toString() {
		return(this.getType() +" named "+ this.getName()+" "+(this.isVegetarian()?"(not carnivore)":"(carnivore)"));
	}

	public abstract String getSubType();
}

package edu.utsa.cs3443.jgj891_lab5.model;

public class Triceratops extends Chasmosaurine {
    public Triceratops(String name, boolean isVegitarian){
        super(name,isVegitarian);
    }
    @Override
    public String getSubType() {
        return "Triceratops";
    }
}

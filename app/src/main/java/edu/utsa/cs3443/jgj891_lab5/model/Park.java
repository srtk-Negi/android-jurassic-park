package edu.utsa.cs3443.jgj891_lab5.model;
import android.content.res.AssetManager;

import androidx.annotation.NonNull;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import edu.utsa.cs3443.jgj891_lab5.MainActivity;

public class Park {
	String parkName;
	int dinoMaxCapacity;
	static int dinoCount = 0;
	static String ret = "";
	private HashMap<String, Boolean> dinoTypes;
	public static HashMap<String, Zone> zones;
	private MainActivity mainActivity;
	public Park(String parkName, MainActivity mainActivity) throws IOException {
		this.setParkName(parkName);
		this.setMainActivity(mainActivity);
		this.setDinoTypes();
		this.setZones();
		this.setPark(mainActivity);
	}
	private void setParkName(String parkName){
		this.parkName = parkName;
	}
	private void setDinoTypes(){
		this.dinoTypes = new HashMap<>();
	}
	private void setZones(){
		zones = new HashMap<>();
	}
	private void setMainActivity(MainActivity mainActivity){
		this.mainActivity = mainActivity;
	}
	public String getParkName(){return(this.parkName);}
	public HashMap<String, Boolean> getDinoTypes(){return(this.dinoTypes);}
	public HashMap<String, Zone> getZones(){return(this.getZones());}
	public MainActivity getMainActivity(){return(this.mainActivity);}
	public void addDino(String zoneName, Dinosaur dino) {
		zones.get(zoneName).getDinoList().add(dino);
	}
	public void addZone(String zoneName, Zone zone) {
		zones.put(zoneName, zone);
	}
	@NonNull
	public String toString() {
		String ret = "---------------------------- \n"
				+ "Welcome to" + this.getParkName() + "\n"
				+ "---------------------------- \n";
		for (Map.Entry<String, Zone> iterator : zones.entrySet()) {
			ret = ret.concat(iterator.toString());
		}
		return ret;
	}

	public Dinosaur determineDino(String dinoType, String dinoName) {
		Dinosaur dino = null;
		switch (dinoType) {
			case "Apatosaurus":
				dino = new Apatosaurus(dinoName, true);
				break;
			case "Brachiosaurus":
				dino = new Brachiosaurus(dinoName, true);
				break;
			case "Dilophosaurus":
				dino = new Dilophosaurus(dinoName, false);
				break;
			case "Gallimimus":
				dino = new Gallimimus(dinoName, false);
				break;
			case "Indominous":
				dino = new Indominous(dinoName, false);
				break;
			case "Stegosaurus":
				dino = new Stegosaurus(dinoName, true);
				break;
			case "Triceratops":
				dino = new Triceratops(dinoName, true);
				break;
			case "Tyrannosaurus":
				dino = new Tyrannosaurus(dinoName, false);
				break;
			default:
				dino = new Velociraptor(dinoName, false);
		}
		return dino;
	}


	public void setPark(MainActivity mainActivity) throws IOException {
		AssetManager am = mainActivity.getAssets();

		InputStream typeStream = am.open("types.csv");
		Scanner sc1 = new Scanner(typeStream);
		String[] input;
		while (sc1.hasNextLine()) {
			input = sc1.nextLine().split(",");
			System.out.println("Type: " + input[0]);
			this.dinoTypes.put(input[0], Boolean.parseBoolean(input[1]));
		}
		sc1.close();

		InputStream zoneStream = am.open("zones.csv");
		Scanner sc2 = new Scanner(zoneStream);
		while (sc2.hasNextLine()) {
			input = sc2.nextLine().split(",");
			Zone tempZone = new Zone(input[2], Integer.parseInt(input[3]));
			System.out.println(input[2]);
			this.addZone(input[2], tempZone);
		}
		sc2.close();

		InputStream dinoStream = am.open("dinos.csv");
		Scanner sc3 = new Scanner(dinoStream);
		while (sc3.hasNextLine()) {
			input = sc3.nextLine().split(",");
			Dinosaur dinosaur = determineDino(input[1], input[0]);
			this.addDino(input[2], dinosaur);
		}
		System.out.println(this.toString());
		sc3.close();
	}
}
/**
 * @author Celyn Johns - jvjohns1
 *  CIS175 - FALL 2023
 *  ${date}
 */

package model;

public abstract class AnimalMaker {
	// Define variables
	private String color;
	private String classType;
	private String habitat;
	private int age;
	
	// Default constructor
	public AnimalMaker() {
		this.color = "";
		this.classType = "";
		this.habitat = "";
		this.age = 0;
	}
	
	// Parameterized Constructor
	public AnimalMaker(String color, String kingdom, String habitat, int age) {
		this.color = color;
		this.classType = kingdom;
		this.habitat = habitat;
		this.age = age;
	}

	// Get and Set Color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Get and Set Class
	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	// Get and Set Habitat
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	// Get and Set Age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// to String
	public abstract String toString();
	
	// Animal Noise
	public abstract String makeNoise();
	
	//Animal Sleep
	public abstract String Sleep();
	
	//Animal move
	public abstract String Move();
	
	//Likely to kill you
	public abstract Boolean likelyToKillYou();
	
	
}

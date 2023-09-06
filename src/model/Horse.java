package model;

public class Horse extends AnimalMaker {

	// constructor
	public Horse(String color, String classType, String habitat, int age) {
		super(color, classType, habitat, age);
	}
	
	// to string
	@Override
	public String toString() {
		return "Horse [color=" + getColor() + ", class=" + getClassType() + ", habitat=" + getHabitat()
				+ ", age=" + getAge() + "]";
	}

	// make noise
	@Override
	public String makeNoise() {
		return "In response to a friendly pat, the horse affectionately snorts, showing its appreciation.";
	}

	// sleep
	@Override
	public String Sleep() {
		return "In its sleep, the horse playfully gallops through a meadow, chasing dreams of endless pastures and freedom.";
	}

	// move
	@Override
	public String Move() {
		return "With powerful strides, the horse gallops across the open meadow, wind ruffling its mane.";
	}

	// likely to kill
	@Override
	public Boolean likelyToKillYou() {
		return false;
	}
}

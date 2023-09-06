package model;

public class KomodoDragon extends AnimalMaker {

	// constructor
	public KomodoDragon(String color, String classType, String habitat, int age) {
		super(color, classType, habitat, age);
	}
	
	// to string
	@Override
	public String toString() {
		return "KomodoDragon [color=" + getColor() + ", class=" + getClassType() + ", habitat="
				+ getHabitat() + ", age=" + getAge() + "]";
	}

	// make noise
	@Override
	public String makeNoise() {
		return "the Komodo dragon bellows loudly, echoing through the dense forests.";
	}

	// sleep
	@Override
	public String Sleep() {
		return "The Komodo dragon rests peacefully under the shade of a tree, basking in the warmth of the sun.";
	}

	// move
	@Override
	public String Move() {
		return "The Komodo dragon ambles across the rocky terrain, its massive claws digging into the earth.";
	}

	// likely to kill
	@Override
	public Boolean likelyToKillYou() {
		return true;
	}

}

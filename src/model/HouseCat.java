package model;

public class HouseCat extends AnimalMaker {
	
	// constructor
	public HouseCat(String color, String classType, String habitat, int age) {
		super(color, classType, habitat, age);
	}

	// to string
	@Override
	public String toString() {
		return "HouseCat [color=" + getColor() + ", class=" + getClassType() + ", habitat="
				+ getHabitat() + ", age=" + getAge() + "]";
	}

	// make noise
	@Override
	public String makeNoise() {
		return "During a late-night adventure, the cat engages in a series of mysterious and quiet chirps.";
	}

	// sleep
	@Override
	public String Sleep() {
		return "With a soft purr, the cat nestles in a warm lap, finding comfort in the gentle rhythm of breathing.";
	}

	// move
	@Override
	public String Move() {
		return "The cat stretches leisurely, arching its back and extending its claws before sauntering away.";
	}

	// likely to kill
	@Override
	public Boolean likelyToKillYou() {
		return false;
	}

}

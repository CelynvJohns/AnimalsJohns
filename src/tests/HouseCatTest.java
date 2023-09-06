package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.HouseCat;

public class HouseCatTest {

	private HouseCat houseCat;

	@Before
	public void setUp() {
		houseCat = new HouseCat("Calico tabby", "Mammalia", "Inside where it's warm", 4);
	    }
	    

    @Test
    public void testToString() {
        String expectedToString = "HouseCat [color=Calico tabby, class=Mammalia, habitat=Inside where it's warm, age=4]";
        assertEquals(expectedToString, houseCat.toString());
    }
	    
	@Test
    public void testMakeNoise() {
        String expectedMakeNoise = "During a late-night adventure, the cat engages in a series of mysterious and quiet chirps.";
        assertEquals(expectedMakeNoise, houseCat.makeNoise());
    }

    @Test
    public void testMove() {
        String expectedMove = "The cat stretches leisurely, arching its back and extending its claws before sauntering away.";
        assertEquals(expectedMove, houseCat.Move());
    }

    @Test
    public void testSleep() {
        String expectedSleep = "With a soft purr, the cat nestles in a warm lap, finding comfort in the gentle rhythm of breathing.";
        assertEquals(expectedSleep, houseCat.Sleep());
    }
    

    @Test
    public void testLikelyToKillYou() {
        assertFalse(houseCat.likelyToKillYou());
    }

}


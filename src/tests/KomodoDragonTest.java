package tests;

import org.junit.Before;
import org.junit.Test;

import model.KomodoDragon;

import static org.junit.Assert.*;

public class KomodoDragonTest {

    private KomodoDragon komodoDragon;

    @Before
    public void setUp() {
        komodoDragon = new KomodoDragon("Grey", "Reptilia", "Forests of Komodo", 23);
    }

    @Test
    public void testToString() {
        String expectedToString = "KomodoDragon [color=Grey, class=Reptilia, habitat=Forests of Komodo, age=23]";
        assertEquals(expectedToString, komodoDragon.toString());
    }
    @Test
    public void testMakeNoise() {
        String expectedNoise = "the Komodo dragon bellows loudly, echoing through the dense forests.";
        assertEquals(expectedNoise, komodoDragon.makeNoise());
    }

    @Test
    public void testSleep() {
        String expectedSleep = "The Komodo dragon rests peacefully under the shade of a tree, basking in the warmth of the sun.";
        assertEquals(expectedSleep, komodoDragon.Sleep());
    }

    @Test
    public void testMove() {
        String expectedMove = "The Komodo dragon ambles across the rocky terrain, its massive claws digging into the earth.";
        assertEquals(expectedMove, komodoDragon.Move());
    }

    @Test
    public void testLikelyToKillYou() {
        assertTrue(komodoDragon.likelyToKillYou());
    }
}

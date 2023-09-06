package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Horse;

public class HorseTest {
	private Horse horse;

    @Before
    public void setUp() {
        horse = new Horse("Black and White", "Mammalia", "Grasslands", 12);
    }

    @Test
    public void testToString() {
        String expectedToString = "Horse [color=Black and White, class=Mammalia, habitat=Grasslands, age=12]";
        assertEquals(expectedToString, horse.toString());
    }

    @Test
    public void testMakeNoise() {
        String expectedMakeNoise = "In response to a friendly pat, the horse affectionately snorts, showing its appreciation.";
        assertEquals(expectedMakeNoise, horse.makeNoise());
    }

    @Test
    public void testSleep() {
        String expectedSleep = "In its sleep, the horse playfully gallops through a meadow, chasing dreams of endless pastures and freedom.";
        assertEquals(expectedSleep, horse.Sleep());
    }

    @Test
    public void testMove() {
        String expectedMove = "With powerful strides, the horse gallops across the open meadow, wind ruffling its mane.";
        assertEquals(expectedMove, horse.Move());
    }

    @Test
    public void testLikelyToKillYou() {
        assertFalse(horse.likelyToKillYou());
    }
}

package javafortester;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstJunitTest {

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }

    @Test
    public void canAddTwoMinesTwo() {
        int answer = 2 - 2;
        assertEquals("2-2=0", 0, answer);
    }

    @Test
    public void canAddTwoDivideTwo() {
        int answer = 4 / 2;
        assertEquals("4/2=2", 2, answer);
    }

    @Test
    public void canAddTwoMultiplyTwo() {
        int answer = 2 * 2;
        assertEquals("2*2=4", 4, answer);
    }
}

package org.jed.mars;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PlateauTest {

    @Test
    public void isOutOfBoundariesUpperLimit() {
        Plateau plateau = new Plateau(new Coordinates(3, 5));
        assertTrue(plateau.isOutOfBoundaries(new Coordinates(2,6)));
    }

    @Test
    public void isOutOfBoundariesLowerLimit() {
        Plateau plateau = new Plateau(new Coordinates(3, 5));
        assertTrue(plateau.isOutOfBoundaries(new Coordinates(2,-1)));
    }

    @Test
    public void isOutOfBoundariesLeftLimit() {
        Plateau plateau = new Plateau(new Coordinates(3, 5));
        assertTrue(plateau.isOutOfBoundaries(new Coordinates(-1,3)));
    }

    @Test
    public void isOutOfBoundariesRightLimit() {
        Plateau plateau = new Plateau(new Coordinates(3, 5));
        assertTrue(plateau.isOutOfBoundaries(new Coordinates(7,3)));
    }
}
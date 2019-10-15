package org.jed.mars;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class RobotTest {

    @Test
    public void testRobot() {
        Plateau plateau = new Plateau(new Coordinates(5, 3));
        Robot testRobot = new Robot(plateau, new Route("32N FRRFLLF"));
        assertThat(testRobot, is(notNullValue()));
        testRobot.move();
        assertThat(testRobot.isLost(), is(false));
        assertThat(testRobot.getCoordinates().x(), is(3));
        assertThat(testRobot.getCoordinates().y(), is(3));
    }

    @Test
    public void testLostRobotFromNorth() {
        Plateau plateau = new Plateau(new Coordinates(3, 5));
        Robot testRobot = new Robot(plateau, new Route("33N FFFLLF"));
        assertThat(testRobot, is(notNullValue()));
        testRobot.move();
        assertThat(testRobot.isLost(), is(true));
        assertThat(testRobot.getCoordinates().x(), is(3));
        assertThat(testRobot.getCoordinates().y(), is(5));
    }

    @Test
    public void testLostRobotFromSouth() {
        Plateau plateau = new Plateau(new Coordinates(3, 5));
        Robot testRobot = new Robot(plateau, new Route("31S FFFLRLF"));
        assertThat(testRobot, is(notNullValue()));
        testRobot.move();
        assertThat(testRobot.isLost(), is(true));
        assertThat(testRobot.getCoordinates().x(), is(3));
        assertThat(testRobot.getCoordinates().y(), is(0));
    }

    @Test
    public void testLostRobotFromEast() {
        Plateau plateau = new Plateau(new Coordinates(3, 5));
        Robot testRobot = new Robot(plateau, new Route("11E FFFLRLFRF"));
        assertThat(testRobot, is(notNullValue()));
        testRobot.move();
        assertThat(testRobot.isLost(), is(true));
        assertThat(testRobot.getCoordinates().x(), is(3));
        assertThat(testRobot.getCoordinates().y(), is(1));
    }

    @Test
    public void testLostRobotFromWest() {
        Plateau plateau = new Plateau(new Coordinates(3, 5));
        Robot testRobot = new Robot(plateau, new Route("31W FFFLRLFRF"));
        assertThat(testRobot, is(notNullValue()));
        testRobot.move();
        assertThat(testRobot.isLost(), is(true));
        assertThat(testRobot.getCoordinates().x(), is(0));
        assertThat(testRobot.getCoordinates().y(), is(0));
    }

}
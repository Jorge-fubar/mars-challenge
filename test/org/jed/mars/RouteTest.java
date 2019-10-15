package org.jed.mars;

import org.jed.mars.command.CommandParser;
import org.jed.mars.orientation.North;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class RouteTest {

    @Test
    public void getRoute() {
        Route route = new Route("32N\tFRRFLLF");
        assertThat(route.getCoords().x(), is(3));
        assertThat(route.getCoords().y(), is(2));
        assertThat(route.getOrientation(), is(instanceOf(North.class)));
        assertThat(route.getCommandList().size(), is(7));
        assertEquals(route.getCommandList(), Arrays.asList(CommandParser.fromString("F"),
                CommandParser.fromString("R"),
                CommandParser.fromString("R"),
                CommandParser.fromString("F"),
                CommandParser.fromString("L"),
                CommandParser.fromString("L"),
                CommandParser.fromString("F")));
    }
}
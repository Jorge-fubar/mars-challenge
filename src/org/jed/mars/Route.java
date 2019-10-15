package org.jed.mars;

import org.jed.mars.command.Command;
import org.jed.mars.command.CommandParser;
import org.jed.mars.orientation.Orientation;
import org.jed.mars.orientation.OrientationParser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Route {

    private final Coordinates coords;

    private final Orientation orientation;

    private final List<Command> commandList;

    public Route(String routeString) {
        String[] split = routeString.split("\\h");
        String[] coordAndOrientation = split[0].split("");
        this.coords = new Coordinates(Integer.parseInt(coordAndOrientation[0]), Integer.parseInt(coordAndOrientation[1]));
        this.orientation = OrientationParser.fromString(coordAndOrientation[2]);
        this.commandList = Arrays.stream(split[1].split("")).map(CommandParser::fromString).collect(Collectors.toList());
    }

    public Coordinates getCoords() {
        return coords;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public List<Command> getCommandList() {
        return commandList;
    }
}

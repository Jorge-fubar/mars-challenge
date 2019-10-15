package org.jed.mars;

import org.jed.mars.command.Command;
import org.jed.mars.orientation.Orientation;

public class Robot {

    private final Plateau plateau;

    private final Route route;

    private Coordinates coordinates;

    private Coordinates lastKnownCoordinates;

    private Orientation orientation;

    private boolean lost = false;

    public Robot(Plateau plateau, Route route) {
        this.plateau = plateau;
        this.route = route;
        this.coordinates = route.getCoords();
        this.lastKnownCoordinates = this.coordinates;
        this.orientation = route.getOrientation();
    }

    public void move() {
        if (lost) return;
        for (Command command : this.route.getCommandList()) {
            command.execute(this);
            if (plateau.isOutOfBoundaries(coordinates)) {
                lost = true;
                return;
            }
            lastKnownCoordinates = coordinates;
        }
    }

    public Coordinates getCoordinates() {
        return lastKnownCoordinates;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public boolean isLost() {
        return lost;
    }

    public void turnLeft() {
        orientation = orientation.turnLeft();
    }

    public void turnRight() {
        orientation = orientation.turnRight();
    }

    public void forward() {
        coordinates = orientation.move(coordinates);
    }
}

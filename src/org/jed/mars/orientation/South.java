package org.jed.mars.orientation;

import org.jed.mars.Coordinates;

public class South implements Orientation {

    protected South() {
    }

    @Override
    public Coordinates move(Coordinates currentPosition) {
        return new Coordinates(currentPosition.x(), currentPosition.y() - 1);
    }

    @Override
    public Orientation turnLeft() {
        return new East();
    }

    @Override
    public Orientation turnRight() {
        return new West();
    }

    @Override
    public String toString() {
        return "S";
    }
}

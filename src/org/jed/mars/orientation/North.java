package org.jed.mars.orientation;

import org.jed.mars.Coordinates;

public class North implements Orientation {

    protected North() {
    }

    @Override
    public Coordinates move(final Coordinates currentPosition) {
        return new Coordinates(currentPosition.x(), currentPosition.y() + 1);
    }

    @Override
    public Orientation turnLeft() {
        return new West();
    }

    @Override
    public Orientation turnRight() {
        return new East();
    }

    @Override
    public String toString() {
        return "N";
    }
}

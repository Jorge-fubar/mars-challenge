package org.jed.mars.orientation;

import org.jed.mars.Coordinates;

public class West implements Orientation {

    protected West() {
    }

    @Override
    public Coordinates move(Coordinates currentPosition) {
        return new Coordinates(currentPosition.x() - 1, currentPosition.y());
    }

    @Override
    public Orientation turnLeft() {
        return new South();
    }

    @Override
    public Orientation turnRight() {
        return new North();
    }

    @Override
    public String toString() {
        return "W";
    }
}

package org.jed.mars.orientation;

import org.jed.mars.Coordinates;

public class East implements Orientation {

    protected East() {
    }

    @Override
    public Coordinates move(Coordinates currentPosition) {
        return new Coordinates(currentPosition.x() + 1, currentPosition.y());
    }

    @Override
    public Orientation turnLeft() {
        return new North();
    }

    @Override
    public Orientation turnRight() {
        return new South();
    }

    @Override
    public String toString() {
        return "E";
    }
}

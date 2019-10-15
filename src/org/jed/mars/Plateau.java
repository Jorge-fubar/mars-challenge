package org.jed.mars;

public class Plateau {

    private final Coordinates topRightCorner;
    private final Coordinates bottomLeftCorner = new Coordinates(0, 0);

    public Plateau(Coordinates topRightCorner) {
        this.topRightCorner = topRightCorner;
    }

    public boolean isOutOfBoundaries(Coordinates coord) {
        return coord.x() > this.topRightCorner.x() || coord.y() > this.topRightCorner.y() ||
                coord.x() < this.bottomLeftCorner.x() || coord.y() < this.bottomLeftCorner.y();
    }
}

package org.jed.mars.orientation;

import org.jed.mars.Coordinates;

public interface Orientation {

    Coordinates move(Coordinates currentPosition);

    Orientation turnLeft();

    Orientation turnRight();

}

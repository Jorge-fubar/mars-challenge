package org.jed.mars;

public class Coordinates {

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    private int x;

    private int y;

    @Override
    public String toString() {
        return String.valueOf(x) + y;
    }
}

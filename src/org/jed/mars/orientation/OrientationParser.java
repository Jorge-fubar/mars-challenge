package org.jed.mars.orientation;

import java.util.HashMap;
import java.util.Map;

public class OrientationParser {
    private static Map<String, Orientation> orientationMap = new HashMap<String, Orientation>() {{
        put("E", new East());
        put("W", new West());
        put("N", new North());
        put("S", new South());
    }};

    public static Orientation fromString(String orientation) {
        return orientationMap.get(orientation);
    }

    private OrientationParser() {
    }
}

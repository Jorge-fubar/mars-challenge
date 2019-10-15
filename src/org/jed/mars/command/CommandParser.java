package org.jed.mars.command;

import java.util.HashMap;
import java.util.Map;

public class CommandParser {
    private static Map<String, Command> commandMap = new HashMap<String, Command>() {{
        put("F", new MoveForward());
        put("L", new TurnLeft());
        put("R", new TurnRight());
    }};

    public static Command fromString(String command) {
        return commandMap.get(command);
    }
}

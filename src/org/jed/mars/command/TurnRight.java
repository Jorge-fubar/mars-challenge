package org.jed.mars.command;

import org.jed.mars.Robot;

public class TurnRight implements Command {
    @Override
    public void execute(Robot robot) {
        robot.turnRight();
    }
}

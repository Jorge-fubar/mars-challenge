package org.jed.mars.command;

import org.jed.mars.Robot;

public class TurnLeft implements Command {

    @Override
    public void execute(Robot robot) {
        robot.turnLeft();
    }
}

package org.jed.mars.command;

import org.jed.mars.Robot;

public class MoveForward implements Command {

    @Override
    public void execute(Robot robot) {
        robot.forward();
    }
}

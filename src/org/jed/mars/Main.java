package org.jed.mars;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private Coordinates gridSize;

    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(Paths.get(args[0]))) {

            List<String> lines = stream.collect(Collectors.toList());
            Plateau plateau = getPlateauFromInput(lines.remove(0));
            for(String robotInput : lines) {
                Robot robot = new Robot(plateau, new Route(robotInput));
                robot.move();
                System.out.println(robot.getCoordinates().toString() +
                        robot.getOrientation().toString() +
                        (robot.isLost() ? "LOST" : ""));
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    private static Plateau getPlateauFromInput(String input) {
        String[] coords = input.split("");
        return new Plateau(new Coordinates(Integer.parseInt(coords[0]), Integer.parseInt(coords[1])));
    }

}

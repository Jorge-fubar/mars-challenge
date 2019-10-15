# Robots on Mars!
This is the implementation of the proposed exercise of moving a robot on Mar's surface

## Requirements
- The robots will move over a plateau divided as a grid, with the lower-left coordinate being (0,0)
and a variable upper-right limit, provided as input
- Each robot starts in a position with a given orientation
- A robot can process 3 different commands: forward (F), turn left (L) and turn right (R)
- First line odf the input contains the upper-right coordinates of the plateau
- Each of the next lines contain the robot position an instructions
- Output must be the a line per robot, indicating the final grid position and orientation,
followed by the word "LOST" if the robot fell off the edge of the plateau

## Approach
- The project is a simple Java project instead of a Maven project since the only 
required dependency is JUnit, and the application can be run by directly 
invoking the `main` method. It also contains various tests to check the logic of each
of the elements that encapsulates the required functionality.

- Initially, `Command` class was a simple enum that was used in the Robot class 
to check which of the possible values was being processed by the robot
and execute the Robot status change accordingly, directly on the Robot's `move` method.
But as the exercise specifies that we should provision for additional Commands that may be added 
in the future, I changed the approach to an interface, where every existing Command implements that 
interface. This 'cleans up' the process of each command inside the Robot's `move` method. 
The downsides of this approach are the coupling between the Commands and the Robot and the Robot's 
status change must be done as side effects inside each of the methods that reflect a command.

- I didn't want to have an anemic domain model, so I encapsulated the logic of 
coordinates and orientation variations inside each of the implementations of the
`Orientation` interface, instead of declaring `Orientation` as an enum with each of the 
possible values as a value of the enum.
This has the disadvantage of requiring to create instances of each orientation type, whether if 
Orientation was an enum this would be avoided, and the `OrientationFactory` class wouldn't
be necessary.

## Usage
Simply call the `main` method inside the `Main` class, providing a String with the input.
You can also import the project in your IDE and invoke the `main` method, or execute the test
in the `MainTest` class, providing the input that would like to test.

## TODO
- Sanitize the input
- Add exceptions for invalid inputs
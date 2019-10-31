package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class Robotgraffiti {
public static void main(String[] args) {
	Robot nlk = new Robot();
	nlk.setSpeed(100);
	nlk.penDown();
	nlk.move(100);
	nlk.move(200);
	nlk.move(-100);
	nlk.turn(90);
	nlk.move(100);
	nlk.turn(-90);
	nlk.move(100);
	nlk.turn(180);
	nlk.move(100);
	nlk.move(200);
}
}

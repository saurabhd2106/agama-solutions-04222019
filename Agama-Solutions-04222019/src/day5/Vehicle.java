package day5;

public class Vehicle {

	int gears;

	int speed;

	public void changeGears(int gears) {
		if (gears < 0 || gears > 6) {
			System.out.println("Invalid Gears");
		} else {
			this.gears = gears;
		}

	}

	public void changeSpeed(int speed) {
		if (speed < 0 || speed > 200) {
			System.out.println("Invalid Speed");
		} else {
			this.speed = speed;
		}

	}

}

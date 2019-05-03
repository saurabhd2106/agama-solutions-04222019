package day5;

public class MahindraTruck extends Truck{

	public void changeSpeed(int speed) {
		if (speed < 0 || speed > 250) {
			System.out.println("Invalid Speed");
		} else {
			this.speed = speed;
		}

	}

}

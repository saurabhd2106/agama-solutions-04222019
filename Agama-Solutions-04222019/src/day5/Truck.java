package day5;

public class Truck extends Vehicle {

	int steering;

	public void changeSteering(int steering) {
			if(steering <-180 || steering > 180){
				System.out.println("Invalid steering");
			} else {
				this.steering= steering;
			}
	}

}

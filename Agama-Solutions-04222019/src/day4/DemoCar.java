package day4;

import day5.Machine;

public class DemoCar {

	public static void main(String[] args) {

		Machine mac = new Machine(2000);

		mac.engineSize = 1990;
		mac.start();
		
		mac.stop();
		
		mac.accelerate();
		
		System.out.println("---------------------------------");
		
		Car car = new Car();
		
		car.start();
		
		car.restart();
		
		System.out.println("---------------------------------");
		Machine alto = new Car();
		
		alto.accelerate();
		
		alto.start();
		
	
		

	}

}

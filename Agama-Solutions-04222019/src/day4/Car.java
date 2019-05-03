package day4;

import day5.Machine;

public class Car extends Machine{
	
	int maxSpeed;
	
	public Car() {
		super(100);
		System.out.println("I am a constructor in car class");
	}
	
	public void restart(){
		System.out.println("Restart method from Car class");
		
		engineSize = 1000;
		accelerate();
	}

	public void decelerate(){
		System.out.println("Decelerate method from Car class");
	}
	
	public void start(){
		System.out.println("Start method from Car class");
	}


}

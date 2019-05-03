package day6;

import java.util.List;

public class DemoEmployee {
	
	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("Saurabh Dhingra", "abc@xyz.com");

		emp1.getEmployeeInfo();
		
		System.out.println(Employee.employeeId);

		Employee emp2 = new Employee("Binod Tiwari", "zse@xyz.com");

		emp2.getEmployeeInfo();
		
	
	}

}

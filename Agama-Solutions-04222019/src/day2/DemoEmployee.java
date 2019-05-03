package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee saurabh = new Employee();

		saurabh.setSalary(-20000);

		System.out.println(saurabh.getSalary());

		int salary = saurabh.calculateSalary();

		System.out.println("Salary :: " + salary);

		Employee manish = new Employee(899000, 5000);

		System.out.println(manish.calculateSalary());
	}

}

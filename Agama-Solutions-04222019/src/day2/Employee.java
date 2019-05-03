package day2;

public class Employee {

	private int salary;

	private int bonus;

	public void setSalary(int salary) {
		if (salary >= 0) {
			this.salary = salary;
		} else {
			System.err.println("Invalid salary");
		}

	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {

		if (bonus > 0) {
			this.bonus = bonus;
		} else {

			System.err.println("Invalid Bonus");
		}
	}

	public int getSalary() {
		return salary;
	}

	Employee() {
		System.out.println("I am a constructor");

		salary = 60000;
		bonus = 5000;
	}

	Employee(int salary, int bonus) {

		this.salary = salary;

		this.bonus = bonus;

	}

	int calculateSalary() {
		int totalSalary = salary + bonus;

		return totalSalary;
	}

}

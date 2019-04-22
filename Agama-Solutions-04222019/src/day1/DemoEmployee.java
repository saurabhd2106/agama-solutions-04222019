package day1;

public class DemoEmployee {

	public static void main(String[] args) {
		
		//Declaring a variable
		Employee saurabh;
		
		
		//Instantiation and Initialize
		saurabh = new Employee();
		
		saurabh.salary = 7894324;
		
		saurabh.bonus = 432847;
		
		saurabh.calculateSalary();
		
		//-------------------------------------------------------
		
		System.out.println("--------------------------------------------------");
		
		Employee deepika = new Employee();
		
		deepika.salary = 424324;
		
		deepika.bonus = 78798;
		
		deepika.calculateSalary();
		
		System.out.println("-----------------------------------------------------");
		
		Employee ahmet = new Employee();
		
		ahmet.salary = 700000;
		
		ahmet.bonus = 80000;
		
		int ahmetSalary = ahmet.calculateSalary1();

		System.out.println("Ahmet's Salary :: "+ ahmetSalary);
		
		System.out.println("-----------------------------------------------------");
		
		Employee manish = new Employee();
		
		int manishSalary = manish.calculateSalary2(80000, 30000);
		
		System.out.println("Salary of Manish : "+ manishSalary);
		
		System.out.println("-----------------------------------------------------");
		
		
		Employee binod = new Employee();
		
		binod.salary = 900000;
		
		binod.bonus = 899999;
		
		binod.calculateSalary2(3000000, 800000);
		
		
	}

}

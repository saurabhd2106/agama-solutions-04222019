package day6;

public class Employee {
	
	String employeeName;
	
	String employeeEmailId;
	
	static int employeeId;
	
	final  String ORG_NAME ;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		System.out.println("I am in static block");
		employeeId = 2000;
		
	}
	
	{
		
		ORG_NAME = "QA Tech Hub";
	}
	
	public Employee(String employeeName, String employeeEmailId) {
		
		System.out.println("I am a constructor");
		this.employeeEmailId = employeeEmailId;
		
		this.employeeName = employeeName;
		
		String.valueOf(employeeId);
		
		setEmployeeId();
	}
	
	private void setEmployeeId(){
		employeeId = employeeId + 1;
	}
	
	public void getEmployeeInfo(){
		System.out.println("Employee name : "+ employeeName);
		System.out.println("Employee Email Id : "+ employeeEmailId);
		System.out.println("Employee Id : "+ employeeId);
	}

}

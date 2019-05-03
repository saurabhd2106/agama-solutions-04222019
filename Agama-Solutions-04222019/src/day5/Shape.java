package day5;

public class Shape {

	public double area(int side) {
		double area = side * side;

		return area;

	}
	
	public int area(int side, double rat) {
		int area = side * side;

		return area;

	}
	
	public double area(int len, int wid) {
		double area = len * wid;

		return area;

	}
	
	public double area(double side) {
		double area = Math.PI * side * side;

		return area;

	}
	
	public static void main(String[] args) {
		Shape sqr = new Shape();
		
		System.out.println(sqr.area(12));
		
		System.out.println("-------------------------------------");
		
		Shape cir = new Shape();
		
		System.out.println(cir.area(10.5));
	
	}

}

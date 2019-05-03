package day6;

public class DemoShape {
	
	public static void main(String[] args) {
		Shape cuboid = new Cuboid();
		
		System.out.println(cuboid.calculateVolume(10, 10));
		
		Shape cyl = new Cylinder();
		
		System.out.println(cyl.calculateVolume(10, 10));
	}

}

package day6;

public class ExceptionExample {

	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 13;
		arr[2] = 15;
		arr[3] = 17;
		arr[4] = 19;

		try {

			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured");

		} catch (Exception e) {
			System.out.println("Exception occured");

		} finally {
			System.out.println("I execute always");
		}

		System.out.println("After exception");
	}

}

package day7;

public class Guru99Project {

	public void invokeBrowser(String browserType) throws Exception{
		if(browserType.equals("chrome")){
			
		} else if(browserType.equals("edge")) {
			
		} else if(browserType.equals("firefox")) {
			
		} else {
			throw new Exception("Invalid Browser");
		}
	}

	public void login() throws Exception {

		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 13;
		arr[2] = 15;
		arr[3] = 17;
		arr[4] = 19;

		for (int i = 0; i <= 5; i++) {
			System.out.println(arr[i]);
		}

	}

	public void addCustomer() {
		System.out.println("add customer");
	}

	public void addAccount() {
		System.out.println("Add account");
	}

	public void closeBrowser() {
		System.out.println("Close Browser");
	}

}

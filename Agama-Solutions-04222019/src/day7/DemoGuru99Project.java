package day7;

public class DemoGuru99Project {

	public static void main(String[] args) {
		Guru99Project guru = new Guru99Project();

		try {
			guru.invokeBrowser("");

			guru.login();

			guru.addCustomer();

			guru.addAccount();

			guru.closeBrowser();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}

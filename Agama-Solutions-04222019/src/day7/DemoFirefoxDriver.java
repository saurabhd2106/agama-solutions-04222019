package day7;

public class DemoFirefoxDriver {

	public static void main(String[] args) {
		WorkingWithFirefox wf = new WorkingWithFirefox();

		wf.invokeBrowser();

		wf.navigateCommands();

		wf.printTitleOfThePage();
		wf.closeBrowser();

	}

}

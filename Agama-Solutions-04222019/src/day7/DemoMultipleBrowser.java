package day7;

public class DemoMultipleBrowser {

	public static void main(String[] args) {
		MultipleBrowserTesting mb = new MultipleBrowserTesting();
		
		try {
			mb.invokeBrowser("edge");
			
			mb.navigateCommands();
			
			mb.printTitleOfThePage();
			
			mb.closeBrowser();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}

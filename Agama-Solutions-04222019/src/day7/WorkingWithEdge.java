package day7;

import org.openqa.selenium.edge.EdgeDriver;

public class WorkingWithEdge {

	EdgeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.edge.driver", "C:/Users/Saurabh Dhingra/workspace/libs/MicrosoftWebDriver.exe");

		driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://qatechhub.com");

	}

	public void printTitleOfThePage() {
		String titleOfThePage = driver.getTitle();

		System.out.println("Title of the page :: " + titleOfThePage);
	}

	public void navigateCommands() {
		driver.navigate().to("http://facebook.com");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();
	}

	public void closeBrowser() {
		// closes the current active window
		// driver.close();

		// closes all the windows open by selenium session
		driver.quit();
	}
}

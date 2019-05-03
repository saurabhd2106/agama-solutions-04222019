package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Guru99Project {

	ChromeDriver driver;

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Saurabh Dhingra/workspace/libs/chromedriver_06042019/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/v4/");

	}

	public void closeBrowser() {

		driver.quit();
	}

	public void login(String sUserId, String sPassword) {
		WebElement userId;

		userId = driver.findElement(By.name("uid"));

		userId.sendKeys(sUserId);

		driver.findElement(By.name("password")).sendKeys(sPassword);

		driver.findElement(By.name("btnLogin")).click();

	}

	public void addCustomer() {
		
		waitTillElementVisible(By.linkText("New Customer"), 10);
		
		driver.findElement(By.linkText("New Customer")).click();

		String emailId = "ss" + System.currentTimeMillis() + "@abc.com";

	}

	public void addAccount(String customerId) {

		WebElement dropdown = driver.findElement(By.name("selaccount"));

		Select selAccount = new Select(dropdown);

		selAccount.selectByVisibleText("Current");

	}
	
	public void waitTillElementVisible(By locator, int timeoutInSeconds){

		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
}

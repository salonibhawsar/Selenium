import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//timouts using selenium
public class WaitingMechanismDemo {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();

		// selenium implicit wait --- Global Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// 0 seconds -> clicked immediately
		driver.findElement(By.className("dropbtn")).click();

		// 3 seconds --> here it will wait for only 3 seconds
		// driver.findElement(By.linkText("Facebook")).click();

		// 30 seconds of wait time ---> Explicit Wait --> 1) WebDriverWait() and 2)
		// FluentWait()

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement facbookElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));

		// or check the button is clickble or not

		facbookElement = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));

		facbookElement.click();
		driver.quit();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMoveElementExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.omayo.blogspot.com");

		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.id("blogsmenu"))).perform(); // moveElement()

		WebElement S = driver.findElement(By.linkText("Selenium143"));
		// a.moveToElement(S).perform();

		// a.click(S).perform(); // click() ,perform()

		// optimize the same code using build()

		a.moveToElement(S).click(S).build().perform();

		Thread.sleep(2000);

		driver.quit();
	}

}

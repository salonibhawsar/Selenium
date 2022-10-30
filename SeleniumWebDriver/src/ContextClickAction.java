import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickAction {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.omayo.blogspot.com");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement searchBoxField = driver.findElement(By.name("q"));

		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.contextClick(searchBoxField).perform(); //right click
		Thread.sleep(3000);
		searchBoxField.sendKeys("Saloni");
		a.doubleClick(searchBoxField).perform();//double click
		driver.quit();

	}

}

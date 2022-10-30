import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByAction {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/p/page3.html");

		driver.manage().window().maximize();

		Thread.sleep(3000);
		Actions a = new Actions(driver);

		WebElement startButton = driver.findElement(By.cssSelector("a[class$='ui-btn-null']"));

		a.dragAndDropBy(startButton, 100, 0).perform();
	}

}

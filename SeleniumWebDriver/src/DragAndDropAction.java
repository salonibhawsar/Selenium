import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		Thread.sleep(2000);

		WebElement osloBox = driver.findElement(By.id("box1"));

		WebElement norWayBox = driver.findElement(By.id("box101"));

		Actions actions = new Actions(driver);

		actions.dragAndDrop(osloBox, norWayBox).perform();
		
		Thread.sleep(2000);
		
		driver.quit();

	}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LightBoxHandling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\INDIAN\\eclipse-workspace\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/p/lightbox.html");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// lightbox handling
		driver.findElement(By.id("lightbox1")).click();

		Thread.sleep(3000);

		//code for closing the lightbox (inspect the cursor)
		driver.findElement(By.cssSelector("span[class$='cursor']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
